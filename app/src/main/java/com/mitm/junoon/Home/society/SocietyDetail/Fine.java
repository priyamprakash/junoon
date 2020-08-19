package com.mitm.junoon.Home.society.SocietyDetail;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.mitm.junoon.R;

public class Fine extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.society_fine);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    public void mail(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/VQqBrsvcR1vbawnd9"));
        startActivity(browserIntent);
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);

    }


}