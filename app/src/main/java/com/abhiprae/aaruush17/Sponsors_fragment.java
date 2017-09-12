package com.abhiprae.aaruush17;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import Model.Sponsor;

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class Sponsors_fragment extends Fragment {
    RecyclerView recyclerView;
    public Sponsors_fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.sponsor_list, container, false);

        final ArrayList<Sponsor> sponsors = new ArrayList<>();
        sponsors.add(new Sponsor(R.drawable.sponsor_krazy_bee_co_sponsor,"Co-Sponsor","Krazy Bee"));
        sponsors.add(new Sponsor(R.drawable.sponsor_vh1_logo,"Power Sponsor","VH1"));
        sponsors.add(new Sponsor(R.drawable.sponsor_comedy_central_power_sponsor,"Power Sponsor","Comedy Central"));
        sponsors.add(new Sponsor(R.drawable.sponsor_vodafone_fourg,"Power Sponsor","Vodafone"));
        sponsors.add(new Sponsor(R.drawable.sponsor_ibm_technology_partner,"Technology Partner","IBM"));
        sponsors.add(new Sponsor(R.drawable.sponsor_khadims,"Eco Run Partner","KHADIMS"));
       // sponsors.add(new Sponsor(R.drawable.sponsor_luker_championship_partner,"Championship Partner","Luker Electric"));
        sponsors.add(new Sponsor(R.drawable.sponsor_webtek_labs_education_partner,"Education Partner","WebTek Labs"));
        sponsors.add(new Sponsor(R.drawable.maac,"Knowledge Partner","MAAC Guduvancheri"));
        sponsors.add(new Sponsor(R.drawable.sponsor_giabyte,"LANSTORM Partner","GIGABYTE"));
        sponsors.add(new Sponsor(R.drawable.geforce,"LANSTORM Partner","GEFORCE"));
        sponsors.add(new Sponsor(R.drawable.sponsor_nividia_gaming_partner,"Gaming Partner","NVIDIA"));
        sponsors.add(new Sponsor(R.drawable.sponsor_playtonia_gaming_partner,"Gaming Partner","PLAYTONIA"));
        sponsors.add(new Sponsor(R.drawable.sponsor_hackerearth,"Platform Partner","HackerEarth"));
        sponsors.add(new Sponsor(R.drawable.sponsor_redbull,"Energised By","RedBull"));
        sponsors.add(new Sponsor(R.drawable.sponsor_nikon_school,"Workshop Partner","NIKON SCHOOL"));
        sponsors.add(new Sponsor(R.drawable.sponsor_scribbled_stories,"Workshop Partner","The Scribbled Stories"));
        sponsors.add(new Sponsor(R.drawable.sponsor_texas_instruments_workshop_partner,"Workshop Partner","Texas Instruments"));
        sponsors.add(new Sponsor(R.drawable.sponsor_tech_defense_labs_workshop_partner,"Workshop Partner","Tech Defence Labs"));
        sponsors.add(new Sponsor(R.drawable.sponsor_robokartcom_workshop_partner,"Workshop Partner","RoboKart.com"));
        sponsors.add(new Sponsor(R.drawable.sponsor_robotech_labs_workshop_partner,"Workshop Partner","Robo Tech Labs"));
        sponsors.add(new Sponsor(R.drawable.sponsor_prigma,"Workshop Partner","Prigma Edutech Services"));
        sponsors.add(new Sponsor(R.drawable.sponsor_ht_india_labs_workshop_partner,"Workshop Partner","HT India Labs"));
        sponsors.add(new Sponsor(R.drawable.sponsor_humanoid_labs_workshop_partner,"Workshop Partner","Humanoid Labs"));
        sponsors.add(new Sponsor(R.drawable.sponsor_thecollegefever_online_ticketing_partner,"Online Ticketing Partner","TheCollegeFever"));
        sponsors.add(new Sponsor(R.drawable.sponsor_eventze_registration_partner,"Registration Partner","Eventze"));
        sponsors.add(new Sponsor(R.drawable.sponsor_gupshup_sms_partner,"SMS Partner","Gupshup"));
        sponsors.add(new Sponsor(R.drawable.sponsor_smsidea_sms_partner,"SMS Partner","SmsIdea"));
        sponsors.add(new Sponsor(R.drawable.sponsor_nikon_coverage_partner,"Coverage Partner","NIKON"));
        sponsors.add(new Sponsor(R.drawable.sponsor_xquizit_quiz_partner,"XQuizIt","Quiz Partner"));
        sponsors.add(new Sponsor(R.drawable.sponsor_deepak_enterprises_konstruction_partner,"Konstruction Partner","Deepak Enterprises"));
        //sponsors.add(new Sponsor(R.drawable.sponsor_a_t_mandal_sons_machination_partner,"Machination Partner","A T Mandal & Sons"));
        //sponsors.add(new Sponsor(R.drawable.sponsor_paytm_travel_partner,"Travel Partner","PAYTM"));
        sponsors.add(new Sponsor(R.drawable.sponsor_fame_technologies,"Slingshot Strategic Partner","FameTech Partner"));
        sponsors.add(new Sponsor(R.drawable.sponsor_f6s_startup_ecosystem_partner,"Startup Ecosystem Partner","F6S"));
        sponsors.add(new Sponsor(R.drawable.sponsor_blogadda_blog_outreach_partner,"Blog Outreach Partner","BlogAdda"));
        sponsors.add(new Sponsor(R.drawable.srmpedia,"Broadcast Partner","SRMpedia"));
        //sponsors.add(new Sponsor(R.drawable.aaruushsun,"Soul Slam Partner","Soul Journal"));
        sponsors.add(new Sponsor(R.drawable.sponsor_stoned_santa_youth_outreach_partner,"Youth Outreach Partner","Stoned Santa"));
        sponsors.add(new Sponsor(R.drawable.sponsor_wittyfeed_social_media_partner,"Social Media Partner","WittyFeed"));
        //sponsors.add(new Sponsor(R.drawable.aaruushsun,"Creatives Partner","Images Ceiling System"));
        sponsors.add(new Sponsor(R.drawable.sponsor_kfc_coupon_partner,"Coupon Partner","KFC"));
        //sponsors.add(new Sponsor(R.drawable.aaruushsun,"Carnival Partner","Chaska"));
        //sponsors.add(new Sponsor(R.drawable.aaruushsun,"Carnival Partner","Grillers & Fillers"));
       // sponsors.add(new Sponsor(R.drawable.sponsor_gandivas_carnival_partner,"Carnival Partner","Gandivas"));
        //sponsors.add(new Sponsor(R.drawable.sponsor_galaxy_food_partner,"Food Partner","Galaxy"));
        //sponsors.add(new Sponsor(R.drawable.aaruushsun,"Food Partner","Winterfell"));
        //sponsors.add(new Sponsor(R.drawable.sponsor_bubblexo_food_partner,"Food Partner","BubbleXo"));
        //sponsors.add(new Sponsor(R.drawable.aaruushsun,"Food Partner","Desert Park"));
        sponsors.add(new Sponsor(R.drawable.sponsor_dainik_jagran_print_media_partner,"Print Media Partner","Dainik Jagran"));
        sponsors.add(new Sponsor(R.drawable.sponsor_knowafest_online_media_partner,"Online Media Partner","KnowAFest"));
        sponsors.add(new Sponsor(R.drawable.sponsor_festpav_online_media_partner,"Online Media Partner","FestPav"));
        sponsors.add(new Sponsor(R.drawable.sponsor_alleventsin_online_media_partner,"Online Media Partner","allevents.in"));
        sponsors.add(new Sponsor(R.drawable.sponsor_brainbuxa_online_media_partner,"Online Media Partner","Brainbuxa"));
        sponsors.add(new Sponsor(R.drawable.sponsor_festsinfo_online_media_partner,"Online Media Partner","Fests.info"));
        sponsors.add(new Sponsor(R.drawable.sponsor_campus_times_pune_online_media_partner,"Online Media Partner","Campus Times Pune"));
        sponsors.add(new Sponsor(R.drawable.sponsor_agla_sem,"Online Media Partner","Agla Sem"));
        sponsors.add(new Sponsor(R.drawable.sponsor_freshersworld_online_media_partner,"Online Media Partner","FreshersWorld"));
        sponsors.add(new Sponsor(R.drawable.sponsor_testfunda_online_media_partner,"Online Media Partner","TestFunda"));
        sponsors.add(new Sponsor(R.drawable.sponsor_collegedunia_online_media_partner,"Online Media Partner","CollegeDunia"));
        sponsors.add(new Sponsor(R.drawable.sponsor_hook2events_online_media_partner,"Online Media Partner","Hook2Events"));

        SponsorAdapter adapter = new SponsorAdapter(getActivity(),sponsors);
        //ListView listView = (ListView) view.findViewById(R.id.list);

        //listView.setAdapter(adapter);

        recyclerView = (RecyclerView) view.findViewById(R.id.list);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        ((MainActivity) getActivity()).setOnBackPressedListener(new BaseBackPressedListener(getActivity()));
        return view;
    }
}