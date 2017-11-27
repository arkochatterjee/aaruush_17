package com.abhiprae.aaruush17;

/**
 * Created by Abhiprae on 7/22/2017.
 */

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
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
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Home_zero extends Fragment {

    private TextView txtTimerDay, txtTimerHour, txtTimerMinute, txtTimerSecond,day;
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

      //  txtTimerDay = (TextView) view.findViewById(R.id.txtTimerDay);
       // txtTimerHour = (TextView) view.findViewById(R.id.txtTimerHour);
        //txtTimerMinute = (TextView) view.findViewById(R.id.txtTimerMinute);
        //txtTimerSecond = (TextView) view.findViewById(R.id.txtTimerSecond);
        day = (TextView) view.findViewById(R.id.daycount);


        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "dd-MM-yyyy");
        Date currentDate = new Date();
        String strDate = dateFormat.format(currentDate);
        String date=strDate.substring(0,2);
       // day.setText(date);

        Typeface typeface2 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/avenir.otf");
        day.setTypeface(typeface2);

        if(date.equals("15"))
            day.setText("DAY 0");
        if(date.equals("16"))
            day.setText("DAY 1");
        if(date.equals("17"))
            day.setText("DAY 2");
        if(date.equals("18"))
            day.setText("DAY 3");
        if(date.equals("19"))
            day.setText("DAY 4");

        //  tvEvent = (TextView) v.findViewById(R.id.tvhappyevent);
      //  countDownStart();

        Button common=(Button) view.findViewById(R.id.commonregis);
        common.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://aaruush.eventze.in/sign_in");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
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
                  //  Date futureDate = dateFormat.parse("15-09-2017 15:00:00");
                   // Date futureDate = dateFormat.parse("14-09-2017");
                    Date futureDate0 = dateFormat.parse("15-09-2017 ");
                    Date futureDate1 = dateFormat.parse("16-09-2017");
                    Date futureDate2 = dateFormat.parse("17-09-2017");
                    Date futureDate3 = dateFormat.parse("18-09-2017");
                    Date futureDate4 = dateFormat.parse("19-09-2017");
                    Date currentDate = new Date();
                    String strDate = dateFormat.format(currentDate);
                    day.setText(strDate);
                    /*if(currentDate.equals(futureDate0))
                        day.setText("Day 0");
                    if (currentDate.equals(futureDate1))
                    day.setText("Day 1");
                    if (currentDate.equals(futureDate2))
                        day.setText("Day 2");
                    if (currentDate.equals(futureDate3))
                        day.setText("Day 3");
                    if (currentDate.equals(futureDate4))
                        day.setText("Day 4");

                    /*if (!currentDate.after(futureDate)) {
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
                         tvEvent.setVisibility(View.VISIBLE);
                         tvEvent.setText("The event started!");
                        //textViewGone();
                    }*/
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






