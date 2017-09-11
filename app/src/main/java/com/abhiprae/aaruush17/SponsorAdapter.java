package com.abhiprae.aaruush17;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class SponsorAdapter extends RecyclerView.Adapter<SponsorAdapter.MyViewHolder> {

    private Context mContext2;
    private List<Model.Sponsor> albumList2;


    public SponsorAdapter(android.content.Context mContext2, List<Model.Sponsor> albumList2) {
        this.mContext2 = mContext2;
        this.albumList2 = albumList2;
    }

    @Override
    public SponsorAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.sponsor_item, parent, false);

        return new SponsorAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final SponsorAdapter.MyViewHolder holder, final int position) {
        Model.Sponsor album = albumList2.get(position);
        holder.title.setText(album.getName());
        holder.count.setText(album.getCompany());

        // loading album cover using Glide library
            Glide.with(mContext2).load(album.getLogoID()).into(holder.thumbnail);
        /* holder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Intent intent;
                switch (position) {
                    case 0:
                        //  Toast.makeText(mContext2, "3D PAINTING is Clicked!", Toast.LENGTH_SHORT).show();
                        String x = "tel:" + "8902067083";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse(x));
                        mContext2.startActivity(callIntent);

                        break;


                }
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return albumList2.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, count;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);
            mContext2 = view.getContext();
            title = (TextView) view.findViewById(R.id.positionName);
            Typeface typeface = Typeface.createFromAsset(mContext2.getAssets(), "fonts/avenir.otf");
            title.setTypeface(typeface);
            count = (TextView) view.findViewById(R.id.company_name);
            Typeface typeface1 = Typeface.createFromAsset(mContext2.getAssets(), "fonts/avenir.otf");
            count.setTypeface(typeface1);
            thumbnail = (ImageView) view.findViewById(R.id.sponsorPic);
        }
    }
}