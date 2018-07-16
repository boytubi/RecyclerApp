package com.example.hoangtruc.recyclerapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    private List<Hero> mData ;
    private Context mContext;


    public CustomAdapter(List<Hero> mData, Context context) {
        this.mData = mData;
        this.mContext = context;

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_hero,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder( MyViewHolder viewHolder, int i) {

        viewHolder.mImageHero.setBackgroundResource(mData.get(i).getImage());
        viewHolder.mTextName.setText(mData.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageHero;
        TextView mTextName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageHero = itemView.findViewById(R.id.image_hero);
            mTextName = itemView.findViewById(R.id.text_name);
            }
    }
}
