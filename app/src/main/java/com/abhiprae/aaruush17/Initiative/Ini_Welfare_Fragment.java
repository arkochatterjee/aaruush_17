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

public class Ini_Welfare_Fragment extends android.support.v4.app.Fragment {

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

        text.setText("Welfare of Oppressed Friends\n" +
                "Vision – To nurture a society in which people understand the\n" +
                "importance of dogs as a friend and not to harm them in any way.\n" +
                "Mission – To create awareness in society on how to protect dogs from\n" +
                "any harm and promote their healthy living.\n" +
                "\n" +
                "WOOF(Welfare Of Oppressed Friends) aims to help the condition of the\n" +
                "most innocent animals dogs and making their lives a little better with\n" +
                "efforts of Aaruush. It has been scientifically proven that dogs are as\n" +
                "delicate as a human child. We hope with the start of this campaign we\n" +
                "can make this society a beer place for human’s best friend. Due to high\n" +
                "cost, rabies vaccines are not readily available across local health centers\n" +
                "in India which in turn forces people to delay their treatment. This\n" +
                "initiative aims to make everyone aware about the need for proper\n" +
                "treatment and medication that needs to be provided to stray dogs and\n" +
                "help them live peacefully and happily. WOOF also aims to provide\n" +
                "awareness about the vaccination and promise ourselves that when we\n" +
                "look at a dog, we don’t see it just like an animal but like a friend who\n" +
                "just needs love and affection. They’re like angels in this world and some\n" +
                "choose fur over wings.\n" +
                "\n" +
                "Facts\n" +
                "1. Article 51-A(g) of the Indian Constitution states that, “It shall be the\n" +
                "duty of every citizen of India to protect and improve the natural\n" +
                "\n" +
                "environment including forests, lakes, rivers and wildlife and to have\n" +
                "compassion for living creatures.”\n" +
                "2. Stray dogs that have been operated for birth control cannot be\n" +
                "captured or relocated by anybody including any authority, ABC Rules\n" +
                "2001.\n" +
                "3. To kill or maim any animal, including stray animals, is a punishable\n" +
                "offence. IPC Sections 428 and 429.\n" +
                "4. Abandoning any animal for any reason can land you in prison for up\n" +
                "to three months. Section 11(1)(i) and Section 11(1)(j), PCA Act, 1960.\n" +
                "5. Around 10,000 dogs are killed every year during China’s Yulin Dog\n" +
                "Meat Festival");

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