package com.abhiprae.aaruush17;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class credits_fragment extends Fragment {

    List<ViewFlipperItem> patrons;

    public credits_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Patrons");
        View view = inflater.inflate(R.layout.credits, container, false);
        ((MainActivity) getActivity()).setOnBackPressedListener(new BaseBackPressedListener(getActivity()));

        /*
        final ListView list_patrons = (ListView) view.findViewById(R.id.list_patrons);

        patrons=new ArrayList<>();

        patrons.add(new ViewFlipperItem(R.drawable.director, "Arko Chatterjee", R.color.sienna, "Director E & T","Patron","director.et@srmuniv.ac.in"));
        patrons.add(new ViewFlipperItem(R.drawable.convenor, "Risabh ", R.color.saffron, "Convenor - Aaruush","Patron","convenor@aaruush.net"));

        patrons.add(new ViewFlipperItem(R.drawable.convenor, "Sarthak Kumar", R.color.saffron, "Convenor - Aaruush","Patron","convenor@aaruush.net"));

        FlipSettings settings = new FlipSettings.Builder().defaultPage(1).build();
        list_patrons.setAdapter(new ViewFlipperAdapter(getActivity(), patrons, settings));
        list_patrons.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String contact = (patrons.get(i).getInterests().get(2));
                if (contact.contains("@")) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("plain/text");
                    intent.putExtra(Intent.EXTRA_EMAIL, new String[]{contact});
                    intent.putExtra(Intent.EXTRA_SUBJECT, "subject");
                    intent.putExtra(Intent.EXTRA_TEXT, "mail body");
                    startActivity(Intent.createChooser(intent, ""));
                } else {
                    String x = "tel:" + contact;
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse(x));
                    startActivity(callIntent);
                }
            }
        });*/

        return view;
    }

}
