package com.mitm.junoon;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mitm.junoon.Extra.Post;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;


//proguard use krne pr keep lgayenge
// @Keep
public class PostAdapter extends FirebaseRecyclerAdapter<Post, PostAdapter.PostViewHolder> {

    public PostAdapter(@NonNull FirebaseRecyclerOptions<Post> options) {
        super(options);


    }
//bind view holder
    @Override
    protected void onBindViewHolder(@NonNull PostViewHolder holder, int position,
                                    @NonNull Post post)
    {

        holder.title.setText(post.getTitle());
        holder.description.setText(post.getDescription());
        holder.author.setText(post.getAuthor());

    }
//create karne k lye
    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post, parent, false);

        return new PostViewHolder(view);

    }
//view holder reference
    class PostViewHolder extends RecyclerView.ViewHolder {

        TextView title,description,author;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            description=itemView.findViewById(R.id.description);
            author=itemView.findViewById(R.id.author);



        }
    }

}
