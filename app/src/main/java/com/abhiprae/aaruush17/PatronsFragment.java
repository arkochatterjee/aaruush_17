package com.abhiprae.aaruush17;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.yalantis.flipviewpager.utils.FlipSettings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arko Chatterjee on 26-07-2017.
 */

public class PatronsFragment extends Fragment {

    List<ViewFlipperItem> patrons;

    public PatronsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Patrons");
        View view = inflater.inflate(R.layout.fragment_teams, container, false);
        final ListView list_patrons = (ListView) view.findViewById(R.id.list_team);
        ((MainActivity) getActivity()).setOnBackPressedListener(new BaseBackPressedListener(getActivity()));
        patrons = new ArrayList<>();

        patrons.add(new ViewFlipperItem(R.drawable.director, "  Dr. C. Muthamizhchelvan  ", R.color.green, " Director Engg. & Tech. - Chief Patron", "", ""));
        patrons.add(new ViewFlipperItem(R.drawable.convenor, "  Prof. Dr. A. Rathinam  ", R.color.saffron, "  Convenor - Aaruush  ", "", ""));
        patrons.add(new ViewFlipperItem(R.drawable.estate, " Mr. V. Thirumurugan  ", R.color.saffron, "  Associate Director  ", "", ""));
        patrons.add(new ViewFlipperItem(R.drawable.finance, "  Prof. V.M. Ponniah  ", R.color.green, "  Financial Advisor - Aaruush  ", "", ""));


        FlipSettings settings = new FlipSettings.Builder().defaultPage(1).build();
        list_patrons.setAdapter(new ViewFlipperAdapter(getActivity(), patrons, settings));
        /*list_patrons.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
        }); */

        return view;
    }

}

