package com.mitm.junoon.Home.Developers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.mitm.junoon.PostListActivity;
import com.mitm.junoon.R;

import de.hdodenhof.circleimageview.CircleImageView;


public class Developers  extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.developers);

    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);

  CircleImageView imageView1 =  findViewById(R.id.imageView1);
    Glide.with(this).load("https://i.ibb.co/G34QzLd/pu2.jpg").placeholder(R.drawable.junooncircle).into(imageView1);
    imageView1.setLayerType(View.LAYER_TYPE_HARDWARE, null);

    CircleImageView imageView2 =  findViewById(R.id.imageView2);
    Glide.with(this).load("https://i.ibb.co/jyctRbF/priyam.jpg").placeholder(R.drawable.priyamprakash).into(imageView2);
    imageView2.setLayerType(View.LAYER_TYPE_HARDWARE, null);


  }
  //notifications
  public void tukka(View view){
    Intent intent = new Intent(getBaseContext(), PostListActivity.class);
    startActivity(intent);
    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
  }
}
