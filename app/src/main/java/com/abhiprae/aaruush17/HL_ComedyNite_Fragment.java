package com.abhiprae.aaruush17;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bluejamesbond.text.DocumentView;

/**
 * Created by Arko Chatterjee on 04-09-2017.
 */

public class HL_ComedyNite_Fragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.workshop_brainwave, container, false);
        DocumentView text = (DocumentView) v.findViewById(R.id.textView3);
        TextView text1 = (TextView) v.findViewById(R.id.textView4);
        Typeface typeface1 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/avenir.otf");
        text1.setTypeface(typeface1);

        text.setText("Comedy Night with Zakir Zhan\n\n" +
                "A cartoon by heart, comedian by nature, a writer by profession and performer by " +
                "birth, Zakir is the winner of Comedy Central's hunt for ‘Best Stand Up Comic of " +
                "India’. His name is Khan (from the epiglottis) but he is certainly not a terrorist.\n" +
                "This 'Confused Desi' serves up his take on modern India with a hard-to-resist " +
                "rustic humor that'll have you nodding your heads and clapping as you relate to " +
                "everything he says. He can smoothly switch modes for an audience full of family " +
                "members, a corporate crowd or a room full of men . Each show will know him as a " +
                "different Zakir .");

        text1.setText("\nFor more info visit your nearest Aaruush Helpdesk");

        ImageView i = (ImageView) v.findViewById(R.id.imageView2);
        Drawable drawable = getResources().getDrawable(R.drawable.zk);
        i.setImageDrawable(drawable);
        Button button = (Button) v.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.thecollegefever.com/events/aaruush17");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        button.setVisibility(View.GONE);
        return v;
    }
}