package com.mitm.junoon.Home.Team.TeamDetails;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.mitm.junoon.R;

public class Faculty extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_faculty);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ImageView imageView0 =  findViewById(R.id.imageView0);
        Glide.with(this).load("https://i.ibb.co/9nyZsFW/ashutosh2.jpg").placeholder(R.drawable.junooncircle).into(imageView0);

        ImageView imageView9 =  findViewById(R.id.imageView9);
        Glide.with(this).load("https://i.ibb.co/4ZJz8Gs/Ashish-sir2.jpg").placeholder(R.drawable.junooncircle).into(imageView9);

        ImageView imageView10 =  findViewById(R.id.imageView10);
        Glide.with(this).load("https://i.ibb.co/thkLxXB/hcv.jpg").placeholder(R.drawable.junooncircle).into(imageView10);

        ImageView imageView11 =  findViewById(R.id.imageView11);
        Glide.with(this).load("https://i.ibb.co/xjQ9Pby/skt2.jpg").placeholder(R.drawable.junooncircle).into(imageView11);

        ImageView imageView12 =  findViewById(R.id.imageView12);
        Glide.with(this).load("https://i.ibb.co/FVHyFFp/nidhish1.jpg").placeholder(R.drawable.junooncircle).into(imageView12);

        ImageView imageView1 =  findViewById(R.id.imageView1);
        Glide.with(this).load("https://i.ibb.co/8gpGvWC/pranavsir3.jpg").placeholder(R.drawable.junooncircle).into(imageView1);

        ImageView imageView2 =  findViewById(R.id.imageView2);
        Glide.with(this).load("https://i.ibb.co/09VXRjn/amitkrsir2.jpg").placeholder(R.drawable.junooncircle).into(imageView2);

        ImageView imageView3 =  findViewById(R.id.imageView3);
        Glide.with(this).load("https://i.ibb.co/3MM4147/shailbala.jpg").placeholder(R.drawable.junooncircle).into(imageView3);

        ImageView imageView4 =  findViewById(R.id.imageView4);
        Glide.with(this).load("https://i.ibb.co/8rFyz9j/umar.jpg").placeholder(R.drawable.junooncircle).into(imageView4);

        ImageView imageView5 =  findViewById(R.id.imageView5);
        Glide.with(this).load("https://i.ibb.co/2FYBZPY/ankitsir1.jpg").placeholder(R.drawable.junooncircle).into(imageView5);

        ImageView imageView6 =  findViewById(R.id.imageView6);
        Glide.with(this).load("https://i.ibb.co/Hp2YfQz/nitish.jpg").placeholder(R.drawable.junooncircle).into(imageView6);

        ImageView imageView7 =  findViewById(R.id.imageView7);
        Glide.with(this).load("https://i.ibb.co/2t9L2By/swetamam.jpg").placeholder(R.drawable.junooncircle).into(imageView7);

        ImageView imageView8 =  findViewById(R.id.imageView8);
        Glide.with(this).load("https://i.ibb.co/QccKB2D/pawan3.jpg").placeholder(R.drawable.junooncircle).into(imageView8);

    }


}