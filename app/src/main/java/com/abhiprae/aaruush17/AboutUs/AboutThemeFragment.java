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

public class AboutThemeFragment extends Fragment {

    public AboutThemeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about_theme, container, false);
        Typeface typeface1 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/avenir.otf");
        TextView textView9 = (TextView) view.findViewById(R.id.text9);
        TextView textView10 = (TextView) view.findViewById(R.id.text10);
        TextView textView11 = (TextView) view.findViewById(R.id.text11);
        TextView textView12 = (TextView) view.findViewById(R.id.text12);

        textView9.setText(getResources().getString(R.string.aboutthemetext1));
        textView10.setText(getResources().getString(R.string.aboutthemetext2));
        textView11.setText(getResources().getString(R.string.aboutthemetext3));
        textView12.setText(getResources().getString(R.string.aaruush_towards_infinity));

        textView9.setTypeface(typeface1);
        textView10.setTypeface(typeface1);
        textView11.setTypeface(typeface1);
        textView12.setTypeface(typeface1);
        return view;
    }
}
