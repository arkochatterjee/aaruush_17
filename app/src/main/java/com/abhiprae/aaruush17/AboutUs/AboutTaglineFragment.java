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

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class AboutTaglineFragment extends Fragment {

    public AboutTaglineFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about_tagline, container, false);
        Typeface typeface1 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/avenir.otf");
        TextView textView6 = (TextView) view.findViewById(R.id.text6);
        TextView textView7 = (TextView) view.findViewById(R.id.text7);
        TextView textView8 = (TextView) view.findViewById(R.id.text8);

        textView6.setText(getResources().getString(R.string.taglinetext1));
        textView7.setText(getResources().getString(R.string.taglinetext2));
        textView8.setText(getResources().getString(R.string.taglinetext3));

        textView6.setTypeface(typeface1);
        textView7.setTypeface(typeface1);
        textView8.setTypeface(typeface1);

        return view;
    }
}
