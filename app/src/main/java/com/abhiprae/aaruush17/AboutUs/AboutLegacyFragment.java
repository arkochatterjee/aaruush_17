package com.abhiprae.aaruush17.AboutUs;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.abhiprae.aaruush17.R;

import static com.abhiprae.aaruush17.R.string.legacytext1;

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class AboutLegacyFragment extends Fragment {

    public AboutLegacyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about_legacy, container, false);

        Typeface typeface1 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/avenir.otf");

        TextView textView = (TextView) view.findViewById(R.id.text);
        TextView textView1 = (TextView) view.findViewById(R.id.text1);
        TextView textView2 = (TextView) view.findViewById(R.id.text2);

        textView.setText(getResources().getString(R.string.legacytext1));
        textView1.setText(getResources().getString(R.string.legacytext2));
        textView2.setText(getResources().getString(R.string.legacytext3));

        textView.setTypeface(typeface1);
        textView1.setTypeface(typeface1);
        textView2.setTypeface(typeface1);

        return view;
    }
}
