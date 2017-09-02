package com.abhiprae.aaruush17;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import Model.Session;
import Model.User;

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class Game_Rank extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.game_rank, container, false);
        ((GameLoading)getActivity()).setOnBackPressedListener(new BaseBackPressedListener(getActivity()));
        ExpandableListView ranks = (ExpandableListView) v.findViewById(R.id.participants);
        User[] leaderboard = Session.getLeaderboard();
        int len = leaderboard.length;
        int[] rank = new int[len];
        String[] name = new String[len];
        double[] total = new double[len];
        for (int i = 0; i < len; i++) {
            rank[i] = leaderboard[i].getId();
            name[i] = leaderboard[i].getName();
            total[i] = leaderboard[i].getBalance();
        }
        MyCustomAdapter2 myCustomAdapter2 = new MyCustomAdapter2(getActivity(), rank, name, total);
        ranks.setAdapter(myCustomAdapter2);
        return v;
    }
}
