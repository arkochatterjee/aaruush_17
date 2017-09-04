package com.abhiprae.aaruush17.Workshops;

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
 * Created by Abhiprae on 7/22/2017.
 */

public class workshop_theScribbledStories extends android.support.v4.app.Fragment {

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

        text.setText("This workshop engages  participants to scribble their thoughts in a few lines or words.");
        text1.setText("August 19th | Price : Rs.250");

        ImageView i = (ImageView) v.findViewById(R.id.imageView2);
        Drawable drawable = getResources().getDrawable(R.drawable.app_scr);
        i.setImageDrawable(drawable);
        Button button = (Button) v.findViewById(R.id.button);
        button.setVisibility(View.GONE);
        //button.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View view) {
              //  Uri uri = Uri.parse("https://www.thecollegefever.com/events/aaruush17");
                //Intent intent = new Intent(Intent.ACTION_VIEW, uri);
               // startActivity(intent);
           // }
        //});
        return v;
    }
}
