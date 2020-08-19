package com.mitm.junoon.Home.AppTheme;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.mitm.junoon.PostListActivity;
import com.mitm.junoon.R;


public class AppTheme  extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.app_theme);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);



        toolbar=findViewById(R.id.toolbarCustom);
        setSupportActionBar(toolbar);
       ImageView imageView1 =  findViewById(R.id.imageView1);
       Glide.with(this).load("https://i.ibb.co/QNq50BN/exp1-2.jpg").placeholder(R.drawable.junooncircle).into(imageView1);

        ImageView imageView2 =  findViewById(R.id.imageView2);
        Glide.with(this).load("https://i.ibb.co/ChRYTNL/bani-f.jpg").placeholder
                (R.drawable.junooncircle).into(imageView2);

        ImageView imageView3 =  findViewById(R.id.imageView3);
        Glide.with(this).load("https://i.ibb.co/Y3wYmJB/bani-e.jpg").placeholder(R.drawable.junooncircle).into(imageView3);







    }
    public void tukka(View view){
        Intent intent = new Intent(getBaseContext(), PostListActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
    }


    public void rate(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=com.mitm.junoon"));
        startActivity(browserIntent);

    }

    public void share(View view){
        Intent shareintent = new Intent(Intent.ACTION_SEND);
        shareintent.setType("text/plain");
        String shareBody = "Download this Application now :- http://play.google.com/store/apps/details?id=com.mitm.junoon&hl=en";
        String sharesub="JUNOON";
        shareintent.putExtra(Intent.EXTRA_SUBJECT,sharesub);
        shareintent.putExtra(Intent.EXTRA_TEXT,shareBody);
        startActivity(Intent.createChooser(shareintent,"Share Using:"));

    }
}