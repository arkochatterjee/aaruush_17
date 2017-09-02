package com.abhiprae.aaruush17.AboutUs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abhiprae.aaruush17.R;

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class AboutTimlineFragment extends Fragment {

    public AboutTimlineFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_timline, container, false);
    }
}
