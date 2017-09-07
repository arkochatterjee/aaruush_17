package com.abhiprae.aaruush17.Initiative;

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

import com.abhiprae.aaruush17.R;
import com.bluejamesbond.text.DocumentView;

/**
 * Created by Arko Chatterjee on 04-09-2017.
 */

public class Ini_Liter_Fragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.workshop_brainwave, container, false);
        com.bluejamesbond.text.DocumentView text = (com.bluejamesbond.text.DocumentView) v.findViewById(R.id.textView3);
        TextView text1 = (TextView) v.findViewById(R.id.textView4);
        Typeface typeface1 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/M_R.ttf");
        Typeface typeface2 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/helvatika.ttf");
        //text.setTypeface(typeface2);
        text1.setTypeface(typeface2);

        text.setText("Liter of Light\n\n" +
                "Vision – To build a society where light is available to everyone " +
                "regardless of their social status or economic background.\n" +
                "\nMission – To make sure that conventional source of light is readily " +
                "available across villages and strategic implementation " +
                "Liter of light is a non-profit, global open source movement, that focuses " +
                "on providing cost-free, ecological and sustainable lighting to slums and " +
                "poor households with thin roofs.\n" +
                "This model, also called the Solar Bole Bulb, aims at the use of cheap, " +
                "recycled, household, and cost effective items which provide the urban " +
                "poor a chance at an environment friendly version of one of the most " +
                "basic necessities of life - lighting. The first successful trial of Liter of " +
                "Light in India was carried out in a rural village in Telangana in 2011.\n" +
                "With the help of NGOs, awareness campaigns and workshops, " +
                "popularity was raised in other states of India such as Chennai, Mumbai, " +
                "Hyderabad, Delhi and Kolkata. Soon aer, a demonstraon of this model " +
                "was held at the TEDxChristUniversity in November 2012. Pankaj and " +
                "Trip, started their own Liter of Light Bangalore Chapter in 2013 and are " +
                "working towards training people into making these models themselves " +
                "to provide them with a chance to earn a small livelihood as well.\n" +
                "\nFacts\n\n" +
                "1. A fifth of the world’s population lives without electricity.\n" +
                "2. A Solar Bottle Bulb provides free energy without carbon emissions " +
                "and is environmentally friendly.\n" +
                "3. The Daylight Bottle Bulb emits as much light as a 40 to 60 watt " +
                "light bulb.\n" +
                "4. Light bulb bottles have already brightened the lives of more than " +
                "1 million people.");

        //text1.setText("September 16th and 17th | Price : Rs.5600 for 4");

        ImageView i = (ImageView) v.findViewById(R.id.imageView2);
        Drawable drawable = getResources().getDrawable(R.drawable.literoflight);
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