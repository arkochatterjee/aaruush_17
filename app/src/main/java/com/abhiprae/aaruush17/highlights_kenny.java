package com.abhiprae.aaruush17;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class highlights_kenny extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.highlights_kenny);


        TextView text = (TextView) findViewById(R.id.textView3);
        TextView text1 = (TextView) findViewById(R.id.textView4);
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/M_R.ttf");
        text.setTypeface(typeface1);
        text1.setTypeface(typeface1);
    }
}