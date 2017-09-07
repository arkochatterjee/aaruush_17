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

public class MyAdapter_DVimaz extends RecyclerView.Adapter<MyAdapter_DVimaz.MyViewHolder> {
    public Context mContext;
    Boolean favourite = false;
    private String[] mDataset;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter_DVimaz(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter_DVimaz.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyAdapter_DVimaz.MyViewHolder vh = new MyAdapter_DVimaz.MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MyAdapter_DVimaz.MyViewHolder holder, final int position) {
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
                        intent.putExtra("pic",R.drawable.aerovision);
                        intent.putExtra("data","Description:\n" +
                                "With a vision to reach greater milestones, we are back with Aerovision Vol.2! So, pull up your socks and get ready to test and fly your own glider...\n" +
                                "Soar your adrenaline to the extreme limit as you fly past a set of four different rounds from solving puzzles to designing your own airplane. One with the most awesome flyer shall win with flying colours!\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1:MIX & MATCH\n" +
                                "Solve mind boggling puzzles to attain maximum points to clear through this round.\n" +
                                "\n" +
                                "Round 2:AEOLUS\n" +
                                "Crave the designer in you and fly your glider past the mark.\n" +
                                "\n" +
                                "Round 3: WINGS OF HEAVEN\n" +
                                "Mix up the artist and techie inside you to make and test the aerodynamics of your aerofoil(wing) in a real time experience of a jet tunnel.\n" +
                                "Round 4:GLIDIATOR\n" +
                                "Join your aerofoil(wing) to the basic design of your glider(fuselage) and fly it to reach greater heights while displaying the basic control features of pitch, roll and yaw.\n" +
                                "\n" +
                                "Rules:\n" +
                                "1.Team will have no access to cellphones\n" +
                                "2.Taking help of any kind will result in immediate disqualification\n" +
                                "3.Aaruush 17 common registration is compulsory\n" +
                                "\n" +
                                "4.Decision of event coordinators and judges will be final.\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Jeel Rameshbhai Mavani : +91 9426713466 \n" +
                                "Nihit Singhal : +91 7011802063 \n" +
                                "Varun Vashist : +91 9891244062 \n" +
                                "S Megha : +91 7550172089 \n" +
                                "Shashank Dhumal : +91 7358281179");
                        view.getContext().startActivity(intent);

                        break;
                    case 1:
                        Intent intent1 = new Intent(view.getContext(), test_activity.class);
                        intent1.putExtra("pic",R.drawable.starfighters);
                        intent1.putExtra("data","Description:\n" +
                                "Welcome to your cockpit captain! You are now to undergo training to avenge your troops by battling the rebel forces. Find out the mystery lurking within each of their deaths and report to the headquarters immediately.\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1:Label the cockpits.\n" +
                                "Label the cockpit as fast as you can.You will be given any random aircraft's cockpit and you have to basically label the important flight instruments and panels provided to you.\n" +
                                "\n" +
                                "Round 2:The Battleship\n" +
                                "The participants, in a team of two, will play a game of Battleships. In the game, both the teams are given a 10x10 grid sheet, where they will play their own planes given to them of different variety. They should strategically place their fighter planes and so will the opposite team. Then they will fire shots at the enemy team, by guessing the enemy team’s location of planes.\n" +
                                "\n" +
                                "Round 3:It's Simulator time\n" +
                                "Fly in flight simulator, and earn points for smooth take-off and landing, extra points for aerial stunts from the given list of aircraft in any scenery.\n" +
                                "Round 4:Air Crash Investigation \n" +
                                "A situation or scenario of an aviation emergency or a crash situation will be provided and you have to evaluate the possibility and causes of the crash. The most relevant answers will be considered.\n" +
                                "\n" +
                                "Rules:\n" +
                                "1.Team will have no access to cellphones\n" +
                                "2.Taking help of any kind will result in immediate disqualification\n" +
                                "3.Aaruush 17 common registration is compulsory\n" +
                                "\n" +
                                "4.Decision of event coordinators and judges will be final.\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Neeraj S Raj : +91 9811573610 \n" +
                                "Jasneet Singh : +91 9969777280\n" +
                                "Kavya Venkateshwaran : +91 7338894363\n" +
                                "Suraj karmakar : +91 8939082112\n" +
                                "Aditya Bhaskaran : +91 8281730463");
                        view.getContext().startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(view.getContext(), test_activity.class);
                        intent2.putExtra("pic",R.drawable.cityofstars);
                        intent2.putExtra("data","Description:\n" +
                                "“The strongest affection and utmost zeal should, I think, promote the studies concerned with the most beautiful objects. This is the discipline that deals with the universe's divine revolutions, the stars motions, sizes, distances, risings and settings . . . for what is more beautiful than heaven?”\n" +
                                "-Nicolaus Copernicus, Astronomer\n" +
                                "A story of stars, which is untold, you get a chance to unfold, the mysteries of things that are present around, you’ll explore the truth which is unfound! \n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1:Techtonics.\n" +
                                "A round of knowledge, with no bounds, any subject you like will be tested and the winner will move on.\n" +
                                "\n" +
                                "Round 2:Constellatio\n" +
                                "This round will ask for knowledge in stars, all that you will learn, will be tested, so far. A prerequisite knowledge will be provided, so don’t fear, a strong memory will be the trick for the winner.\n" +
                                "\n" +
                                "Round 3:Hands on Spyglass\n" +
                                "Invention is all it takes, build a telescope to bag your place in the next round.\n" +
                                "Round 4:Enigma Decoded\n" +
                                "The last round before it ends, an answer to a question on which it depends, whether you win or you lose, your applied logic will deduce!\n" +
                                "\n" +
                                "Rules:\n" +
                                "1.Team will have no access to cellphones\n" +
                                "2.Taking help of any kind will result in immediate disqualification\n" +
                                "3.Aaruush 17 common registration is compulsory\n" +
                                "\n" +
                                "4.Decision of event coordinators and judges will be final.\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Saloni Tripathi : +91 7550155975 \n" +
                                "Hema Krishna : +91 7397257340\n" +
                                "Vipul Sakunia : +91 7550171622\n" +
                                "Snehankur Sett : +91 9087357440\n" +
                                "Aman sharma : +91 7397251426");
                        view.getContext().startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(view.getContext(), test_activity.class);
                        intent3.putExtra("pic", R.drawable.atrekkersguide);
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