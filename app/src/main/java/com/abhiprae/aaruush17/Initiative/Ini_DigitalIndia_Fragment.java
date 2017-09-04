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

public class Ini_DigitalIndia_Fragment extends android.support.v4.app.Fragment {

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

        text.setText("Digital India Campaign\n" +
                "Mission - To create awareness of all the facilities being provided by\n" +
                "Government of India and what are the benefits of adapting yourself\n" +
                "towards Digital India primarily focusing on Unique Identity Number.\n" +
                "Vision - To have a society in which each and every person understand\n" +
                "the importance of Unique Identity Number and makes the maximum\n" +
                "use of digital services being provided by Government of India.\n" +
                "Digital India Campaign was launched by Prime Minister of India\n" +
                "Narendra Modi with an initiative of connecting rural areas with high\n" +
                "speed internet networks and improving digital literacy. Digital India\n" +
                "Awareness Campaign is a student run initiative organized by Aaruush.\n" +
                "In this campaign, students will visit populated places to create\n" +
                "awareness about Digital Platforms being launched by Government of\n" +
                "India to ensure that Government services are made available to citizens\n" +
                "electronically by improved online infrastructure and by increasing\n" +
                "Internet connectivity or by making the country digitally empowered in\n" +
                "the field of technology.\n" +
                "Facts\n" +
                "1. With the ongoing digital drive in India, the number of users opting for\n" +
                "online banking is expected to double to reach 150 million mark by\n" +
                "2020, from the current 45 million active urban online banking users in\n" +
                "India.\n" +
                "2. In 2017, smartphone subscriptions in India are expected to represent\n" +
                "around 30% of all mobile subscriptions. By 2022, this number is\n" +
                "expected to reach over 60% while smartphone subscriptions are set to\n" +
                "\n" +
                "reach 890 million, and data traffic per smartphone to reach almost 11\n" +
                "GB per month.\n" +
                "3. The Ministry of Human Resource Development introduced the e-\n" +
                "Pathshala programme to promote ‘learning on the go’ among students,\n" +
                "teachers and parents. Through this initiative, free access to NCERT\n" +
                "books is available to students of classes 1 to 12. These books are\n" +
                "available in both Hindi and English.");

        //text1.setText("September 16th and 17th | Price : Rs.5600 for 4");

        ImageView i = (ImageView) v.findViewById(R.id.imageView2);
        Drawable drawable = getResources().getDrawable(R.drawable.cognitive);
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
        i.setVisibility(View.GONE);
        return v;
    }
}