package com.dikasihnama.jejama.forum;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dikasihnama.jejama.R;

import java.util.List;

public class ForumAdapter extends RecyclerView.Adapter<ForumAdapter.Holder> {

    List<ForumItem> forumItems;

    public ForumAdapter(List<ForumItem> forumItems) {
        this.forumItems = forumItems;
    }

    @NonNull
    @Override
    public ForumAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.forum_item,parent,false);

        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ForumAdapter.Holder holder, int position) {
        ForumItem item = forumItems.get(position);
        holder.txname.setText(item.getName());
        holder.txtimepost.setText(item.getTimePost());
        holder.txpost.setText(item.getPosts());
        holder.txlikes.setText(item.getLikes());
        holder.txcomments.setText(item.getComments());
        holder.imgpost.setImageResource(item.getImages());

    }

    @Override
    public int getItemCount() {
        return forumItems.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        TextView txname, txtimepost, txpost, txlikes, txcomments;
        ImageView imgpost;

        public Holder(@NonNull View itemView) {
            super(itemView);

            txname = itemView.findViewById(R.id.usernamepost);
            txtimepost = itemView.findViewById(R.id.timepost);
            txpost = itemView.findViewById(R.id.post);
            txlikes = itemView.findViewById(R.id.likes);
            txcomments = itemView.findViewById(R.id.comments);
            imgpost = itemView.findViewById(R.id.imgpost);
        }
    }
}
