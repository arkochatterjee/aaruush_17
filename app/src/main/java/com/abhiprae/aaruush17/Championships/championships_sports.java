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
        text.setText("SPORTS LIST:\n" +
                "1. CRICKET (BOYS)\n" +
                "\t15 PLAYER - REG FEE: 1500/-\n" +
                "\n" +
                "2. MINI CRICKET (BOYS)\n" +
                "\t7 PLAYERS - REG FEE: 700/-\n\n" +
                "3. BADMINTON (BOYS AND GIRLS)\n" +
                "\tSINGLES - REG FEE: 200/-\n" +
                "\tDOUBLES - REG FEE: 400/-\n" +
                "\n" +
                "4. TABLE TENNIS (BOYS AND GIRLS)\n" +
                "\tSINGLES - REG FEE: 200/-\n" +
                "\tDOUBLES - REG FEE: 400/-\n" +
                "\n" +
                "5.CHESS (BOYS AND GIRLS)\n" +
                "\tREG FEE: 200/-\n" +
                "\n" +
                "6. FOOT BALL (BOYS)\n" +
                "\t15 PLAYERS – REGFEE: 1500/-\n" +
                "\n" +
                "7. MINI FOOT BALL (BOYS)\n" +
                "\t7 PLAYER – REGFEE: 700/-\n" +
                "\n" +
                "8. VOLLEY BALL (BOYS)\n" +
                "\t6 PLAYERS - REGFEE: 600/-\n" +
                "\n" +
                "9. THROW BALL (GIRLS)\n" +
                "\t5 PLAYERS - REGFEE: 500/-\n" +
                "\n" +
                "10. ATHLETICS (BOYS AND GIRLS)\n" +
                "\t100 METRES - REGFEE: 200/-\n" +
                "\t200 METRES – REGFEE: 200/-\n" +
                "\n" +
                "11. SLOW CYCLING (GIRLS)\n" +
                "   \tREG FEE: 150/-");
        ImageView i = (ImageView) v.findViewById(R.id.imageView2);
        Drawable drawable = getResources().getDrawable(R.drawable.sports_logo);
        i.setImageDrawable(drawable);
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
        return v;
    }
}