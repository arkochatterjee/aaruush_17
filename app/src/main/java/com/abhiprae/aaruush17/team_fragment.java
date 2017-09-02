package com.abhiprae.aaruush17;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class team_fragment extends Fragment {

    private RecyclerView recyclerView;
    private AlbumsAdapter2 adapter2;
    private List<Album2> albumList2;


    public team_fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_team_fragment, container, false);
        ((MainActivity) getActivity()).setOnBackPressedListener(new BaseBackPressedListener(getActivity()));
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_recycler_view);

        albumList2 = new ArrayList<>();
        adapter2 = new AlbumsAdapter2(this.getContext(), albumList2);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this.getContext(), 1);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new team_fragment.GridSpacingItemDecoration(1, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter2);

        prepareAlbums();


        return view;
    }

    private void prepareAlbums() {
        int[] covers = new int[]{
                R.drawable.haroon,
                R.drawable.ranshu,
                R.drawable.dakshita,
                R.drawable.ashrita,
                R.drawable.nishanth,
                R.drawable.pranav,
                R.drawable.saikumar,
                R.drawable.vivek,
                R.drawable.poojith,
                R.drawable.saikolla,
                R.drawable.uday,
                R.drawable.arjun,
                R.drawable.kaushal,
                R.drawable.gautham,
                R.drawable.radhika,
                R.drawable.sabiq,
                R.drawable.saikrishna,
                R.drawable.pavan,
                R.drawable.aneek,
                R.drawable.shivansh,
                R.drawable.manish,
                R.drawable.soumya,
                R.drawable.naveen,
                R.drawable.kalaivani,
                R.drawable.shobit,
                R.drawable.shruthi,
                R.drawable.sashank,
                R.drawable.abhiprae,
                R.drawable.sanika,
                R.drawable.amans,
                R.drawable.amank,
                R.drawable.nishanth,};

        Album2 a = new Album2("Haroon Rashid", "SECRETARY", covers[0]);
        albumList2.add(a);

        a = new Album2("Ranshu Anandan", "Joint Secretary & PRO", covers[1]);
        albumList2.add(a);

        a = new Album2("Dakshita Kumar", "PRO", covers[2]);
        albumList2.add(a);

        a = new Album2("Ashrita R Setlur", "PRO", covers[3]);
        albumList2.add(a);

        a = new Album2("Nishanth Buggineni", "Corporate Strategy & Implementation", covers[4]);
        albumList2.add(a);

        a = new Album2("Pranav Dhingra", "Corporate Strategy & Implementation", covers[5]);
        albumList2.add(a);

        a = new Album2("Sai Kumar", "Finance", covers[6]);
        albumList2.add(a);

        a = new Album2("Vivek Kumar", "Finance", covers[7]);
        albumList2.add(a);

        a = new Album2("K Poojith Sai Kumar", "Operations & Resource Management", covers[8]);
        albumList2.add(a);

        a = new Album2("Sai Kumar", "Operations & Resource Management", covers[9]);
        albumList2.add(a);

        a = new Album2("Kaja Uday Mallikarjun", "Creatives & Media", covers[10]);
        albumList2.add(a);

        a = new Album2("Arjun R", "Creatives & Media", covers[11]);
        albumList2.add(a);

        a = new Album2("Kaushal Ganta", "Media & Envision", covers[12]);
        albumList2.add(a);

        a = new Album2("Gautham Reddy.Ch", "Envision , Arts & Deco", covers[13]);
        albumList2.add(a);

        a = new Album2("Radhika Shukla", "Envision & Bluebook", covers[14]);
        albumList2.add(a);

        a = new Album2("Sabiq Ali Chaudhary", "Envision", covers[15]);
        albumList2.add(a);

        a = new Album2("Sai Krishna", "Sponsorships", covers[16]);
        albumList2.add(a);

        a = new Album2("Sai Pavan V", "Sponsorship & Marketing,Highlights", covers[17]);
        albumList2.add(a);

        a = new Album2("Aneek Barman Roy", "Sponsorships & Workshops", covers[18]);
        albumList2.add(a);

        a = new Album2("Sivansh Mishra", "Highlights", covers[19]);
        albumList2.add(a);

        a = new Album2("Manish Agarwal", "Quality Assurance", covers[20]);
        albumList2.add(a);

        a = new Album2("Sowmya Sharma", "Quality Assurance", covers[21]);
        albumList2.add(a);

        a = new Album2("Y R V V Naveen Raja", "Championships", covers[22]);
        albumList2.add(a);

        a = new Album2("Kalaivani B", "Deco & Arts", covers[23]);
        albumList2.add(a);

        a = new Album2("Shobith Mishra", "Events & Praesentatio", covers[24]);
        albumList2.add(a);

        a = new Album2("Sruthi Pandey", "Magefficie", covers[25]);
        albumList2.add(a);

        a = new Album2("B. Sai Sashank", "Xzone,Digital Design & Activities", covers[26]);
        albumList2.add(a);

        a = new Album2("Abhiprae Choudhury", "Fundaz & Vimanaz", covers[27]);
        albumList2.add(a);

        a = new Album2("Sanika Thakar", "Robogyan & Robotics Club", covers[28]);
        albumList2.add(a);

        a = new Album2("Aman Siraj Siddiqui", "Electrizite", covers[29]);
        albumList2.add(a);

        a = new Album2("Aman Kumar", "Yuddhame", covers[30]);
        albumList2.add(a);

        a = new Album2("Nishant Sharma", "Konstruktion", covers[31]);
        albumList2.add(a);
        adapter2.notifyDataSetChanged();
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
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