package com.abhiprae.aaruush17;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bluejamesbond.text.DocumentView;

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
        DocumentView text1 = (DocumentView) findViewById(R.id.textView4);
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/M_R.ttf");
        text.setTypeface(typeface1);
        ImageView imageView = (ImageView) findViewById(R.id.imageView2);

        text1.setText(getIntent().getStringExtra("data"));
        imageView.setImageResource(getIntent().getIntExtra("pic",0));
    }
}