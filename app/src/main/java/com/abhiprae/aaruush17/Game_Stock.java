package com.abhiprae.aaruush17;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;

import Model.Session;
import Model.Stock;

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class Game_Stock extends android.support.v4.app.Fragment {

    ExpandableListView stocks, bought;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.game_stock, container, false);
        ((GameLoading)getActivity()).setOnBackPressedListener(new BaseBackPressedListener(getActivity()));
        TextView invest = (TextView) v.findViewById(R.id.invest);
        invest.setText(Session.getUser().getBalance() + "");
        TextView asset = (TextView) v.findViewById(R.id.total);
        asset.setText(Session.getUser().getAsset() + "");
        stocks = (ExpandableListView) v.findViewById(R.id.stocks);
        bought = (ExpandableListView) v.findViewById(R.id.bought);
        Stock[] st = Session.getStocks();
        Stock[] st1 = Session.getBought();
        int len1 = st1.length;
        int prices1[] = new int[len1];
        String names1[] = new String[len1];
        for (int i = 0; i < len1; i++) {
            names1[i] = st1[i].getName();
            prices1[i] = st1[i].getPrice();
        }
        MyCustomAdapter myCustomAdapter1 = new MyCustomAdapter(getActivity(), 0, names1, prices1);
        bought.setAdapter(myCustomAdapter1);
        if (st.length > 0) {
            int len = st.length;
            int c = 0;
            String s = "";
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len1; j++) {
                    if (st[i].getName().equals(names1[j])) {
                        s = s + "" + i;
                        break;
                    } else {
                        c++;
                    }
                }
            }
            Log.d("Length--------------", st.length + " " + c);
            int prices[];
            String names[];
            if (st1.length > 0) {
                len = c;
                prices = new int[len];
                names = new String[len];
                int x = 0;
                for (int i = 0; i < st.length; i++) {
                    if (s.indexOf("" + i) >= 0) {
                        continue;
                    }
                    names[x] = st[i].getName();
                    prices[x] = st[i].getPrice();
                    x++;
                }
            } else {
                prices = new int[len];
                names = new String[len];
                for (int i = 0; i < st.length; i++) {
                    names[i] = st[i].getName();
                    prices[i] = st[i].getPrice();
                }
            }
            MyCustomAdapter myCustomAdapter = new MyCustomAdapter(getActivity(), 1, names, prices);
            stocks.setAdapter(myCustomAdapter);
        }

        return v;
    }
}