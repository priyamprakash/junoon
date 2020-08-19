package com.mitm.junoon.Home.Events.EventDetail;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.mitm.junoon.PostListActivity;
import com.mitm.junoon.R;
import de.hdodenhof.circleimageview.CircleImageView;


public class fiestatwo  extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.events_fiestatwo);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ImageView imageView200 =  findViewById(R.id.imageView200);
        Glide.with(this).load("https://i.ibb.co/1vD9F2w/finalgif.gif").placeholder(R.drawable.junooncircle).into(imageView200);

        ImageView imageView400 =  findViewById(R.id.imageView400);
        Glide.with(this).load("https://i.ibb.co/sW8hwSZ/fiesta2.jpg").placeholder(R.drawable.junooncircle).into(imageView400);

        CircleImageView imageView1p1 =findViewById(R.id.imageView1p1);
        Glide.with(this).load("https://i.ibb.co/LN7Dh4Z/f2e1.jpg").placeholder(R.drawable.junooncircle).into(imageView1p1);
        imageView1p1.setLayerType(View.LAYER_TYPE_HARDWARE, null);


        CircleImageView imageView1p2 =  findViewById(R.id.imageView1p2);
        Glide.with(this).load("https://i.ibb.co/N6jcxxP/f2e2.jpg").placeholder(R.drawable.junooncircle).into(imageView1p2);
        imageView1p2.setLayerType(View.LAYER_TYPE_HARDWARE, null);

        CircleImageView imageView1p3 =  findViewById(R.id.imageView1p3);
        Glide.with(this).load("https://i.ibb.co/1vJdq8Z/f2e3.jpg").into(imageView1p3);
        imageView1p3.setLayerType(View.LAYER_TYPE_HARDWARE, null);

        CircleImageView imageView1p4 =  findViewById(R.id.imageView1p4);
        Glide.with(this).load("https://i.ibb.co/4Pd3QLt/f2e4.jpg").into(imageView1p4);
        imageView1p4.setLayerType(View.LAYER_TYPE_HARDWARE, null);

        CircleImageView imageView1p5 =  findViewById(R.id.imageView1p5);
        Glide.with(this).load("https://i.ibb.co/YQX4zjL/f2e5.jpg").into(imageView1p5);
        imageView1p5.setLayerType(View.LAYER_TYPE_HARDWARE, null);



        ImageView imageView2p1 =  findViewById(R.id.imageView2p1);
        Glide.with(this).load("https://i.ibb.co/yXnc0w2/w1.jpg").placeholder(R.drawable.junooncircle).into(imageView2p1);

        ImageView imageView2p2 =  findViewById(R.id.imageView2p2);
        Glide.with(this).load("https://i.ibb.co/ZGRBcPM/pic3.jpg").placeholder(R.drawable.junooncircle).into(imageView2p2);

        ImageView imageView2p3 =  findViewById(R.id.imageView2p3);
        Glide.with(this).load("https://i.ibb.co/NyCrjCj/cap.jpg").placeholder(R.drawable.junooncircle).into(imageView2p3);

        ImageView imageView2p4 =  findViewById(R.id.imageView2p4);
        Glide.with(this).load("https://i.ibb.co/C261XDm/ujjawal.jpg").placeholder(R.drawable.junooncircle).into(imageView2p4);

        ImageView imageView2p5 =  findViewById(R.id.imageView2p5);
        Glide.with(this).load("https://i.ibb.co/tqNbGtP/ayush1.jpg").placeholder(R.drawable.junooncircle).into(imageView2p5);

        ImageView imageView2p6 =  findViewById(R.id.imageView2p6);
        Glide.with(this).load("https://i.ibb.co/gySZ3Xt/vishay2.jpg").placeholder(R.drawable.junooncircle).into(imageView2p6);

        ImageView imageView2p7 =  findViewById(R.id.imageView2p7);
        Glide.with(this).load("https://i.ibb.co/FhvW6MS/ashutoshwa.jpg").placeholder(R.drawable.junooncircle).into(imageView2p7);

        ImageView imageView2p8 =  findViewById(R.id.imageView2p8);
        Glide.with(this).load("https://i.ibb.co/fHS859S/yash.jpg").placeholder(R.drawable.junooncircle).into(imageView2p8);

        ImageView imageView2p9 =  findViewById(R.id.imageView2p9);
        Glide.with(this).load("https://i.ibb.co/NjWvYvx/aqsa.jpg").placeholder(R.drawable.junooncircle).into(imageView2p9);

        ImageView imageView2p10 =  findViewById(R.id.imageView2p10);
        Glide.with(this).load("https://i.ibb.co/NLtJZMY/vishal.jpg").placeholder(R.drawable.junooncircle).into(imageView2p10);



        ImageView principal =  findViewById(R.id.principal);
        Glide.with(this).load("https://i.ibb.co/ZgdNdVQ/princi.jpg").placeholder(R.drawable.junooncircle).into(principal);

        ImageView imageView2 =  findViewById(R.id.imageView2);
        Glide.with(this).load("https://i.ibb.co/NtTR0k1/f11.jpg").placeholder(R.drawable.junooncircle).into(imageView2);

        ImageView imageView3 =  findViewById(R.id.imageView3);
        Glide.with(this).load("https://i.ibb.co/rxKTHgb/f1.jpg").placeholder(R.drawable.junooncircle).into(imageView3);

        ImageView imageView4 =  findViewById(R.id.imageView4);
        Glide.with(this).load("https://i.ibb.co/ZN3xLGY/f3.jpg").placeholder(R.drawable.junooncircle).into(imageView4);

        ImageView imageView5 =  findViewById(R.id.imageView5);
        Glide.with(this).load("https://i.ibb.co/xsgXbPc/f2.jpg").placeholder(R.drawable.junooncircle).into(imageView5);

        ImageView imageView6 =  findViewById(R.id.imageView6);
        Glide.with(this).load("https://i.ibb.co/tDhRYcY/f6.jpg").placeholder(R.drawable.junooncircle).into(imageView6);

        ImageView imageView7 =  findViewById(R.id.imageView7);
        Glide.with(this).load("https://i.ibb.co/7W4d4hf/f9.jpg").placeholder(R.drawable.junooncircle).into(imageView7);

        ImageView imageView8 =  findViewById(R.id.imageView8);
        Glide.with(this).load("https://i.ibb.co/BrKBqMC/f10.jpg").placeholder(R.drawable.junooncircle).into(imageView8);

        ImageView imageView9 =  findViewById(R.id.imageView9);
        Glide.with(this).load("https://i.ibb.co/j4P1STF/f8-1.jpg").placeholder(R.drawable.junooncircle).into(imageView9);

        ImageView imageView10 =  findViewById(R.id.imageView10);
        Glide.with(this).load("https://i.ibb.co/m8st23X/f7.jpg").placeholder(R.drawable.junooncircle).into(imageView10);

        ImageView imageView11 =  findViewById(R.id.imageView11);
        Glide.with(this).load("https://i.ibb.co/P9mFfQs/f6.jpg").placeholder(R.drawable.junooncircle).into(imageView11);

        ImageView imageView12 =  findViewById(R.id.imageView12);
        Glide.with(this).load("https://i.ibb.co/RyvrSZq/f5.jpg").placeholder(R.drawable.junooncircle).into(imageView12);

        ImageView imageView13 =  findViewById(R.id.imageView13);
        Glide.with(this).load("https://i.ibb.co/sWTXZVg/f4.jpg").placeholder(R.drawable.junooncircle).into(imageView13);

        ImageView imageView14 =  findViewById(R.id.imageView14);
        Glide.with(this).load("https://i.ibb.co/wYVBJvN/f12.jpg").placeholder(R.drawable.junooncircle).into(imageView14);

        ImageView imageView15 =  findViewById(R.id.imageView15);
        Glide.with(this).load("https://i.ibb.co/SsZNB8T/f13.jpg").placeholder(R.drawable.junooncircle).into(imageView15);

        ImageView imageView16 =  findViewById(R.id.imageView16);
        Glide.with(this).load("https://i.ibb.co/HXbhSxV/f16.jpg").placeholder(R.drawable.junooncircle).into(imageView16);
    }
    //notifications
    public void tukka(View view){
        Intent intent = new Intent(getBaseContext(), PostListActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
    }
}