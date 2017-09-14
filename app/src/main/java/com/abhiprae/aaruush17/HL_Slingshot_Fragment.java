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
 * Created by Arko Chatterjee on 14-09-2017.
 */

public class HL_Slingshot_Fragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.workshop_brainwave, container, false);
        DocumentView text = (DocumentView) v.findViewById(R.id.textView3);
        TextView text1 = (TextView) v.findViewById(R.id.textView4);
        Typeface typeface1 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/avenir.otf");
        text1.setTypeface(typeface1);

        text.setText("The right decision is the one you almost don't take.\n" +
                "Take a shot at Slingshot. Aaruush gives your startup a chance of recognition and fame. Beginning with mentoring sessions to your very first pitch deck.\n" +
                "Aaruush's very own Shark Tank\n" +
                "We say ideas are bulletproof, let's personify it.\n\n"+
                  "Strategic Partner : Fame Technologies\n\n"+
                  "Start Up Ecosystem Partner : F6S ");

        text1.setText("\nFor more info visit your nearest Aaruush Helpdesk");

        ImageView i = (ImageView) v.findViewById(R.id.imageView2);
        Drawable drawable = getResources().getDrawable(R.drawable.sling);
        i.setImageDrawable(drawable);
        Button button = (Button) v.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://aaruush.eventze.in/sign_in");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        button.setVisibility(View.GONE);
        return v;
    }
}