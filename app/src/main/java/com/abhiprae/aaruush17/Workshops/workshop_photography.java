package com.abhiprae.aaruush17.Workshops;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abhiprae.aaruush17.R;
import com.bluejamesbond.text.DocumentView;

/**
 * Created by Arko Chatterjee on 27-07-2017.
 */

public class workshop_photography extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.workshop_brainwave, container, false);
        DocumentView text = (DocumentView) v.findViewById(R.id.textView3);
        TextView text1 = (TextView) v.findViewById(R.id.textView4);
        Typeface typeface1 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/M_R.ttf");
        Typeface typeface2 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/helvatika.ttf");
        //text.setTypeface(typeface2);
        text1.setTypeface(typeface1);
        text.setText("Friendship, enthusiasm, adventure and crazy mishaps last a lifetime with a shot. Learn to capture the moments you ardently cherish this August. Find the joy of photography at the heart of the image, with Nikon School of Photography. \n" +
                "One moment, one shot.");
        text1.setText("August 6th | Price : Rs.400");

        ImageView i = (ImageView) v.findViewById(R.id.imageView2);
        Drawable drawable = getResources().getDrawable(R.drawable.workshop_photo);
        i.setImageDrawable(drawable);
        Button button = (Button) v.findViewById(R.id.button);
        button.setVisibility(View.GONE);
        /*button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                        Uri uri = Uri.parse("https://www.thecollegefever.com/events/aaruush17");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                }
        }); */
        return v;
    }
}
