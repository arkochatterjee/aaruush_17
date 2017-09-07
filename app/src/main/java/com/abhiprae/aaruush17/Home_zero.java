package com.abhiprae.aaruush17;

/**
 * Created by Abhiprae on 7/22/2017.
 */

import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Home_zero extends Fragment {

    private TextView txtTimerDay, txtTimerHour, txtTimerMinute, txtTimerSecond;
    private TextView tvEvent;
    private Handler handler;
    private Runnable runnable;


    public Home_zero() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.home_zero, container, false);
        ((MainActivity) getActivity()).setOnBackPressedListener(new BaseBackPressedListener(getActivity()));

        txtTimerDay = (TextView) view.findViewById(R.id.txtTimerDay);
        txtTimerHour = (TextView) view.findViewById(R.id.txtTimerHour);
        txtTimerMinute = (TextView) view.findViewById(R.id.txtTimerMinute);
        txtTimerSecond = (TextView) view.findViewById(R.id.txtTimerSecond);
        //  tvEvent = (TextView) v.findViewById(R.id.tvhappyevent);
        countDownStart();


        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        //tabLayout.addTab(tabLayout.newTab().setText("Notifications"));
        tabLayout.addTab(tabLayout.newTab().setText("Tweets"));


        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        //tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        final ViewPager viewPager = (ViewPager) view.findViewById(R.id.pager);
        // mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        //mRecyclerView.setLayoutManager(mLayoutManager);
        viewPager.setAdapter(new Home_zero.PagerAdapter(getFragmentManager(), tabLayout.getTabCount()));
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

    public void countDownStart() {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
                try {
                    //SimpleDateFormat dateFormat = new SimpleDateFormat(
                    //   "yyyy-MM-dd");


                    SimpleDateFormat dateFormat = new SimpleDateFormat(
                            "dd-MM-yyyy hh:mm:ss");
// Please here set your event date//YYYY-MM-DD
                    Date futureDate = dateFormat.parse("15-09-2017 15:00:00");
                    Date currentDate = new Date();
                    if (!currentDate.after(futureDate)) {
                        long diff = futureDate.getTime()
                                - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        txtTimerDay.setText("" + String.format("%02d", days));
                        txtTimerHour.setText("" + String.format("%02d", hours));
                        txtTimerMinute.setText(""
                                + String.format("%02d", minutes));
                        txtTimerSecond.setText(""
                                + String.format("%02d", seconds));
                    } else {
                        // tvEvent.setVisibility(View.VISIBLE);
                        // tvEvent.setText("The event started!");
                        //textViewGone();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable, 1 * 1000);
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
                    return new twitter_view();
                case 1:
                    return new twitter_view();


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






