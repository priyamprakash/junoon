package com.mitm.junoon.Home.Events.EventDetail;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.mitm.junoon.PostListActivity;
import com.mitm.junoon.R;


public class fiestaone  extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events_fiestaone);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ImageView imageView200 =  findViewById(R.id.imageView200);
        Glide.with(this).load("https://i.ibb.co/1vD9F2w/finalgif.gif").placeholder(R.drawable.junooncircle).into(imageView200);

        ImageView imageView400 =  findViewById(R.id.imageView400);
        Glide.with(this).load("https://i.ibb.co/6wj3J2B/f18.jpg").placeholder(R.drawable.junooncircle).into(imageView400);


        //------glimpses-----

        ImageView saumya =  findViewById(R.id.saumya);
        Glide.with(this).load("https://i.ibb.co/KFrXs4K/Saymya1.jpg").placeholder(R.drawable.junooncircle).into(saumya);

        ImageView imageView1 =  findViewById(R.id.imageView1);
        Glide.with(this).load("https://i.ibb.co/jRMnW1m/1.jpg").placeholder(R.drawable.junooncircle).into(imageView1);

        ImageView imageView2 =  findViewById(R.id.img2);
        Glide.with(this).load("https://i.ibb.co/QQRqc3B/2.jpg").placeholder(R.drawable.junooncircle).into(imageView2);

        ImageView imageView3 =  findViewById(R.id.imageView3);
        Glide.with(this).load("https://i.ibb.co/L9cJmBS/3.jpg").placeholder(R.drawable.junooncircle).into(imageView3);

        ImageView imageView4 =  findViewById(R.id.imageView4);
        Glide.with(this).load("https://i.ibb.co/R3m3MN3/4.jpg").placeholder(R.drawable.junooncircle).into(imageView4);

        ImageView imageView5 =  findViewById(R.id.imageView5);
        Glide.with(this).load("https://i.ibb.co/T193TN8/5.jpg").placeholder(R.drawable.junooncircle).into(imageView5);

        ImageView imageView6 =  findViewById(R.id.imageView6);
        Glide.with(this).load("https://i.ibb.co/WPT8H76/6.jpg").placeholder(R.drawable.junooncircle).into(imageView6);

        ImageView imageView7 =  findViewById(R.id.imageView7);
        Glide.with(this).load("https://i.ibb.co/wYY2MYY/7.jpg").placeholder(R.drawable.junooncircle).into(imageView7);

        ImageView imageView8 =  findViewById(R.id.imageView8);
        Glide.with(this).load("https://i.ibb.co/3C0sSrh/8.jpg").placeholder(R.drawable.junooncircle).into(imageView8);

        ImageView imageView9 =  findViewById(R.id.imageView9);
        Glide.with(this).load("https://i.ibb.co/3TDDGHp/9.jpg").placeholder(R.drawable.junooncircle).into(imageView9);

        ImageView imageView10 =  findViewById(R.id.imageView10);
        Glide.with(this).load("https://i.ibb.co/CWDqyn8/10.jpg").placeholder(R.drawable.junooncircle).into(imageView10);

        ImageView imageView11 =  findViewById(R.id.imageView11);
        Glide.with(this).load("https://i.ibb.co/YXVPTMX/11.jpg").placeholder(R.drawable.junooncircle).into(imageView11);

        ImageView imageView12 =  findViewById(R.id.imageView12);
        Glide.with(this).load("https://i.ibb.co/YdXCWd2/12.jpg").placeholder(R.drawable.junooncircle).into(imageView12);

        ImageView imageView13 =  findViewById(R.id.imageView13);
        Glide.with(this).load("https://i.ibb.co/SrgGZFT/13.jpg").placeholder(R.drawable.junooncircle).into(imageView13);

        ImageView imageView14 =  findViewById(R.id.imageView14);
        Glide.with(this).load("https://i.ibb.co/tssBNFH/14.jpg").placeholder(R.drawable.junooncircle).into(imageView14);

         ImageView imageView15 =  findViewById(R.id.imageView15);
        Glide.with(this).load("https://i.ibb.co/2PKpPBM/15.jpg").placeholder(R.drawable.junooncircle).into(imageView15);

         ImageView imageView16 =  findViewById(R.id.imageView16);
        Glide.with(this).load("https://i.ibb.co/QPrwxrc/16.jpg").placeholder(R.drawable.junooncircle).into(imageView16);

         ImageView imageView17 =  findViewById(R.id.imageView17);
        Glide.with(this).load("https://i.ibb.co/2Mr1CnQ/17.jpg").placeholder(R.drawable.junooncircle).into(imageView17);

         ImageView imageView18 =  findViewById(R.id.imageView18);
        Glide.with(this).load("https://i.ibb.co/SQWj05z/18.jpg").placeholder(R.drawable.junooncircle).into(imageView18);

         ImageView imageView19 =  findViewById(R.id.imageView19);
        Glide.with(this).load("https://i.ibb.co/K5mYC7H/27.jpg").placeholder(R.drawable.junooncircle).into(imageView19);

         ImageView imageView20 =  findViewById(R.id.imageView20);
        Glide.with(this).load("https://i.ibb.co/VSy4Sxv/28.jpg").placeholder(R.drawable.junooncircle).into(imageView20);

         ImageView imageView21 =  findViewById(R.id.imageView21);
        Glide.with(this).load("https://i.ibb.co/2K3Fs00/19.jpg").placeholder(R.drawable.junooncircle).into(imageView21);

         ImageView imageView22 =  findViewById(R.id.imageView22);
        Glide.with(this).load("https://i.ibb.co/2YzD5QH/20.jpg").placeholder(R.drawable.junooncircle).into(imageView22);

         ImageView imageView23 =  findViewById(R.id.imageView23);
        Glide.with(this).load("https://i.ibb.co/9wsrfsk/21.jpg").placeholder(R.drawable.junooncircle).into(imageView23);

         ImageView imageView24 =  findViewById(R.id.imageView24);
        Glide.with(this).load("https://i.ibb.co/ZGg8Rtv/22.jpg").placeholder(R.drawable.junooncircle).into(imageView24);

         ImageView imageView25 =  findViewById(R.id.imageView25);
        Glide.with(this).load("https://i.ibb.co/gPbs6XR/23.jpg").placeholder(R.drawable.junooncircle).into(imageView25);

         ImageView imageView26 =  findViewById(R.id.imageView26);
        Glide.with(this).load("https://i.ibb.co/BjxhCM9/24.jpg").placeholder(R.drawable.junooncircle).into(imageView26);

     ImageView imageView27 =  findViewById(R.id.imageView27);
        Glide.with(this).load("https://i.ibb.co/F0Wq0kb/25.jpg").placeholder(R.drawable.junooncircle).into(imageView27);

     ImageView imageView28 =  findViewById(R.id.imageView28);
        Glide.with(this).load("https://i.ibb.co/qxS68Wc/26.jpg").placeholder(R.drawable.junooncircle).into(imageView28);

     ImageView imageView29 =  findViewById(R.id.imageView29);
        Glide.with(this).load("https://i.ibb.co/J7LJ7qz/28.jpg").placeholder(R.drawable.junooncircle).into(imageView29);

     ImageView imageView30 =  findViewById(R.id.imageView30);
        Glide.with(this).load("https://i.ibb.co/tH3Syc5/27.jpg").placeholder(R.drawable.junooncircle).into(imageView30);

     ImageView imageView31 =  findViewById(R.id.imageView31);
        Glide.with(this).load("https://i.ibb.co/cvWXz5J/ashutoshmic.jpg").placeholder(R.drawable.junooncircle).into(imageView31);

     ImageView imageView32 =  findViewById(R.id.imageView32);
        Glide.with(this).load("https://i.ibb.co/r0HVkbZ/skjhamic.jpg").placeholder(R.drawable.junooncircle).into(imageView32);

  ImageView imageView33 =  findViewById(R.id.imageView33);
        Glide.with(this).load("https://i.ibb.co/mhVz0Sn/lamp.jpg").placeholder(R.drawable.junooncircle).into(imageView33);





    }

    public void youtube(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/results?search_query=junoon+mit"));
        startActivity(browserIntent);
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);

    }
    //notifications
    public void tukka(View view){
        Intent intent = new Intent(getBaseContext(), PostListActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
    }
}