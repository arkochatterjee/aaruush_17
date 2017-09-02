package com.abhiprae.aaruush17.AboutUs;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abhiprae.aaruush17.R;

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class about_us extends Fragment {


    public about_us() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.about_us, container, false);
        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) v.findViewById(R.id.viewpager);
        // Create an adapter that knows which fragment should be shown on each page
        AboutUsAdapter adapter = new AboutUsAdapter(getActivity().getSupportFragmentManager());
        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(1);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) v.findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
        return v;

    }
}
