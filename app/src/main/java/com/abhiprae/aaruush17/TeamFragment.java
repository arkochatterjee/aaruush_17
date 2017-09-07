package com.abhiprae.aaruush17;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.yalantis.flipviewpager.utils.FlipSettings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arko Chatterjee on 26-07-2017.
 */

public class TeamFragment extends Fragment {

    List<ViewFlipperItem> patrons;

    public TeamFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Patrons");
        View view = inflater.inflate(R.layout.fragment_teams, container, false);
        final ListView list_patrons = (ListView) view.findViewById(R.id.list_team);
        //((MainActivity) getActivity()).setOnBackPressedListener(new BaseBackPressedListener(getActivity()));
        ((MainActivity) getActivity()).setOnBackPressedListener(new BaseBackPressedListener(getActivity()));
        patrons = new ArrayList<>();

        patrons.add(new ViewFlipperItem(R.drawable.haroon, "  Haroon Rashid  ", R.color.saffron, "  Secretary ", "", "  9962744669  "));
        patrons.add(new ViewFlipperItem(R.drawable.ranshu, "  Ranshu Anandan  ", R.color.green, "  Joint Secretary & Public Relations Officer ", "", "  7708519958  "));

        patrons.add(new ViewFlipperItem(R.drawable.dakshita, "  Dakshita Kumar  ", R.color.saffron, "  Public Relations Officer  ", "", "  7708870293  "));
        patrons.add(new ViewFlipperItem(R.drawable.ashrita, "  Ashrita R Setlur  ", R.color.green, "  Public Relations Officer  ", "", " 9600579916  "));
        patrons.add(new ViewFlipperItem(R.drawable.nishanth, "  Nishanth Buggineni  ", R.color.saffron, "  Corporate Stratergy & Implementation  ", "", "  9600579880  "));
        patrons.add(new ViewFlipperItem(R.drawable.pranav, "  Pranav Dhingra  ", R.color.green, "  Corporate Stratergy & Implementation  ", "", "  9566161014  "));
        patrons.add(new ViewFlipperItem(R.drawable.saikumar, "  Sai Kumar M  ", R.color.saffron, "  Finance  ", "", "  9494808888  "));
        patrons.add(new ViewFlipperItem(R.drawable.vivek, "  Vivek Kumar  ", R.color.green, "  Finance  ", "", "  9962849905  "));
        patrons.add(new ViewFlipperItem(R.drawable.poojith, "  K Poojith Sai Kumar  ", R.color.saffron, "  Operations & Resource Management  ", "", "  9600577472  "));
        patrons.add(new ViewFlipperItem(R.drawable.saikolla, " Sai Kumar K  ", R.color.green, "   Operations & Resource Management    ", "", "  9087860757  "));
        patrons.add(new ViewFlipperItem(R.drawable.uday, "  Kaja Uday Mallikarjun  ", R.color.saffron, "  Creatives & Media  ", "", "  9840902494  "));
        patrons.add(new ViewFlipperItem(R.drawable.arjun, "  Arjun R  ", R.color.green, "  Creatives and Media  ", "", "  9087859393  "));
        patrons.add(new ViewFlipperItem(R.drawable.kaushal, "  Kaushal Ganta  ", R.color.saffron, "  Creatives and Media, Envision ", "", "  9551619927  "));
        patrons.add(new ViewFlipperItem(R.drawable.gautham, "  CH. Goutham Reddy  ", R.color.green, "  Envision, Arts & Deco  ", "", "  9087860816  "));
        patrons.add(new ViewFlipperItem(R.drawable.radhika, "  Radhika Shukla  ", R.color.saffron, " Envision and Bluebook  ", "", "  9087860522  "));
        patrons.add(new ViewFlipperItem(R.drawable.sabiq, "  Sabiq Ali Chaudhary  ", R.color.green, "  Envision  ", "", "  900830106  "));
        patrons.add(new ViewFlipperItem(R.drawable.saikrishna, "  Sai Krishna  ", R.color.saffron, "  Sponsorship & Marketing", "", "  8015417147  "));
        patrons.add(new ViewFlipperItem(R.drawable.pavan, "  Sai Pavan V  ", R.color.green, "  Sponsorship & Marketing, Highlights  ", "", "  8754173353  "));
        patrons.add(new ViewFlipperItem(R.drawable.aneek, "  Aneek Barman Roy  ", R.color.saffron, "  Sponsorship and Workshop", "", ""));
        patrons.add(new ViewFlipperItem(R.drawable.shivansh, "  Shivansh Mishra  ", R.color.green, "  Highlights  ", "", "  9790461501  "));
        patrons.add(new ViewFlipperItem(R.drawable.manish, "  Manish Agrawal  ", R.color.saffron, "  Quality Assurance  ", "", "  9566270540  "));
        patrons.add(new ViewFlipperItem(R.drawable.soumya, "  Soumya Sharma  ", R.color.green, "  Quality Assurance  ", "", "  9418123175  "));
        patrons.add(new ViewFlipperItem(R.drawable.naveen, "  Y R V V Naveen Raja  ", R.color.saffron, "  Championships  ", "", "  9941928999  "));
        patrons.add(new ViewFlipperItem(R.drawable.kalaivani, "  Kalaivani B  ", R.color.green, "  Deco & Arts  ", "", "  7845271720  "));
        patrons.add(new ViewFlipperItem(R.drawable.shobit, "  Shobhit Mishra  ", R.color.saffron, "  Events & Presentatio  ", "", "  9962883803  "));
        patrons.add(new ViewFlipperItem(R.drawable.shruthi, "  Shruti Pandey  ", R.color.green, "  Magefficie & Events, Startups ", "", "  9958824290  "));
        patrons.add(new ViewFlipperItem(R.drawable.sashank, "  B. Sai Sashank  ", R.color.saffron, "  X-Zone, Digital Design, Activities  ", "", "  9962899097  "));
        patrons.add(new ViewFlipperItem(R.drawable.abhiprae, "  Abhiprae Choudhury  ", R.color.green, "  Fundaz and Vimanaz  ", "", "  9919335522  "));
        patrons.add(new ViewFlipperItem(R.drawable.sanika, "  Sanika Thakar  ", R.color.saffron, "  Robogyan & Robotics Club  ", "", "  8939552319  "));
        patrons.add(new ViewFlipperItem(R.drawable.amans, "  Aman Siraj Siddiqui  ", R.color.green, "  Electrzite and Machination ", "", "  9087860876  "));
        patrons.add(new ViewFlipperItem(R.drawable.amank, "  Aman Kumar  ", R.color.saffron, "  Yudddhame and Online ", "", "  9087860669  "));
        patrons.add(new ViewFlipperItem(R.drawable.nishanthkonstruktion, "  Nishant Sharma  ", R.color.green, "  Konstruktion and Architecture ", "", "  8939651996  "));


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
        });

        return view;
    }

}

