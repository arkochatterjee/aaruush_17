package com.abhiprae.aaruush17;

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

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class highlights_fragment extends Fragment {


    public highlights_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_highlights_fragment, container, false);
        ((MainActivity) getActivity()).setOnBackPressedListener(new BaseBackPressedListener(getActivity()));


        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Comedy Nite"));
        //tabLayout.addTab(tabLayout.newTab().setText("Movie Nite"));
        tabLayout.addTab(tabLayout.newTab().setText("Live in Concert"));
        tabLayout.addTab(tabLayout.newTab().setText("Proshow"));
        tabLayout.addTab(tabLayout.newTab().setText("Guest Lectures"));
        //tabLayout.addTab(tabLayout.newTab().setText("Expos"));
        //tabLayout.addTab(tabLayout.newTab().setText("Industrial Conclave"));
        //tabLayout.addTab(tabLayout.newTab().setText("Unconference"));
        //tabLayout.addTab(tabLayout.newTab().setText("Make in India Summit"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        final ViewPager viewPager = (ViewPager) view.findViewById(R.id.pager);
        // mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        //mRecyclerView.setLayoutManager(mLayoutManager);
        viewPager.setAdapter(new highlights_fragment.PagerAdapter(getFragmentManager(), tabLayout.getTabCount()));
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
                    return new HL_ComedyNite_Fragment();
                case 1:
                    return new HL_MusicalNite_Fragment();
                case 2:
                    return new HL_proshows_fragment();
                case 3:
                    return new FragmentTab_Highlights_GuestLectures();
                /*case 4:
                    return new FragmentTab_Highlights_GuestLectures();

                case 5:
                    return new FragmentTab_Highlights_GuestLectures();
                case 6:
                    return new FragmentTab_Highlights_GuestLectures();
                case 7:
                    return new FragmentTab_Highlights_GuestLectures();
                case 8:
                    return new FragmentTab_Highlights_GuestLectures();
*/
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