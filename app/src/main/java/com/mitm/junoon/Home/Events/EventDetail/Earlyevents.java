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

public class Earlyevents extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events_early);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ImageView imageView200 = findViewById(R.id.imageView200);
        Glide.with(this).load("https://i.ibb.co/1vD9F2w/finalgif.gif").placeholder(R.drawable.junooncircle).into(imageView200);

        ImageView imageView1 =  findViewById(R.id.img1);
        Glide.with(this).load("https://i.ibb.co/tPJHrH4/pubg1.jpg").placeholder(R.drawable.junooncircle).into(imageView1);

        ImageView img11 =  findViewById(R.id.img11);
        Glide.with(this).load("https://i.ibb.co/F6wgZth/pubg2.jpg").placeholder(R.drawable.junooncircle).into(img11);

        ImageView img12 =  findViewById(R.id.img12);
        Glide.with(this).load("https://i.ibb.co/f4PVPNZ/pubg3.jpg").placeholder(R.drawable.junooncircle).into(img12);

        ImageView imageView2 =  findViewById(R.id.img2);
        Glide.with(this).load("https://i.ibb.co/s5Y0pTM/street1.jpg").placeholder(R.drawable.junooncircle).into(imageView2);

        ImageView img21 =  findViewById(R.id.img21);
        Glide.with(this).load("https://i.ibb.co/rdY36w0/street2.jpg").placeholder(R.drawable.junooncircle).into(img21);

        ImageView img23 =  findViewById(R.id.img23);
        Glide.with(this).load("https://i.ibb.co/QQJzfTd/street3.jpg").placeholder(R.drawable.junooncircle).into(img23);




        ImageView imageView3 =  findViewById(R.id.img3);
        Glide.with(this).load("https://i.ibb.co/YRHC1k1/photo1.jpg").placeholder(R.drawable.junooncircle).into(imageView3);

       ImageView imageView31 =  findViewById(R.id.img31);
        Glide.with(this).load("https://i.ibb.co/vxJTTgw/photo2.jpg").placeholder(R.drawable.junooncircle).into(imageView31);


        ImageView imageView4 =  findViewById(R.id.img4);
        Glide.with(this).load("https://i.ibb.co/tH3Syc5/27.jpg").placeholder(R.drawable.junooncircle).into(imageView4);

        ImageView imageView41 =  findViewById(R.id.img41);
        Glide.with(this).load("https://i.ibb.co/q7gsLXh/22.jpg").placeholder(R.drawable.junooncircle).into(imageView41);

        ImageView imageView42 =  findViewById(R.id.img42);
        Glide.with(this).load("https://i.ibb.co/nnWdw4b/6.jpg").placeholder(R.drawable.junooncircle).into(imageView42);

//fondation
        ImageView imageView51 =  findViewById(R.id.img52);

        Glide.with(this).load("https://i.ibb.co/bgs4jGP/foundprinci.jpg").placeholder(R.drawable.junooncircle).into(imageView51);

        ImageView imageView52 =  findViewById(R.id.img5);
        Glide.with(this).load("https://i.ibb.co/GRphXZ8/founddrama.jpg").placeholder(R.drawable.logo).into(imageView52);
//nehru
        ImageView imageView0 =  findViewById(R.id.img0);
        Glide.with(this).load("https://i.ibb.co/2ypcHqY/nehru.jpg").placeholder(R.drawable.logo).into(imageView0);

        //pakhwada
        ImageView imageView6 =  findViewById(R.id.img6);
        Glide.with(this).load("https://i.ibb.co/phZFJZv/pakhwada.jpg").placeholder(R.drawable.junooncircle).into(imageView6);

        ImageView imageView64 =  findViewById(R.id.img64);
        Glide.with(this).load("https://i.ibb.co/1zPXC3Z/pakhposter.jpg").placeholder(R.drawable.junooncircle).into(imageView64);


        ImageView imageView7 =  findViewById(R.id.img7);
        Glide.with(this).load("https://i.ibb.co/rM1nzz6/monday.jpg").placeholder(R.drawable.junooncircle).into(imageView7);

//health day
        CircleImageView imageView8 =  findViewById(R.id.img8);
        Glide.with(this).load("https://i.ibb.co/dJhhGtj/ojas.jpg").into(imageView8);
        imageView8.setLayerType(View.LAYER_TYPE_HARDWARE, null);

        CircleImageView imageView82 =  findViewById(R.id.img82);
        Glide.with(this).load("https://i.ibb.co/JcZGSjy/prakriti.jpg").into(imageView82);
        imageView82.setLayerType(View.LAYER_TYPE_HARDWARE, null);

        CircleImageView imageView83 =  findViewById(R.id.img83);
        Glide.with(this).load("https://i.ibb.co/5h7KntM/mrfit.jpg").into(imageView83);
        imageView83.setLayerType(View.LAYER_TYPE_HARDWARE, null);
//theatre
        CircleImageView imageView9 =  findViewById(R.id.img9);
        Glide.with(this).load("https://i.ibb.co/gTdF7QB/bollywoood.jpg").into(imageView9);
        imageView9.setLayerType(View.LAYER_TYPE_HARDWARE, null);

        CircleImageView imageView92 =  findViewById(R.id.img92);
        Glide.with(this).load("https://i.ibb.co/f4mWTLq/emoji.jpg").into(imageView92);
        imageView92.setLayerType(View.LAYER_TYPE_HARDWARE, null);

        CircleImageView imageView93 =  findViewById(R.id.img93);
        Glide.with(this).load("https://i.ibb.co/T4R2qJt/mimicry.png").into(imageView93);
        imageView93.setLayerType(View.LAYER_TYPE_HARDWARE, null);

        CircleImageView imageView94 =  findViewById(R.id.img94);
        Glide.with(this).load("https://i.ibb.co/9cNht6b/dialogue.png").into(imageView94);
        imageView94.setLayerType(View.LAYER_TYPE_HARDWARE, null);

        CircleImageView imageView101 =  findViewById(R.id.img101);
        Glide.with(this).load("https://i.ibb.co/QPTGHhN/rhythm.jpg").into(imageView101);
        imageView101.setLayerType(View.LAYER_TYPE_HARDWARE, null);


       CircleImageView imageView102 =  findViewById(R.id.img102);
       Glide.with(this).load("https://i.ibb.co/7VtBBQb/ballet.jpg").into(imageView102);
        imageView102.setLayerType(View.LAYER_TYPE_HARDWARE, null);

        ImageView van1 = findViewById(R.id.van1);
        Glide.with(this).load("https://i.ibb.co/Rp4FCcb/v1.jpg").placeholder(R.drawable.junooncircle).into(van1);

        ImageView van2 = findViewById(R.id.van2);
        Glide.with(this).load("https://i.ibb.co/mvN4hJF/v2.jpg").placeholder(R.drawable.junooncircle).into(van2);

        ImageView van3 = findViewById(R.id.van3);
        Glide.with(this).load("https://i.ibb.co/Z1mHMgp/v3.jpg").placeholder(R.drawable.junooncircle).into(van3);

        ImageView van4 = findViewById(R.id.van4);
        Glide.with(this).load("https://i.ibb.co/0VT5BVr/v4.jpg").placeholder(R.drawable.junooncircle).into(van4);

        ImageView van5 = findViewById(R.id.van5);
        Glide.with(this).load("https://i.ibb.co/b2hb8pX/v5.jpg").placeholder(R.drawable.junooncircle).into(van5);

        ImageView van6 = findViewById(R.id.van6);
        Glide.with(this).load("https://i.ibb.co/hFzF593/v6.jpg").placeholder(R.drawable.junooncircle).into(van6);

        ImageView van7 = findViewById(R.id.van7);
        Glide.with(this).load("https://i.ibb.co/0Q52XT8/v7.jpg").placeholder(R.drawable.junooncircle).into(van7);

        ImageView van8 = findViewById(R.id.van8);
        Glide.with(this).load("https://i.ibb.co/VCBLn9z/v8.jpg").placeholder(R.drawable.junooncircle).into(van8);

        ImageView van9 = findViewById(R.id.van9);
        Glide.with(this).load("https://i.ibb.co/93Z4bxS/v9.jpg").placeholder(R.drawable.junooncircle).into(van9);

        ImageView van10 = findViewById(R.id.van10);
        Glide.with(this).load("https://i.ibb.co/P5tS9Cv/v10.jpg").placeholder(R.drawable.junooncircle).into(van10);

        ImageView van11 = findViewById(R.id.van11);
        Glide.with(this).load("https://i.ibb.co/NW0xs11/v11.jpg").placeholder(R.drawable.junooncircle).into(van11);

        ImageView van12 = findViewById(R.id.van12);
        Glide.with(this).load("https://i.ibb.co/8gyYm98/v12.jpg").placeholder(R.drawable.junooncircle).into(van12);

        ImageView f1 = findViewById(R.id.f1);
        Glide.with(this).load("https://i.ibb.co/ZgdNdVQ/princi.jpg").placeholder(R.drawable.junooncircle).into(f1);
        ImageView f2 = findViewById(R.id.f2);
        Glide.with(this).load("https://i.ibb.co/sW8hwSZ/fiesta2.jpg").placeholder(R.drawable.junooncircle).into(f2);

        ImageView w1 = findViewById(R.id.w1);
        Glide.with(this).load("https://i.ibb.co/ZK0Dw0n/women.jpg").placeholder(R.drawable.junooncircle).into(w1);




    }
    //notifications
    public void tukka(View view){
        Intent intent = new Intent(getBaseContext(), PostListActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
    }
}