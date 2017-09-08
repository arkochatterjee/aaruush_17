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
 * Created by sarthak on 8/9/17.
 */

public class HL_proshows_fragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.workshop_brainwave, container, false);
        DocumentView text = (DocumentView) v.findViewById(R.id.textView3);
    TextView text1 = (TextView) v.findViewById(R.id.textView4);
    Typeface typeface1 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/avenir.otf");
        text1.setTypeface(typeface1);

        text.setText("MJ5:\n" +
                "To reach a point where only your name says it all. A point MJ5 gets closer to everyday. MJ5 named " +
                "after the late King of Pop Michael Jackson, winners of India's Dancing Superstars 2013 and " +
                "performing ever since.\n\n" +

                "2. Sudhir rao - fluteboxer\n" +
                "At Aaruush'17 we present to you the master of innovation and invention. The one who will " +
                "blend the two and leave you all mesmerized." +
                "Sudhir rao, India's first fluteboxer." +
                "A Beatboxer by profession and turned himself into a musical entertainer by passion.\n\n" +

                "3. Mangesh desai- standup comedian and mentalist.\n" +
                "Certified by The Magic Circle, London, Mangesh Desai's unique comedy-magic and " +
                "mind-reading show delivers an unforgettable and mystical experience! " +
                "Mangesh is an illusionist and a mind reader with a touch of comedy. He performs visual " +
                "illusions and psychological illusions along with situational comedy.\n\n" +

                "4. Raghavendra chauhan- blind fold painter\n" +
                "Aaruush towards infinity.\n" +
                "Keeing up with our legacy, at AARUUSH'17,we present to you, an artist so good, he could " +
                "paint with his eyes closed! " +
                "Well, literally. " +
                "And that too in a minute or less! ");

        text1.setText("\nFor more info visit your nearest Aaruush Helpdesk");

    ImageView i = (ImageView) v.findViewById(R.id.imageView2);
    Drawable drawable = getResources().getDrawable(R.drawable.proshow);
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
