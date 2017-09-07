package com.abhiprae.aaruush17.Domains;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.abhiprae.aaruush17.BaseBackPressedListener;
import com.abhiprae.aaruush17.MainActivity;
import com.abhiprae.aaruush17.Domain_Adapters.MyAdapter_DXZone;
import com.abhiprae.aaruush17.R;

/**
 * Created by Arko Chatterjee on 30-08-2017.
 */

public class Domain_XZone extends Fragment {



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab, container, false);

        ((MainActivity) getActivity()).setOnBackPressedListener(new BaseBackPressedListener(getActivity()));
        ((TextView) view.findViewById(R.id.domain_des)).setText("Gamers Don't Die, They Respawn!");


        RecyclerView rv = (RecyclerView) view.findViewById(R.id.rv_recycler_view);
        rv.setHasFixedSize(true);
        MyAdapter_DXZone adapter = new MyAdapter_DXZone(new String[]{"Breaking Bad", "Casio Mania", "Cryptic Crack","Fantastic Beasts"});
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);


        return view;
    }
}
