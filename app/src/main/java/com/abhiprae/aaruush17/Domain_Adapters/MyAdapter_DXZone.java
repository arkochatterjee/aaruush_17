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
 * Created by Arko Chatterjee on 02-09-2017.
 */

public class MyAdapter_DXZone extends RecyclerView.Adapter<MyAdapter_DXZone.MyViewHolder> {
    public Context mContext;
    Boolean favourite = false;
    private String[] mDataset;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter_DXZone(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter_DXZone.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                          int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyAdapter_DXZone.MyViewHolder vh = new MyAdapter_DXZone.MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MyAdapter_DXZone.MyViewHolder holder, final int position) {
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

                        Intent intent = new Intent(view.getContext(), test_activity.class);
                        intent.putExtra("pic", R.drawable.breakingbad);
                        intent.putExtra("data", "Theme:\n" +
                                "This event is for those Sharp and Logical Ones in the house and those who believe they have Some Good luck in their pockets. Its for those who can solve puzzles and riddles real quick.\n" +
                                "\n" +
                                "Description:\n" +
                                "In round 1 the participant must solve a puzzle from junk and frame a single Word in the stipulated time. Round 2 is where your luck plays a major role. In round 3 You have to BEG,BORROW or STEAL to collect a list of objects specified by the OC.Finally you are locked in a room and you get out only if you can solve the puzzles with clues real clues. TIME plays a major role so Be QUICK!!!!!!!\n" +
                                "\n" +
                                "Rounds\n" +
                                "\n" +
                                "ROUND 1\n" +
                                "FUNK FROM JUNK\n" +
                                "The participants would be provided with a puzzle which they need to solve. After completing that they need to make a word out of it from the alphabets provided in the junk within a stipulated amount of time.\n" +
                                "\n" +
                                "ROUND 2\n" +
                                "As we mentioned in the first round that at last the participants will get an alphabets provided in the junk. With these alphabets participants need to frame their team names. Now the room will be divided into two halves. This is a team event so there will be some similar objects present in the two halves of the room. The participants won’t be allowed any verbal communication. The two team mates need to get the similar objects in some stipulated time.\n" +
                                "\n" +
                                "ROUND 3\n" +
                                "BEG BORROW AND STEAL Using those objects here the team will be given a list of commodities, basically some unique things like a Red loafers, black hair clip etc with the previous round objects, something which is very common but contestants possibly won't carry with them. Along with the list and within stipulated time, the participants will have to arrange the maximum number of commodities they can. They can either beg, borrow or steal and henceforth they will qualify to next round.\n" +
                                "\n" +
                                "Round 4\n" +
                                "In this event, the participants will be locked inside a room. The room will consist of a set of clues which the team must decipher in order to break out of the room. Simple. It could be related to small events . The only twist is that if you do not break out of the room in the given time limit, you are in for a big trouble.\n" +
                                "_Come On Heisenberg's ,Break Bad !!_\n" +
                                "Lights Out!!!\n" +
                                "\n" +
                                "Rules and Regulations:\n" +
                                "Team will have no access to cell phones.\n" +
                                "Taking help of any kind will result in immediate disqualification.\n" +
                                "Aaruush’17 common registration is compulsory.\n" +
                                "Decision of event coordinators and judges are final.");
                        view.getContext().startActivity(intent);

                        break;
                    case 1:
                        Intent intent1 = new Intent(view.getContext(), test_activity.class);
                        intent1.putExtra("pic", R.drawable.casinomania);
                        intent1.putExtra("data", "EVENT DESCRIPTION:-\n" +
                                "\n" +
                                "1. Firstly all the participants will be given a packet of chips worth 10000 bucks.\n" +
                                "2.It is over the participant as to which table he wishes to join.\n" +
                                "3.Round of poker will be played on two levels i.e professional & amateur and people can join any level and leave the table any time they wish to.\n" +
                                "4.Participants would now make their chips count and their score would be updated.\n" +
                                "5.At the end of 3 days top 9 participants will be eligible to play the final round.\n" +
                                "\n" +
                                "RULES OF THE EVENT :-\n" +
                                "\n" +
                                "1.Winner of the hands will be decided on the basis of original poker hands order.\n" +
                                "2.A table can have maximum of 9 participants.\n" +
                                "3.Before leaving the game the player has to return all their chips to the volunteers after making it count.\n" +
                                "\n" +
                                "JUDGEMENTAL CRITERIA:-\n" +
                                "\n" +
                                "The one who has the maximum amount of chips left with him after the end of the stipulated time in the final round will be declared as the winner followed by the runner up");
                        view.getContext().startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(view.getContext(), test_activity.class);
                        intent2.putExtra("pic", R.drawable.crypticcrack);
                        intent2.putExtra("data", "Theme:- Cracking the clues with events\n" +
                                "\n" +
                                "Description:\n" +
                                "\n" +
                                "In this event the participant must crack some clues in the first round to qualify to the next round. He or she must find a key by solving some tasks in the second round and this gets even complex in round 3 where they find more keys. Finally, participants will track some people using their phone numbers and collect all the objects with them in the least time and arrange them in an order specified.\n" +
                                "\n" +
                                "ROUNDS:-\n" +
                                "\n" +
                                "ROUND 1:\n" +
                                "Some boxes are kept , on those boxes there are some characters, objects & names written on it. Contestants need to find the clues related to the boxes and drop them into the boxes by cracking the clues given to them in a time limit.\n" +
                                "ROUND 2:-\n" +
                                "There will be some small tasks in a room. The contestants should complete all the task and find out a key in those tasks . Then the contestants should unlock them& they can enter the next round.\n" +
                                "ROUND 3:-\n" +
                                "In previous round the contestant gets one key and opens a box in that box there are different type of events related to round 1 . In this round the small events levels will be increased . While the contestants are completing the tasks there will be 5 keys in that room the contestants need to find out all the 5 keys and complete all the tasks. In that 5 keys only 1 keys is the correct key. So the contestants need to come out of the room.\n" +
                                "ROUND 4:-\n" +
                                "In this round, some list of phone numbers are given to the contestants. They should contact them and find the person in the whole campus or in a building. These contestants should go to them and collect a particular object and after completion of the list the contestants should collect all the objects and arrange them in order. \n" +
                                "\n" +
                                "Rules and Regulations:-\n" +
                                "\n" +
                                "Team will have no access to cellphones.\n" +
                                "Taking help of any kind will result in immediate disqualification.\n" +
                                "Aaruush’17 common registration is compulsory.\n" +
                                "Decision of event coordinators and judges are final.");
                        view.getContext().startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(view.getContext(), test_activity.class);
                        intent3.putExtra("pic", R.drawable.fantasticbeasts);
                        intent3.putExtra("data","Theme:-\n" +
                                "Physical exertion and the ability of participants to tackle hurdles and obstacles better.\n" +
                                "\n" +
                                "Description:-This event has 4 rounds all of which have to be Completed in minimum time with least faults. Precision of movement, concentration on Hearing the instructions from teammates and Coordination will be tested in this event.Rounds\n" +
                                "Round 1: 4 tasks setup in 1 room. The participants have to complete the events one after the other in minimum time.\n" +
                                "Round 2:\n" +
                                "A two feet maze would be setup on the ground. The participants will participate in teams of \n" +
                                "One member of the team will enter the maze blind folded and move according to the guidance of his other team mate. The participant giving the direction can only say north south east or west but the participant in maze has to go in the direction opposite to the direction he hears.\n" +
                                "Round 3:\n" +
                                "A big obstacle course will be setup. A blindfolded participant enters the course and hearing precise instructions from his other team mate he moves forward onto the course. Every move will be monitored and the team with minimum time taken and least errors will proceed to the final round.\n" +
                                "Round 4:\n" +
                                "A big obstacle course in a relay format will be setup. The team needs to be coordinated and fast and perform the obstacles in minimum time. It’s in a relay format, so 1 participant completes 3 obstacles and taps the second participant who finishes his 3. The team who takes the least time will be declared as winner.\n" +
                                "\n" +
                                "Rules and Regulations:-Team will have no access of to cellphones.\n" +
                                "Taking help of any kind will result in immediate disqualification.\n" +
                                "Aaruush’17 common registration is compulsory.\n" +
                                "Decision of event coordinators and judges are final.");
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
