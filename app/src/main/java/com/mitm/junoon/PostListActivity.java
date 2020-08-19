package com.mitm.junoon;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.annotation.Keep;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mitm.junoon.Extra.Post;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

//proguard use krne pr keep lgayenge
// @Keep
public class PostListActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private PostAdapter adapter;
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_list);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        toolbar=findViewById(R.id.toolbarCustom);
        setSupportActionBar(toolbar);
//xml file me recycler view hai, id= recycler
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<Post> options =
                new FirebaseRecyclerOptions.Builder<Post>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Post"),
                                Post.class).build();

//Post naam ka tree needs to be created in the database

         adapter = new PostAdapter(options);
         recyclerView.setAdapter(adapter);

    }
    //to start
    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }
    //to stop
    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }



    public void insta(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/junoon_mit/"));
        startActivity(browserIntent);
        overridePendingTransition(R.anim.goup,R.anim.godown);

    }

    public void fb(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/junoonmit" ));
        startActivity(browserIntent);
        overridePendingTransition(R.anim.goup,R.anim.godown);
    }

    public void mail(View view){

        String to = "junoonmit@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL  , new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup,R.anim.godown);

    }

    public void tukka(View view){

        Toast.makeText(PostListActivity.this, "Get the Latest Updates here",
                Toast.LENGTH_LONG).show();

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
