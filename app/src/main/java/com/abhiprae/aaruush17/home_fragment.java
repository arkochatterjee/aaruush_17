package com.abhiprae.aaruush17;

/**
 * Created by Abhiprae on 7/22/2017.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class home_fragment extends android.support.v4.app.Fragment {

    String textview;
    String fetchedtextview;
    Albums3Timeline a;
    int[] covers = new int[]{
            R.drawable.ic_marker_active,
            R.drawable.aaruushsun,
    };
    private TextView txtTimerDay, txtTimerHour, txtTimerMinute, txtTimerSecond;
    private TextView tvEvent;
    private Handler handler;
    private Runnable runnable;
    private RecyclerView recyclerView;
    private AlbumsAdapter3Timeline adapter2;
    private List<Albums3Timeline> albumList;
    private BroadcastReceiver activityReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            //TextView textview = (TextView) v.findViewById(R.id.textView3);
            Bundle bundle = intent.getBundleExtra("msg");
            textview = (bundle.getString("msgBody"));

            // prepareAlbums();
            a = new Albums3Timeline("", textview, covers[1]);
            albumList.add(a);
            adapter2.notifyDataSetChanged();

        }
    };

    public home_fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home_fragment, container, false);
        ((MainActivity) getActivity()).setOnBackPressedListener(new BaseBackPressedListener(getActivity()));
        /*database = FirebaseDatabase.getInstance();
        myRef = database.getReference().child("notifications");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                fetchedtextview = dataSnapshot.child("notifications").getValue(String.class);
                a = new Albums3Timeline("",fetchedtextview,covers[1]);
                albumList.add(a);
                adapter2.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(getActivity(),"hi",Toast.LENGTH_SHORT).show();
            }
        });*/


        // TextView text = (TextView) v.findViewById(R.id.home_text);
        Typeface typeface1 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/M_R.ttf");
        // text.setTypeface(typeface1);


        if (activityReceiver != null) {
            IntentFilter intentFilter = new IntentFilter("ACTION_STRING_ACTIVITY");
            getActivity().registerReceiver(activityReceiver, intentFilter);
        }


        txtTimerDay = (TextView) v.findViewById(R.id.txtTimerDay);
        txtTimerHour = (TextView) v.findViewById(R.id.txtTimerHour);
        txtTimerMinute = (TextView) v.findViewById(R.id.txtTimerMinute);
        txtTimerSecond = (TextView) v.findViewById(R.id.txtTimerSecond);
        //  tvEvent = (TextView) v.findViewById(R.id.tvhappyevent);
        countDownStart();


        recyclerView = (RecyclerView) v.findViewById(R.id.rv_recycler_view);

        albumList = new ArrayList<>();
        adapter2 = new AlbumsAdapter3Timeline(this.getContext(), albumList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this.getContext(), 1);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new home_fragment.GridSpacingItemDecoration(1, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter2);

        //    prepareAlbums();


        return v;

    }

    /*   private void prepareAlbums() {
           int[] covers = new int[]{
                   R.drawable.ic_marker_active,
                   R.drawable.aaruushsun,
                   };

           Albums3Timeline a = new Albums3Timeline("13th July | 10:00 am", "Day 1 of T-Summit has begun in TP Ganesan Auditorium, SRM University.", covers[1]);
           albumList.add(a);

           a = new Albums3Timeline("14th July | 05:00 pm", "Day 2 of T-Summit has ended. IIT Madras won the best college award.", covers[1]);
           albumList.add(a);
           a = new Albums3Timeline("16th July | 03:00 pm", "Freshers orientation starts tomorrow.", covers[1]);
           albumList.add(a);
           a = new Albums3Timeline("16th July | 07:00 pm", "Vodafone is now our Power Sponsor.", covers[1]);
           albumList.add(a);
           a = new Albums3Timeline("17th July | 09:00 am", "Orientation for freshers has been started.", covers[1]);
           albumList.add(a);

           a = new Albums3Timeline("18th July | 12:00 pm", "Meet Team Aaruush on 20th July, 11:30 AM in Orientaion.", covers[1]);
           albumList.add(a);


           adapter2.notifyDataSetChanged();
       }

       /**
        * Converting dp to pixel
        */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
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
                    Date futureDate = dateFormat.parse("16-09-2017 09:00:00");
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

    @Override
    public void onPause() {
        super.onPause();
        getActivity().unregisterReceiver(activityReceiver);
    }

    @Override
    public void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter("ACTION_STRING_ACTIVITY");
        getActivity().registerReceiver(activityReceiver, intentFilter);
    }

    /**
     * RecyclerView item decoration - give equal margin around grid item
     */


    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }
}
