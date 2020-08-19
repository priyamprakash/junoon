package com.mitm.junoon.Home.Achievements;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.mitm.junoon.PostListActivity;
import com.mitm.junoon.R;


public class Achievements extends AppCompatActivity{

    static final int NUM_ITEMS = 6;
    ImageFragmentPagerAdapter imageFragmentPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.achievements);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        imageFragmentPagerAdapter = new ImageFragmentPagerAdapter(getSupportFragmentManager());



        ImageView imageView1 =  findViewById(R.id.imageView1);
        Glide.with(this).load("https://i.ibb.co/tJs1xqx/a1.jpg").placeholder(R.drawable.junooncircle).into(imageView1);

        ImageView imageView2 =  findViewById(R.id.imageView2);
        Glide.with(this).load("https://i.ibb.co/F0182KW/a2.jpg").placeholder(R.drawable.junooncircle).into(imageView2);

        ImageView imageView3 =  findViewById(R.id.imageView3);
        Glide.with(this).load("https://i.ibb.co/p0r8L15/a5.jpg").placeholder(R.drawable.junooncircle).into(imageView3);

        ImageView imageView4 =  findViewById(R.id.imageView4);
        Glide.with(this).load("https://i.ibb.co/CQ6LdV9/a6.jpg").placeholder(R.drawable.junooncircle).into(imageView4);

        ImageView imageView5 =  findViewById(R.id.imageView5);
        Glide.with(this).load("https://i.ibb.co/CsgP5s1/a8.jpg").placeholder(R.drawable.junooncircle).into(imageView5);



        ImageView imageView6 =  findViewById(R.id.imageView6);
        Glide.with(this).load("https://i.ibb.co/4dttQCd/a4.jpg").placeholder(R.drawable.junooncircle).into(imageView6);

        ImageView imageView7 =  findViewById(R.id.imageView7);
        Glide.with(this).load("https://i.ibb.co/QP4qFRy/a7.jpg").placeholder(R.drawable.junooncircle).into(imageView7);

        ImageView imageView8 =  findViewById(R.id.imageView8);
        Glide.with(this).load("https://i.ibb.co/HCCvQK5/a10.jpg").placeholder(R.drawable.junooncircle).into(imageView8);

        ImageView imageView9 =  findViewById(R.id.imageView9);
        Glide.with(this).load("https://i.ibb.co/SJDj6zQ/a13.jpg").placeholder(R.drawable.junooncircle).into(imageView9);

        ImageView imageView10 =  findViewById(R.id.imageView10);
        Glide.with(this).load("https://i.ibb.co/7rLrkTJ/a9.jpg").placeholder(R.drawable.junooncircle).into(imageView10);

        ImageView imageView11 =  findViewById(R.id.imageView11);
        Glide.with(this).load("https://i.ibb.co/7jckC2j/a11.jpg").placeholder(R.drawable.junooncircle).into(imageView11);

      ImageView imageView12 =  findViewById(R.id.imageView12);
        Glide.with(this).load("https://i.ibb.co/VC8CrGC/a12.jpg").placeholder(R.drawable.junooncircle).into(imageView12);

      ImageView imageView14 =  findViewById(R.id.imageView14);
        Glide.with(this).load("https://i.ibb.co/W3zyQvP/a12asli.jpg").placeholder(R.drawable.junooncircle).into(imageView14);




        ImageView img6 =  findViewById(R.id.img6);
        Glide.with(this).load("https://i.ibb.co/bzYbb8B/ayush-IIT.jpg").placeholder(R.drawable.junooncircle).into(img6);

        ImageView imageView62 =  findViewById(R.id.img62);
        Glide.with(this).load("https://i.ibb.co/9bBd9Gq/ayush-ism.jpg").placeholder(R.drawable.junooncircle).into(imageView62);

      ImageView imageView64 =  findViewById(R.id.img64);
        Glide.with(this).load("https://i.ibb.co/C1N4HSZ/girls.jpg").placeholder(R.drawable.junooncircle).into(imageView64);



    }
    //notifications
    public void tukka(View view){
        Intent intent = new Intent(getBaseContext(), PostListActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
    }
}
