package com.abhiprae.aaruush17;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abhiprae.aaruush17.Domain_Adapters.MyAdapterHighlights;

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class FragmentTab_Highlights_GuestLectures extends Fragment {

    RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab, container, false);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.rv_recycler_view);
        rv.setHasFixedSize(true);
        MyAdapterHighlights adapter = new MyAdapterHighlights(new String[]{"Harsh Songra", "Suneet Tuli","Mira Erda","Arjun Vajpai","Benild Joseph"});
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);
        return view;
    }
}