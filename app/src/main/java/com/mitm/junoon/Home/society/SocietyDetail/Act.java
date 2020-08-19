package com.mitm.junoon.Home.society.SocietyDetail;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.mitm.junoon.R;

public class Act extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.society_acting);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }


    public void mail(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/4JU1PgrWzuUFVAvy8"));
        startActivity(browserIntent);


    }
  /*  @Override
    public void onBackPressed() {
        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
        startActivity(intent);
    }
*/
}

