package com.abhiprae.aaruush17.Championships;

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
 * Created by Arko Chatterjee on 27-07-2017.
 */

public class championships_sports extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.workshop_brainwave, container, false);
        DocumentView text = (DocumentView) v.findViewById(R.id.textView3);
        TextView text1 = (TextView) v.findViewById(R.id.textView4);
        Typeface typeface1 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/avenir.otf");
        //text.setTypeface(typeface2);
        text1.setTypeface(typeface1);
        text.setText("If you think you have enough athletic prowess, come and be a part of Aaruush's Sports Championships." +
                " This event includes sports like cricket, football, Table Tennis and more." +
                " Here's your best chance to prove your mettle, and lift the trophy!");
        ImageView i = (ImageView) v.findViewById(R.id.imageView2);
        Drawable drawable = getResources().getDrawable(R.drawable.sports_logo);
        i.setImageDrawable(drawable);
        i.setImageDrawable(drawable);
        Button button = (Button) v.findViewById(R.id.button);
        button.setVisibility(View.GONE);
        //button.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View view) {
              //  Uri uri = Uri.parse("https://www.thecollegefever.com/events/aaruush17");
                //Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                //startActivity(intent);
           // }
        //});
        return v;
    }
}