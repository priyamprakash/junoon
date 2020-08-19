package com.mitm.junoon.Extra;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.mitm.junoon.R;



public class CallActivity extends AppCompatActivity{
    Button btnphncall;
    EditText edtphncall;
    String  telNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.extra_place_call);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        edtphncall=findViewById(R.id.edtphncall);
        btnphncall=findViewById(R.id.btnphncall);
        btnphncall.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intentCall=new Intent(Intent.ACTION_CALL);
                        telNum=edtphncall.getText().toString();
                       //default phone no. , called when the edit text is empty n user places call
                        if(telNum.trim().isEmpty())
                        {
                            Intent intent = intentCall.setData(Uri.parse("tel:567788"));
                        }
                        else
                        {
                            intentCall.setData(Uri.parse("tel:"+telNum));
                        }

                        if(ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED)
                        {
                            Toast.makeText(getApplicationContext(),"Please grant permission",Toast.LENGTH_SHORT).show();
                            requestPermission();
                        }
                        else
                        {
                            startActivity(intentCall);
                        }

                    }
                    //uses- permission PHONE CALLS
                    private void requestPermission() {
                        ActivityCompat.requestPermissions(CallActivity.this,
                                new String[]{Manifest.permission.CALL_PHONE},1);
                    }
                });
    }
}