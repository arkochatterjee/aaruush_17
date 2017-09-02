package com.abhiprae.aaruush17;

/**
 * Created by Abhiprae on 7/22/2017.
 */

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Arko Chatterjee on 11-07-2017.
 */

public class AlbumsAdapter3Timeline extends RecyclerView.Adapter<AlbumsAdapter3Timeline.MyViewHolder> {

    private Context mContext2;
    private List<Albums3Timeline> albumList2;


    public AlbumsAdapter3Timeline(android.content.Context mContext2, List<Albums3Timeline> albumList2) {
        this.mContext2 = mContext2;
        this.albumList2 = albumList2;
    }

    @Override
    public AlbumsAdapter3Timeline.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_timeline, parent, false);

        return new AlbumsAdapter3Timeline.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final AlbumsAdapter3Timeline.MyViewHolder holder, final int position) {
        Albums3Timeline album = albumList2.get(position);
        holder.title.setText(album.getName());
        holder.count.setText(album.getNumOfSongs3());

        // loading album cover using Glide library
        Glide.with(mContext2).load(album.getThumbnail3()).into(holder.thumbnail);

        holder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Intent intent;
                switch (position) {
                    case 0:
                        break;

                }


                // Intent intent = new Intent(mContext,SplashScreen.class);
                //mContext.startActivity(intent);

                // Intent i = new Intent(AlbumsAdapter.this,SplashScreen.class);
                //startActivity(i);

                //showPopupMenu(holder.thumbnail);
                //System.out.println("Clicked!");
            }
        });
    }

    @Override
    public int getItemCount() {
        return albumList2.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, count;
        public ImageView thumbnail, overflow;

        public MyViewHolder(View view) {
            super(view);
            mContext2 = view.getContext();
            title = (TextView) view.findViewById(R.id.title2);
            Typeface typeface = Typeface.createFromAsset(mContext2.getAssets(), "fonts/M_R.ttf");
            title.setTypeface(typeface);
            count = (TextView) view.findViewById(R.id.count2);
            Typeface typeface1 = Typeface.createFromAsset(mContext2.getAssets(), "fonts/M_R.ttf");
            count.setTypeface(typeface1);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail2);
            overflow = (ImageView) view.findViewById(R.id.overflow2);
        }
    }
}


