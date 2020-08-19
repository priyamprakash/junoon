package com.mitm.junoon.Home.Founder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.mitm.junoon.PostListActivity;
import com.mitm.junoon.R;


public class Founder  extends AppCompatActivity {



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.founder);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);

    ImageView application =  findViewById(R.id.application);
    Glide.with(this).load("https://i.ibb.co/hdqL9v2/junoon-application.jpg").placeholder(R.drawable.junooncircle).into(application);


    ImageView imageView1 =  findViewById(R.id.imageView1);
    Glide.with(this).load("https://i.ibb.co/bzjMF9q/vivekroysir.jpg").placeholder(R.drawable.junooncircle).into(imageView1);

    ImageView imageView2 =  findViewById(R.id.imageView2);
    Glide.with(this).load("https://i.ibb.co/tsJYJ0C/rajababu3.jpg").placeholder(R.drawable.junooncircle).into(imageView2);

    ImageView imageView3 =  findViewById(R.id.imageView3);
    Glide.with(this).load("https://i.ibb.co/X2XW05W/akash2.jpg").placeholder(R.drawable.junooncircle).into(imageView3);

    ImageView imageView4 =  findViewById(R.id.imageView4);
    Glide.with(this).load("https://i.ibb.co/KGc2K2t/ashwini.jpg").placeholder(R.drawable.junooncircle).into(imageView4);

    ImageView imageView5 =  findViewById(R.id.imageView5);
    Glide.with(this).load("https://i.ibb.co/VpDbHwL/ashish151.jpg").placeholder(R.drawable.junooncircle).into(imageView5);

    ImageView imageView6 =  findViewById(R.id.imageView6);
    Glide.with(this).load("https://i.ibb.co/tCX5RWj/depaak3.jpg").placeholder(R.drawable.junooncircle).into(imageView6);


    ImageView imageView7 =  findViewById(R.id.imageView7);
    Glide.with(this).load("https://i.ibb.co/SmFwvFm/isha2.jpg").placeholder(R.drawable.junooncircle).into(imageView7);

  }
  public void tukka(View view){
    Intent intent = new Intent(getBaseContext(), PostListActivity.class);
    startActivity(intent);
    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
  }


}