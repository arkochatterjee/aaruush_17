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

public class MyAdapter_DKons extends RecyclerView.Adapter<MyAdapter_DKons.MyViewHolder> {
    public Context mContext;
    Boolean favourite = false;
    private String[] mDataset;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter_DKons(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter_DKons.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                           int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyAdapter_DKons.MyViewHolder vh = new MyAdapter_DKons.MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MyAdapter_DKons.MyViewHolder holder, final int position) {
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
                        intent.putExtra("pic",R.drawable.event_bbt);
                        intent.putExtra("data","Description:\n" +
                                "Fascinated by the Golden Gate Bridge? Can't wait to build your own Tower Bridge? This event lets you turn your imagination into reality by letting you design and model your own bridge. \n" +
                                "“We build to many walls and not enough bridges” – Isaac Newton\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1:Ring your choice\n" +
                                "Participants will be given rings and made to stand at a distance from the target. There will be various structures constructed and present. They will have to ring at least 1 structures. Each structure will have a dedicated set of question papers which will then test the contestants based on aptitude and some basic technical knowledge. \n" +
                                "\n" +
                                "Round 2:Spot it out \n" +
                                "Participants will be provided with a plan of an area. Following this there will be a treasure hunt based on this plan. The first task or clue will lie in the plan and the participants will have to search for the area as well as the clue. This will then lead to other clues which maybe direct or encoded. After a series of clues, the participants will reach the “TREASURE”. \n" +
                                "\n" +
                                "Round 3:Drafting The Future\n" +
                                "Participants will have to form groups of 4 or 5 members. Participants are free to choose their own team too. Remaining participants will be grouped by the organising team. Participants will be briefed about Round 4. For round 4 participants will have to draft a bridge on an A2 or A1 size sheet. \n" +
                                "Round 4:The bridge bang Theory\n" +
                                "Participants will have to construct a bridge based on their design in Round 3. Each participant will be provided with :\n" +
                                "1) Ice cream sticks\n" +
                                "2) String (twine) \n" +
                                "3) Metal (steel) wire \n" +
                                "4) Fevicol\n" +
                                "5) Scissors \n" +
                                "Participants will have to construct a bridge of given dimensions. \n" +
                                "\n" +
                                "Judgement Criteria:The Bridge will be then tested for the following criteria:\n" +
                                "1) Self weight\n" +
                                "2) Deflection under load\n" +
                                "3) Maximum load carrying capacity\n" +
                                "4) Theoretical design used\n" +
                                "5) Aesthetic value\n" +
                                "There will be an algorithm developed on the basis of which the final round will be judged. It will take into consideration all the tested parameters.\n" +
                                "\n" +
                                "Rules:\n" +
                                "1. Participants shall not use mobile phones or any other electronic device during the rounds.\n" +
                                "2. No external help from any person is allowed during the rounds.\n" +
                                "3. Participants are not allowed to bring their own material and are supposed to use the material provided to them during each round.\n" +
                                "\n" +
                                "4. Time limit will be followed strictly.\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Parth Girdhar: +91 9599811003\n" +
                                "Amit Kumar: +91 7250040688");
                        view.getContext().startActivity(intent);

                        break;
                    case 1:
                        Intent intent1 = new Intent(view.getContext(), test_activity.class);
                        intent1.putExtra("pic",R.drawable.event_riddler);
                        intent1.putExtra("data","Description:\n" +
                                "For those involved in Construction & Building its an incredible joy to be involved in bringing forth from mere drawings and ideas a structure that will stand for many lifetimes. Experience this joy and come to be a part of this quest.\n" +
                                "Be it structure designing, insane quizzing contests or brainstorming puzzles, this event gives you an opportunity to use your inner creativity and technical skills to create marvels.\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1:a QUIZZING CONTEST \n" +
                                "It is a QUIZZING CONTEST where the knowledge of the contestants would be tested and the judgement would be based on the score.\n" +
                                "\n" +
                                "Round 2:BUILD IT BIG \n" +
                                "The ‘ BUILD IT BIG ` where the contestants are to make a structure as big as possible with the given material in the given time. It is a skill task to think practically and implement accordingly. \n" +
                                "\n" +
                                "Round 3:TECHNICAL ROUND\n" +
                                "It is a TECHNICAL ROUND that lets you make a layout of the given building using engineering graphics. Judgement is based on the engineering graphic rules.\n" +
                                "Round 4:\n" +
                                "This round is about solving a jigsaw puzzle of a 3 D Building as fast as possible .\n" +
                                "\n" +
                                "Judgement Criteria:Judgement would be based on the fastest time recorded and also on the performance, skill and knowledge of the participants. Decisions made by the Aaruush team and judges are final and in case the candidate fails to abide by the prescribed rules, he/she may be disqualified.\n" +
                                "\n" +
                                "Rules:\n" +
                                "1. No external help is allowed during the rounds..\n" +
                                "2. Participants should be on time for the rounds.\n" +
                                "3. Decision of the Aaruush team and judges are final.\n" +
                                "\n" +
                                "4. No extra time will be provided.\n" +
                                "\n" +
                                "5. Aaruush 17 common registration is compulsory.\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Preksha Kulashri: +91 8755442377\n" +
                                "Ashmita Pathak: +91 9706030230\n" +
                                "Vagisha Sharma: +91 8218603463\n" +
                                "Karan Sukhtej Singh Sidhu: +91 7888742321\n" +
                                "Ramtej Randhawa: +91 9450471851");
                        view.getContext().startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(view.getContext(), test_activity.class);
                        intent2.putExtra("pic",R.drawable.event_masterbuilder);
                        intent2.putExtra("data","Description:\n" +
                                "Dreamers only dream, waiting to get rich cream. We are the creators, we bridge the gap and turn illusion into reality. Creators are the leaders of their own life. Be a child, let your imagination go wild, Be a creator not a follower.\n" +
                                "“I often wonder what I will be remembered in history for. Scholar? Military Hero? Builder?” -Ferdinand Marcos \n" +
                                "Your life will be no better than the plans you make and the actions you take. Come be a part of this event and you will see your actions becoming successful.\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1:MORE THAN JUST A DART\n" +
                                "The participants are made to play a dart game where each concentric leads to a bowl containing jumbled letters of a famous structure or a monument. The participants is required to assemble the letters from the bowl and figure out the monument within the given time frame. Hitting the bull’s eye however will send the participants straight to round two.\n" +
                                "\n" +
                                "Round 2:ONLY JIGSAW HAS THE ANSWER\n" +
                                "“Well! Great presence of mind”.If you want to hear that well then this is the time. Participants are required to choose from a box having some names in random order.Each name plat holds the picture of a structure. The participants will then have to solve a jigsaw puzzle of that structure and identify it.\n" +
                                "\n" +
                                "Round 3:YOU DESERVE A DESIGN TODAY\n" +
                                "Designing's up! Its time to bring down your skills on the paper.Participants will be required to make a detailed layout of the building on the provided A1 sheet with the help of the drafting equipments provided.Participants are supposed to mark the clamps placement on the structure also.\n" +
                                "Round 4:MASTERBUILDING\n" +
                                "Do you have practical skills? Then this is the time to show them.Each team will have to construct a G+3 building using given materials.All necessary tools will be provided. Your building will be tested for load bearing capacities. The participant with the best structure within rules will be the WINNER!\n" +
                                "\n" +
                                "Judgement Criteria:\n" +
                                "1. Participants in the first round will be judged on the time they use to complete the round. \n" +
                                "2. Designing of the structure of building would be the primary focus in round 3. \n" +
                                "3. Neatness of drawing will also be judged.\n" +
                                "4. Round 4 will be judged on the practicality and the load bearing tests of the structure.\n" +
                                "\n" +
                                "Rules:\n" +
                                "1. Participants shall not use mobile phones or any other electronic device during the rounds.\n" +
                                "2. No external help from any person is allowed during the rounds.\n" +
                                "3. Participants are not allowed to bring their own material and are supposed to use the material provided to them during each round.\n" +
                                "\n" +
                                "4. Time limit will be followed strictly.\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "RAHUL AGARWAL: +91 8960870550\n" +
                                "SACHIN MEHNDIRATTA: +91 7007011446\n" +
                                "MADHAVI SHARMA: +91 8770993615\n" +
                                "ADITYA SHARMA: +91 8428250800\n" +
                                "RANITA SHARMA: +91 9952907339");
                        view.getContext().startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(view.getContext(), test_activity.class);
                        intent3.putExtra("pic", R.drawable.event_band);
                        intent3.putExtra("data","Description:\n" +
                                "Create with heart; build with mind. Your imagination is a weapon of mass construction, use it.\n" +
                                "This event will test your knowledge, your imagination and your money management skills. Construct your building, propose your tender and let the bidding begin.\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1:\n" +
                                "Participants will have to throw ball into an array of cups kept at a distance have to clear a qualifying score.\n" +
                                "Judgement Criteria : No. Of questions correct.\n" +
                                "\n" +
                                "Round 2:\n" +
                                "This round will check the practical knowledge of participants. Participants will be given samples of various construction materials and they have to guess their exact name and approximate price.\n" +
                                "\n" +
                                "Round 3:\n" +
                                "The qualified teams have to construct a building of G+4, and incorporate 4 flats per level for a given plot. And then, they will have to draw the layout of a level, front and top view of building.\n" +
                                "Round 4:\n" +
                                "Participants will have to draft a tender based on the layout they have submitted in the previous round. A list of available materials with their current price will be displayed at the venue of final round.\n" +
                                "\n" +
                                "Judgement Criteria:The tender with the least amount of money and time will win the game. The testing algorithm will be developed soon incorporating all the factors like money, time, strength, aesthetic value, etc. \n" +
                                "\n" +
                                "Rules:\n" +
                                "1.The tender should be based on the layout submitted in the 3rd round. Deferring from this rule will result in penalty.\n" +
                                "2.The winner shall be decided by the judgement team based on the real time calculations and experience of the faculty. Questioning the judgement of team will not be entertained.\n" +
                                "3.No extra time will be provided.\n" +
                                "\n" +
                                "4.Common registration is compulsory.\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Sakshi Sinha: +91 7550172239\n" +
                                "Thomas George: +91 9176223325\n" +
                                "Ekansh Agarwal: +91 8939434586\n" +
                                "J. D. Srivatsa: +91 7013038881");
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