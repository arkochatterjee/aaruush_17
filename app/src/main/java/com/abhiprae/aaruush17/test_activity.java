package com.abhiprae.aaruush17;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.bluejamesbond.text.DocumentView;

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class test_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.domain_common);

        DocumentView text = (DocumentView) findViewById(R.id.textView3);
        TextView text1 = (TextView) findViewById(R.id.textView4);
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/avenir.otf");
        //text.setTypeface(typeface2);
        text1.setTypeface(typeface1);
        Intent intent = getIntent();

        String fName = intent.getStringExtra("data");
        int img = intent.getIntExtra("pic",0);
        text.setText(fName);

      //  text.setText("At RoboWars, contestants will have to create a brand, design and create and working robot to tackle real life solutions. Aaruush provides a national level stage to showcase your skills.");
        //  text1.setText("August 19th | Price : Rs.250");
        switch (img)
        {
            case 0:
                break;
            default :
                ImageView i = (ImageView) findViewById(R.id.imageView2);

                //Drawable drawable = getResources().getDrawable(img);
                //i.setImageDrawable(drawable);
                i.setImageResource(img);
                break;

        }


    }
}
