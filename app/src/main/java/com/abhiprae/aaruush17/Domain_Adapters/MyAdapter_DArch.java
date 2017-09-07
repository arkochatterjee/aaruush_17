package com.abhiprae.aaruush17.Domain_Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.abhiprae.aaruush17.R;
import com.abhiprae.aaruush17.test_activity;

/**
 * Created by Arko Chatterjee on 04-09-2017.
 */

public class MyAdapter_DArch extends RecyclerView.Adapter<MyAdapter_DArch.MyViewHolder> {
    public Context mContext;
    Boolean favourite = false;
    private String[] mDataset;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter_DArch(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter_DArch.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                            int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyAdapter_DArch.MyViewHolder vh = new MyAdapter_DArch.MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MyAdapter_DArch.MyViewHolder holder, final int position) {
        holder.mTextView.setText(mDataset[position]);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!favourite) {
                    holder.imageView.setImageResource(R.drawable.star_selected_icon);
                    favourite = true;
                } else {
                    holder.imageView.setImageResource(R.drawable.star_icon);
                    favourite = false;
                }
            }
        });
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = mDataset[position];
                Log.d("CardView", "CardView Clicked: " + currentValue);
                //Toast toast = Toast.makeText(
                //getActivity(),"Custom Toast From Fragment",Toast.LENGTH_LONG
                // view.getContext(), "Custom Toast From Fragment "+currentValue, Toast.LENGTH_LONG);
                // toast.show();

                switch (position) {
                    case 0:
                        //Intent intent = new Intent(view.getContext(), test_activity.class);

                        // view.getContext().startActivity(intent);

                        Intent intent = new Intent(view.getContext(),test_activity.class);
                        intent.putExtra("pic", R.drawable.brickiton);
                        intent.putExtra("data","Description:\n" +
                                "Building routes through rough terrain can be a challenge. Build a path for a marble through valleys, mountains, rivers and forests in this event. Get the marble safety from the start to the end. Will your path be tough enough to withstand rough terrain?\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1: Wonder Mania\n" +
                                "Participants will be given a chance to test their architectural knowledge by solving a set of MCQs.\n" +
                                "Judgement Criteria :\n" +
                                "a.Number of questions solved\n" +
                                "b.Speed\n" +
                                "\n" +
                                "Round 2: Chit It to Win It\n" +
                                "The participant will choose a chit which will contain a monument name of which they’ll have to draw an outline and using tangram sheets they’ll have to place it in that outline without touching the outline.\n" +
                                "Judgement Criteria : \n" +
                                "a.Number of clues needed to draw\n" +
                                "b.Number of parts drawn\n" +
                                "c.Time Limit\n" +
                                "\n" +
                                "Round 3: Marble Safari\n" +
                                "The contestants will have to design a path with slopes, bridges etc(with the provided requirements) and make a marble traverse that path in minimum time.\n" +
                                "Judgement Criteria: \n" +
                                "a.Distance coveredb.Creativity\n" +
                                "c.Safety\n" +
                                "d.Accuracy\n" +
                                "\n" +
                                "Rules:\n" +
                                "1.No external help is allowed during the rounds.\n" +
                                "2.Participants are not allowed to bring their own materials and are supposed to use the materials provided to them during the rounds.\n" +
                                "3.Participants are not allowed to have access to cellphones.\n" +
                                "4.Participants should be on time.\n" +
                                "5.Decision made by event coordinators and judges is final.\n" +
                                "6.(ROUND 1) Marking two options will be not considered even if the correct option is marked.\n" +
                                "7.(ROUND 2) Exceeding the time limit will be not considered.\n" +
                                "8.(ROUND 3) If the marble goes out of the path, then it will be disqualified.");
                        view.getContext().startActivity(intent);

                        break;
                    case 1:
                        Intent intent1 = new Intent(view.getContext(), test_activity.class);
                        intent1.putExtra("pic",R.drawable.gameofstones);
                        intent1.putExtra("data","Description:\n" +
                                "“When you play the Game of Stones, you either build or destroy. There is no middle ground.”Collect as many stones as you can in the rounds, and design and build your own model structure using the stones earned in the previous round. The stones directly interlink all the rounds. Do you have it in you to build the Red Keep? The Titan of Braavos or the Eyrie?\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1: Blindfolded Jenga\n" +
                                "Guide your blindfolded teammate to keep the Jenga Tower from falling.\n" +
                                "Judgement Criteria :\n" +
                                "a. Time Constraint\n" +
                                "b. Height of the Tower\n" +
                                "c. Number of stones earned\n" +
                                "\n" +
                                "Round 2: Mayhem of Shapes\n" +
                                "Use your imagination to sketch out a palace or a monument with as many shapes as possible to earn stones.\n" +
                                "Judgement Criteria : \n" +
                                "a.Creativity\n" +
                                "b.Number of shapes used\n" +
                                "c.Presentation\n" +
                                "d.Number of stones earned\n" +
                                "\n" +
                                "Round 3: Kings and Castles\n" +
                                "Build the miniature form of a castle using the stones earned from previous rounds and other resources provided.\n" +
                                "Judgement Criteria: \n" +
                                "a.Stability of the model\n" +
                                "b.Creativity\n" +
                                "c.Aesthetics\n" +
                                "d.Feasibility of structure\n" +
                                "e.Usage of stones earned\n" +
                                "\n" +
                                "Rules:\n" +
                                "1.Aaruush17 common registraion is mandatory.\n" +
                                "2.For the first round, only the blindfolded person can touch the tower. If at any instant the other teammate touches the tower, the team will get disqualified.\n" +
                                "3.The participants are expected to be present at the respective time slots allotted to them. Failure to do so, might lead to disqualification.\n" +
                                "4.Teams will have no access to cellphones.\n" +
                                "5.Decision of the Jury shall be considered final.\n" +
                                "6.For the final round, the contestants will not be allowed to use any resources in their model other than the stones earned and the resources provided.");
                        view.getContext().startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(view.getContext(), test_activity.class);
                        intent2.putExtra("pic",R.drawable.thelostworld);
                        intent2.putExtra("data","Description:\n" +
                                "So you think you can design an entire city? Test your urban planning skills in this event and design an entire city from scratch. Will your city be the biggest and most prosperous metropolitan in the world? The beautiful cities then designed had architectural design values that served the purpose of the habitants well. This event encompasses the idea of building sustainable cities which we dream to live in. \n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1: More Than Just A Song\n" +
                                "The participant has to move around various places of the city( a small-scale model), collect the pieces of the jumbled song in minimum time.\n" +
                                "Judgement Criteria :\n" +
                                "a.Identification of song\n" +
                                "b. Correct order\n" +
                                "c.Time elapsed\n" +
                                "\n" +
                                "Round 2: Bright Light Bigger City\n" +
                                "The participant has to draw night skyline of city using various shapes of stamps and ink. The outline of the building should clearly depict its purpose in the city.\n" +
                                "Judgement Criteria : \n" +
                                "a.Presentation of thoughts\n" +
                                "b.Creativity \n" +
                                "c.How precisely the purpose of city has been depicted\n" +
                                "\n" +
                                "Round 3: Crunkville\n" +
                                "Urban Planning is the focus of the round. The participant will be given situations according to which they will have to include the necessary designs in the planning of the sustainable city.\n" +
                                "Judgement Criteria: \n" +
                                "a.Presentationb.Creativity\n" +
                                "c.Sustainability\n" +
                                "d.Feasibility of the structure\n" +
                                "\n" +
                                "Rules:\n" +
                                "1. Aaruush17 common registration is mandatory.\n" +
                                "2. No access to cellphones allowed.\n" +
                                "3. (Round 1) All the parts of the song must be collected and arranged in order, failing which the participant will be disqualified.\n" +
                                "4. (Round 2) Building structures whose outline does not clearly define its purpose will cause the participant to loose marks.\n" +
                                "5. (Round 3)The planning of the city should be related to the situation given.\n" +
                                "6.Decision of Event Coordiantors and Judges are final.\n");
                        view.getContext().startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(view.getContext(), test_activity.class);
                        intent3.putExtra("pic", R.drawable.noahsark);
                        intent3.putExtra("data","Description:\n" +
                                "Will you stay calm in a crisis, or will you panic? Test your survival skills by building structures and shelters to survive a natural disasters in this event. Make the best of the resources available to keep everyone safe and sound.\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1: Spell-n-Save\n" +
                                "The contestants will be shown the pictures of some monument and they will then be asked to seat down with their face turned away from the pictures and search for the architecture names in a word puzzle.\n" +
                                "Judgement Criteria :\n" +
                                "a.Number of questions solved\n" +
                                "b.Speed\n" +
                                "\n" +
                                "Round 2: Hunt the Ruins\n" +
                                "Treasure hunt in which the teams will have to collect clues to complete the round and the resources collected by guessing the clues correctly will be used in the final round.\n" +
                                "Judgement Criteria : \n" +
                                "a.Number of clues needed to draw\n" +
                                "b.Number of parts drawn\n" +
                                "c.Time Limit\n" +
                                "\n" +
                                "Round 3: Ultimate Survival\n" +
                                "The teams will have to design a temporary crisis model for any given crisis situation using the resources earned from the previous round.\n" +
                                "Judgement Criteria: \n" +
                                "a.Distance coveredb.Creativity\n" +
                                "c.Safety\n" +
                                "d.Accuracy\n" +
                                "\n" +
                                "Rules:\n" +
                                "1.Aaruush 17 registration is mandatory.\n" +
                                "2.The teams should not use cellphones.\n" +
                                "3.For round 2, a team should consist of atleast 2 members. \n" +
                                "4.For round 1, the monuments will be displayed for 3 seconds each and the contestants will have 5 minutes to solve the puzzle.\n" +
                                "5.Participants should reach the venue on time or the time slot allotted to avoid disqualification.\n" +
                                "6.Participants are not allowed to bring their own materials and are supposed to use the materials provided to them during the rounds.\n");
                        view.getContext().startActivity(intent3);
                        break;





                    default:
                        return;

                }


                // Fragment newCase=new NewCase();
                /*FragmentTransaction transaction=((Activity) mContext).getFragmentManager().beginTransaction();
                transaction.replace(R.id.main_container,new home_fragment()); // give your fragment container id in first parameter
                transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
                transaction.commit();*/

            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public CardView mCardView;
        public TextView mTextView;
        public ImageView imageView;

        public MyViewHolder(View v) {
            super(v);
            //mContext = v.getContext();
            mCardView = (CardView) v.findViewById(R.id.card_view);
            mTextView = (TextView) v.findViewById(R.id.card_view_text);
            imageView = (ImageView) v.findViewById(R.id.starred);

        }
    }
}