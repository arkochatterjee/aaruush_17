package com.abhiprae.aaruush17.Domains;

/**
 * Created by Abhiprae on 7/22/2017.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.abhiprae.aaruush17.Domain_Adapters.MyAdapter;
import com.abhiprae.aaruush17.R;

public class FragmentTab_Robogyan extends Fragment {

    // RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab, container, false);


        ((TextView) view.findViewById(R.id.domain_des)).setText("Logic | Develope | Automate");
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.rv_recycler_view);
        rv.setHasFixedSize(true);
        MyAdapter adapter = new MyAdapter(new String[]{"CARBON", "PRO-STREET", "MOST WANTED", "SHIFT"});
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);


        return view;
    }
}