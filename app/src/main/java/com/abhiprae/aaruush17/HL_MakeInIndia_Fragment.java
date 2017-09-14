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

public class HL_MakeInIndia_Fragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.workshop_brainwave, container, false);
        DocumentView text = (DocumentView) v.findViewById(R.id.textView3);
        TextView text1 = (TextView) v.findViewById(R.id.textView4);
        Typeface typeface1 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/M_R.ttf");
        Typeface typeface2 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/avenir.otf");
        text1.setTypeface(typeface2);

        text.setText("\nDebashish Mitra: Debashish Mitra , an Indian-American mathematician has got his B.Sc. and Ph.D. in Electrical Engineering from University of London .His current research interests are in the scientific foundations of policy that impact engineers and engineering systems . He holds 21 patents and his publications have been cited 11,332 times .\n" +
                "He received The Premium award for best publication (IEEE,England), IEEE Fellow, Bell labs fellow,Elected to National Academy of Engineering for contributions to communication systems, Steven.O.Rice Prize paper for his paper Asymptotically Optimal Design of Congestion Control for High Speed Data Networks.\n" +
                "\n\n" +
                "Vineet Manjrarkar: Vineet is a born leader known for innovative ideas and enthusiasm. With 25 years of experience ranging from stock broking to automotive machines and system automation, he has worked in India as well as in Germany in executive director positions. It his penchant for making a difference to his nation that brought him back to India to sow the seeds of international class of manufacturing and automation. \n" +
                "Though he takes great pride in being a machine designer, he is a business risk taker with a high success rate. He has not only mentored managers and senior executives, he makes it a point to spare time for child education in villages because he believes in his obligation towards society.");

        text1.setText("\nFor more info visit your nearest Aaruush Helpdesk");

        ImageView i = (ImageView) v.findViewById(R.id.imageView2);
        Drawable drawable = getResources().getDrawable(R.drawable.makeindia);
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