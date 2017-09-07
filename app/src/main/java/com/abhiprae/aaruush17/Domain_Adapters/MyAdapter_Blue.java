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

public class MyAdapter_Blue extends RecyclerView.Adapter<MyAdapter_Blue.MyViewHolder> {
    public Context mContext;
    Boolean favourite = false;
    private String[] mDataset;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter_Blue(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter_Blue.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                            int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyAdapter_Blue.MyViewHolder vh = new MyAdapter_Blue.MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MyAdapter_Blue.MyViewHolder holder, final int position) {
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
                        intent.putExtra("pic", R.drawable.event_greysmd);
                        intent.putExtra("data", "Description:\n" +
                                "Like House M.D or Grey's Anatomy? Then look no further. Grey's M.D is here for you. Bring out your inner doctor. Diagnostically climb to the top and claim the prize.\n" +
                                "Rounds:\n" +
                                "\n" +
                                "TRIVIA\n" +
                                "Round 1: \n" +
                                "Think you know all there is to know about your favourite shows? Test your mad skills.\n" +
                                "\n" +
                                "Round 2 : WORD SLEUTH\n" +
                                "Remember the bomb inside the human cavity? Or when House operated on himself? Do you know what exactly happened to whom? Bring out your inner eccentric fanboy/girl\n" +
                                "\n" +
                                "ROUND 3: DOCTOR DOCTOR\n" +
                                "Time to bring out the child in you who wanted to be a doctor. Live out your dream. Things are about to get lit!\n" +
                                "\n" +
                                "Event Coordinators:\n" +
                                "\n" +
                                "Aashray Mazumdar: RA1611009010109\n" +
                                "Celena Cherian: RA1611014010091\n" +
                                "Subarna Chakraborty: RA1611014010087\n" +
                                "Sandhiyaa B Y: RA1611020010088\n" +
                                "Santhosh Venkateshwaran S: RA1611020010002\n" +
                                "Juanit Thomas: RA1611009010185");
                        view.getContext().startActivity(intent);

                        break;
                    case 1:
                        Intent intent1 = new Intent(view.getContext(), test_activity.class);
                        intent1.putExtra("pic", R.drawable.event_221b);
                        intent1.putExtra("data", "Description:\n" +
                                "Fancy yourself as a high functioning sociopath? Come and join us on journey that will ultimately test your intelligence. After all, what's the point in being clever if you can't prove it?\n" +
                                "Rounds:\n" +
                                "\n" +
                                "ROUND 1: READY MR. HOMES\n" +
                                "Step in SHERLOCK!! Clear your mind, sharpen your vision and prove your perception.\n" +
                                "\n" +
                                "Round 2 : WELCOME DETECTIVE\n" +
                                "Go to your past, exercise your mind and gear up for the real game.\n" +
                                "\n" +
                                "ROUND 3: HUNT ‘EM DOWN\n" +
                                "Chase our people with clues to help yourself coz at the end evidence matters.\n" +
                                "\n" +
                                "Round 4 : MIND PALACE\n" +
                                "Close your eyes, open up your MIND PALACE, there ends this episode but Mr. Holmes, not yours!!\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "\n" +
                                "J.M.Catherine: RA1611014010006\n" +
                                "Nandini Sharma: RA1611009010162\n" +
                                "Vidhyutha Srivasthsan: RA1611009010177\n" +
                                "Sruthika K Ashokan: RA1611014010054\n" +
                                "Naveen Kumar U: RA1611003010018\n" +
                                "Sarath R: RA1611014010005\n");
                        view.getContext().startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(view.getContext(), test_activity.class);
                        intent2.putExtra("pic", R.drawable.event_alchemist);
                        intent2.putExtra("data", "Description:\n" +
                                "Alchemist is an event based on the basic concepts of chemistry.It has got 4 fun filled rounds which will engross participants towards chemistry.\n" +
                                "\n" +
                                "ROUND1: ELEMENTAL PONGE \n" +
                                "lemental pong is played with the hidden elements in the water and Ping-Pong balls.\n" +
                                "\n" +
                                "ROUND2: GO FISH\n" +
                                "Go Fish is the fishing of elements from the pile to form compounds.\n" +
                                "\n" +
                                "ROUND 3: ION\n" +
                                "Ion is a card game which has scads of interesting rules to form neutral compounds from the ion cards.\n" +
                                "\n" +
                                "ROUND4: MONOPOLY\n" +
                                "Monopoly is a board game played with dice, compounds, and bond energy.\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Harshitha: RA1611014010029\n" +
                                "Divyadharshini.S: RA1611014010049\n" +
                                "Amala priyadharshini.S: RA1611013010107\n" +
                                "Rudraksh Mukherjee: RA1611009010010\n" +
                                "vaishali dhakar: RA1611014010143\n" +
                                "Shalini Das: RA1611014010130\n");
                        view.getContext().startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(view.getContext(), test_activity.class);
                        intent3.putExtra("pic", R.drawable.event_nerviosa);
                        intent3.putExtra("data","Description:\n" +
                                "This event is based on how your brain works and you will get to know the magic your brain does. This event enlightens you with more connection of brain with your body. As you grow older your brain learns new spells, which may help in controlling your body. As you move through this event you will be more astonished to see the way your brain functions!\n" +
                                "\n" +
                                "ROUND 1:\n" +
                                "This round will get your brain sharper and tests how fast your brain could work.\n" +
                                "\n" +
                                "ROUND 2:\n" +
                                "A biological snake and ladder\n" +
                                "\n" +
                                "ROUND 3:\n" +
                                "Twister with real twist\n" +
                                "\n" +
                                "ROUND 4:\n" +
                                "A master mind game that will \"light up\" your brain.\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Bhuvan A: RA1611014010027\n" +
                                "Abinaya J: RA1611014010067\n" +
                                "Shivaani K: RA1611014010039\n" +
                                "rohini raj: RA1611009010041\n" +
                                "Dhanush.R.A: RA1611014010009");
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
