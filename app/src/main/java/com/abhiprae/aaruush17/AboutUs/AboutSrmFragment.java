package com.abhiprae.aaruush17.AboutUs;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.abhiprae.aaruush17.R;

import static com.abhiprae.aaruush17.R.id.textView;
import static com.abhiprae.aaruush17.R.id.textView2;
import static com.abhiprae.aaruush17.R.id.textView3;

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class AboutSrmFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about_srm, container, false);
        Typeface typeface1 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/avenir.otf");
        TextView textView3 = (TextView) view.findViewById(R.id.text3);
        TextView textView4 = (TextView) view.findViewById(R.id.text4);
        TextView textView5 = (TextView) view.findViewById(R.id.text5);

        textView3.setText(getResources().getString(R.string.srmabouttext));
        textView4.setText(getResources().getString(R.string.collaborationstitle));
        textView5.setText(getResources().getString(R.string.srmcollabtext));

        textView3.setTypeface(typeface1);
        textView4.setTypeface(typeface1);
        textView5.setTypeface(typeface1);

        return view;
    }
}