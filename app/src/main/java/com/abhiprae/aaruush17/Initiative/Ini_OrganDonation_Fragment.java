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

public class Ini_OrganDonation_Fragment extends android.support.v4.app.Fragment {

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

        text.setText("Organ Donation Campaign\n" +
                "Vision – To build a society in which the importance of donating organs\n" +
                "is not considered a taboo and to make sure that the society is aware\n" +
                "about all the options.\n" +
                "Mission – To make sure the information is well transferred to very tier\n" +
                "about how and what organ donation means and how it works.\n" +
                "We campaign to:\n" +
                "promote public awareness about organ donation and transplant &amp;\n" +
                "encourage people to share their donation decision with their family and\n" +
                "friends\n" +
                "IN INDIA\n" +
                "Annually, 500,000 people die in India because of non-availability of\n" +
                "organs. With a population of 1.2 billion people, for every 1 million\n" +
                "people, there is only 0.08 persons as organ donors available which is a\n" +
                "very insignificant amount. The need for organ donation has never been\n" +
                "greater. \n" +
                "\n" +
                "The act of organ donation is hard\n" +
                "Anyone above the age of 18 can be an organ donor irrespective of\n" +
                "current or past medical conditions. Children under the age of 18 can\n" +
                "also become donors with permission from a parent or guardian. \n" +
                "But you leave a part of you to the WORLD\n" +
                "\n" +
                "Organ donation can greatly improve the health, life span and the\n" +
                "quality of life of the recipient. A single donors body might save up to 50\n" +
                "people.  \n" +
                "We at AARUUSH would like you to Particicipate in the SELFLESS event\n" +
                "and be a part if something much bigger than YOURSELF.\n" +
                "\n" +
                "Facts\n" +
                "1. 22 people die every day while waiting for a transplant.\n" +
                "2. 1 organ donor can save 8 lives and change the lives of more than 50\n" +
                "people.\n" +
                "3. Almost anyone can be an organ donor, regardless of age or medical\n" +
                "history.\n" +
                "4. 500,000 people are awaiting organ transplantation in India. By the\n" +
                "end of the year, most of them will die due to lack of organs available for\n" +
                "transplantation.\n" +
                "5. India’s organ donation rate is one of the lowest in the world, 0.26 per\n" +
                "million whereas the organ donation rate of the USA is 26 per million\n" +
                "and that of Spain is 36 per million.");

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