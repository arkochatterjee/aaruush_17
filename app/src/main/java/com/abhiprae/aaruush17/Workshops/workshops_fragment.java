package com.abhiprae.aaruush17.Workshops;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abhiprae.aaruush17.R;

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class workshops_fragment extends Fragment {


    public workshops_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_workshops_fragment, container, false);

        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);

        tabLayout.addTab(tabLayout.newTab().setText("Hacktrack"));
        tabLayout.addTab(tabLayout.newTab().setText("Social Media Analytics using Big Data"));
        tabLayout.addTab(tabLayout.newTab().setText("Bike Over Hauling"));
        tabLayout.addTab(tabLayout.newTab().setText("Swarm Robotics - Obstancle Avoidance"));
        tabLayout.addTab(tabLayout.newTab().setText("Quadcoter"));
        tabLayout.addTab(tabLayout.newTab().setText("Webench Power Tool by Texas Instruments"));
        tabLayout.addTab(tabLayout.newTab().setText("Cognitive Computing using watson"));
        tabLayout.addTab(tabLayout.newTab().setText("Photography"));
        tabLayout.addTab(tabLayout.newTab().setText("The Scribbled Stories"));


        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        final ViewPager viewPager = (ViewPager) view.findViewById(R.id.pager);
        // mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        //mRecyclerView.setLayoutManager(mLayoutManager);
        viewPager.setAdapter(new PagerAdapter(getFragmentManager(), tabLayout.getTabCount()));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        //tabLayout.setupWithViewPager(viewPager);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return view;
    }


    public class PagerAdapter extends FragmentStatePagerAdapter {
        int mNumOfTabs;

        public PagerAdapter(FragmentManager fm, int NumOfTabs) {
            super(fm);
            this.mNumOfTabs = NumOfTabs;
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return new HackTrackFragment();
                case 1:
                    return new workshop_socialmediadataanalytics();
                case 2:
                    return new workshop_bikeoverhauling();
                case 3:
                    return new workshop_swarmrobotics();
                case 4:
                    return new workshop_quadcopter();
                case 5:
                    return new WebenchFragment();
                case 6:
                    return new CognitiveFragment();
                case 7:
                    return new workshop_photography();
                case 8:
                    return new workshop_theScribbledStories();


                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return mNumOfTabs;
        }
    }


}
