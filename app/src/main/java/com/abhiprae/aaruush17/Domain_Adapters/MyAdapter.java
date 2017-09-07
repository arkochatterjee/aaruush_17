package com.abhiprae.aaruush17.Domain_Adapters;

/**
 * Created by Abhiprae on 7/22/2017.
 */

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

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    public Context mContext;
    Boolean favourite = false;
    private String[] mDataset;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
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
                        intent.putExtra("pic",R.drawable.carbon);
                        intent.putExtra("data","Description:\n" +
                                "The event is basically of autonomous bots which follow the desired track on their sensor input which can be programmed .It follows the black line as the light is reflected back by the white surface which give input to the sensor whereas the black surface absorb the radiation.\n" +
                                "ROBOT SPECIFICATIONS\n" +
                                "1. The robot should be autonomous.\n" +
                                "2. The maximum dimensions of the robot should be 30x30x25 cm.\n" +
                                "3. The robots should be made using IR SENSORS.\n" +
                                "4. IT should be operated by battery.(less than or 12V)\n" +
                                "5. It should be powered by a switch.\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1:\n" +
                                "1.It is a questionnaire round.\n" +
                                "2. Questions will be based on basic knowledge and amplitude.\n" +
                                "3. Points will be awarded on the basis of answers.\n" +
                                "(NOTE:- Bots will be provided for the first round only)\n" +
                                "\n" +
                                "Round 2:\n" +
                                "1. Participants must complete fabrication of their bots beforehand.\n" +
                                "2. Specific time will be provided to each team for testing.\n" +
                                "3. Objective of the round is to adjust the potentiometer of the IR SENSOR.\n" +
                                "4. Only one member of the team is allowed to do so.\n" +
                                "\n" +
                                "Round 3:\n" +
                                "1. This is a time based round.\n" +
                                "2.The objective of this round is to determine the eligibility of the bot.\n" +
                                "3. Only three interventions are allowed.\n" +
                                "4. More than three interventions, the time will be added to your team.\n" +
                                "\n" +
                                "\n" +
                                "Round 4: \n" +
                                "1. This is a massive track round.\n" +
                                "2. The track consists of turns of various different angles, depression and radii.\n" +
                                "3. Points will be awarded based on time taken to complete the circuit. \n" +
                                "\n" +
                                "\n" +
                                "Round 5: \n" +
                                "1. This is the final round of the event.\n" +
                                "2. This is a race based event .\n" +
                                "3. Qualified participants will be racing with each other on two different identical tracks.\n" +
                                "\n" +
                                "\n" +
                                "Rules:• Size given for the bots should be strictly followed.\n" +
                                "• Inspection will done before the participation.\n" +
                                "• Time shall be judged by a stopwatch.\n" +
                                "• Recorded time is the final one. No Changes will done.\n" +
                                "• Once cross the start position it should be fully autonomous.• Robot which losses the line of action will be only given two more chance/attempts.\n" +
                                "• The decision of all judges regarding the rules and conduct of the event shall be final.\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Rohit Anand +91 80023 94734\n" +
                                "Himanshu Pandey: +91 98978 59005\n" +
                                "Tarang Ashutosh Mohile : +91 94455 65540 \n" +
                                "Stuti Joshi : +91 84282 73770\n" +
                                "Rohith M +91 75501 67224");
                        view.getContext().startActivity(intent);

                        break;
                    case 1:
                        Intent intent1 = new Intent(view.getContext(), test_activity.class);
                        intent1.putExtra("pic",R.drawable.prostreet);
                        intent1.putExtra("data","Description:\n" +
                                "In this event the participant’s bot need to be equipped with ultrasonic sensors and should perform some specific tasks given to them under a stipulated period of time. The bots should be autonomous and should successfully maneuver through certain tracks.\n" +
                                "ROBOT SPECIFICATIONS\n" +
                                "1) The bot must have ultrasonic sensors.\n" +
                                "2) The participant’s bot must not exceed the size of 25cm*25cm.\n" +
                                "3) The height of the bot must not exceed 10 cm.\n" +
                                "4) The bot must be autonomous and arduino based.\n" +
                                "\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1:\n" +
                                "JAR OF CARS\n" +
                                "The participants will pick one hint from a jar consisting of many hints and identify the correct balloon from the balloons placed Inside a room and the one who identifies the correct balloon will find an another hint inside the balloon. This hint will guide the participant to a location where a bot has been placed inside a room. The participant will have to retrieve this bot. The participants who successfully find the bot will advance to the next round and will be given some bonus points. \n" +
                                "NOTE: A participant may directly proceed to next round but some points will be deducted.\n" +
                                "\n" +
                                "Round 2:\n" +
                                "WANTED\n" +
                                "The participants will drive their bots on a straight track within a stipulated period of time and maintaining a min distance of 15 cm from our bot . The one which is successful will proceed towards the next round. \n" +
                                "\n" +
                                "Round 3:\n" +
                                "BURN THE CIRCUIT\n" +
                                "In this round obstructions will be present on the track. The bots need move forward passing through all obstructions and should reach the finish line in minimum time.\n" +
                                "\n" +
                                "Round 4: \n" +
                                "MAZER BLAZER\n" +
                                "This is the final round of our event and it consists of a maze and the bots need’s to find its way through the maze.\n" +
                                "\n" +
                                "Rules:\n" +
                                "1. The bot must not exceed the specified size limit.\n" +
                                "2. Time will be recorded by a stopwatch.\n" +
                                "3. A pre examination of the bot will be conducted.\n" +
                                "4. The participants will be given 3 chances for every round except round 1 and round 4.\n" +
                                "5. The end result will be the cumulative score of all the previous rounds.\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Shubhankar Singhal +91 80544 47627\n" +
                                "Miti Ghosh: +91 89677 24040\n" +
                                "Sachet Rao : +91 98994 77509");
                        view.getContext().startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(view.getContext(), test_activity.class);
                        intent2.putExtra("pic",R.drawable.mostwanted);
                        intent2.putExtra("data","Description:\n" +
                                "It is based on the NFS Most Wanted Game. It is a land based event in which a bot, built by the contestants will have to traverse through different terrains.\n" +
                                "\n" +
                                "PARTICIPANTS PER TEAM\n" +
                                "Minimum – 2\n" +
                                "Maximum – 4\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1:PUZZLE GAME\n" +
                                "In this round contestants have to solve a puzzle with pictures of cars from the Most Wanted game with the help of a claw bot. There can be one or multiple puzzles, like if they complete more bonus point will be awarded.\n" +
                                "\n" +
                                "Round 2:Drag Race\n" +
                                "This is the first race. In this round, the contestants will have to drag a dead weight which will be provided along the course in a given time. There will be 2 checkpoints placed along the course. The contestants will be awarded with more time as they pass the check points\n" +
                                "\n" +
                                "Round 3:Circuit Race\n" +
                                "In this round the contestants will have to race through a closed track. There will be 3 laps. Points will be awarded to the winners of the individual laps and winner of the last lap will get the most points. Points will also be awarded for crossing each obstacle.\n" +
                                "In this round there will be three obstacles of different terrain. First obstacle will be of a plane terrain. Second one will be of the off road type. Third one will be a wet track. Individual time will be recorded for the each bots and finally the one with the least time wins the round. \n" +
                                "Round 4:Sprint Race\n" +
                                "\n" +
                                "In this round the contestants will have to race through a course from start to finish. Points will be awarded for crossing each obstacle. The one who crossed the finish line first will be declared the winner.\n" +
                                "The final round in which all participants will race together unlike the other two rounds in which individual timings were recorded and the one with least time wins. In this round all the competitors will race side by side under the same circumstances and the one which reaches the finish line first will be declared as the winner of the event.\n" +
                                "Obstacles to overcome 1) sand 2)wet soil 3)bridges 4)plain track");
                        view.getContext().startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(view.getContext(), test_activity.class);
                        intent3.putExtra("pic", R.drawable.shift);
                        intent3.putExtra("data","No Description");
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