package com.abhiprae.aaruush17.Domains;

/**
 * Created by Abhiprae on 7/22/2017.
 */

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

import com.abhiprae.aaruush17.BaseBackPressedListener;
import com.abhiprae.aaruush17.MainActivity;
import com.abhiprae.aaruush17.R;

public class domains_fragment extends Fragment {


    public domains_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_domains_fragment, container, false);
        ((MainActivity) getActivity()).setOnBackPressedListener(new BaseBackPressedListener(getActivity()));


        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("ROBOGYAN"));
        tabLayout.addTab(tabLayout.newTab().setText("MAGEFFICIE"));
        tabLayout.addTab(tabLayout.newTab().setText("X-ZONE"));
        tabLayout.addTab(tabLayout.newTab().setText("BLUEBOOK"));
        tabLayout.addTab(tabLayout.newTab().setText("FUNDAZ"));
        tabLayout.addTab(tabLayout.newTab().setText("VIMANAZ"));
        tabLayout.addTab(tabLayout.newTab().setText("ARCHITECTURE"));
        tabLayout.addTab(tabLayout.newTab().setText("KONSTRUKTION"));
        tabLayout.addTab(tabLayout.newTab().setText("DIGITAL DESIGN"));
        tabLayout.addTab(tabLayout.newTab().setText("ELECTRIZITE"));
        tabLayout.addTab(tabLayout.newTab().setText("MACHINATION"));
        tabLayout.addTab(tabLayout.newTab().setText("PRAESENTATIO"));
        tabLayout.addTab(tabLayout.newTab().setText("YUDDHAME"));
        tabLayout.addTab(tabLayout.newTab().setText("ONLINE"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        //tabLayout.setTabTextColors();


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
                    return new FragmentTab_Robogyan();
                case 1:
                    return new Domain_maggiefice();
                case 2:
                    return new Domain_XZone();
                case 3:
                    return new Domain_Bluebook();
                case 4:
                    return new Domain_Fundaz();
                case 5:
                    return new Domain_Vimanaz();
                case 6:
                    return new Domain_Architecture();
                case 7:
                    return new Domain_Konstruktion();
                case 8:
                    return new Domain_DigitalDesign();
                case 9:
                    return new Domain_Electrizite();
                case 10:
                    return new Domain_Machinathon();
                case 11:
                    return new Domain_Presentatio();
                case 12:
                    return new Domain_Yudhhame();
                case 13:
                    return new Domain_Online();

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
