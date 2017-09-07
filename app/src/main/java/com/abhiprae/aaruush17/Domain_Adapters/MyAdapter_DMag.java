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

public class MyAdapter_DMag extends RecyclerView.Adapter<MyAdapter_DMag.MyViewHolder> {
    public Context mContext;
    Boolean favourite = false;
    private String[] mDataset;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter_DMag(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter_DMag.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                          int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyAdapter_DMag.MyViewHolder vh = new MyAdapter_DMag.MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MyAdapter_DMag.MyViewHolder holder, final int position) {
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
                        intent.putExtra("pic", R.drawable.theindianeye);
                        intent.putExtra("data", "Rounds:\n" +
                                "\n" +
                                "Round 1:The participants will be given different foreign products that are being sold in the Indian market. They will have to come up with an Indian tagline for the same product that they will be given.\n" +
                                "Rules: 1) It’s an individual task\n" +
                                "2) The participants cannot copy the tagline of some other product that’s sold in the market they will have to come up with something of their own. Creativity will be major criteria during judgment.\n" +
                                "\n" +
                                "Round 2:In this round, the participants will be shown a movie clip and they can choose any product that they see in the clip and come up with an Indian version of the same.\n" +
                                "Rules: 1) Individual task.\n" +
                                "\n" +
                                "Round 3:In this round, the participants will be asked to set up a company for themselves according to their product, a logo for their company (the logo must be Indian), a tagline for their product, a radio jingle. They also need to come up with a plan of how they can sell it in the market like make a website to sell it, or an app, or any other business pan they have in mind to help them sell their product efficiently.\n" +
                                "Rules: 1) Team work\n" +
                                "2) A proper detailed description must be given about the business plan like if it’s a website a small illustration of how the website will look should be submitted along with the other things.\n" +
                                "\n" +
                                "Round 4: Participants will be given a certain virtual amount and a raw material that may or may not be useful for them. A virtual market with products that are required for everyone will be made available to the participants. They can now spend their money buy and sell products in the virtual market. The ones who buy all the necessary materials required to make their product and has the highest amount of money left with them will move on to the final round.\n" +
                                "Rules: 1) The virtual amount given will be the same to every participant.\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Abhishek Kumar Jha +91 75501 73234\n" +
                                "Prakhar Soni: +91 84288 41133\n" +
                                "Rajarshi chakraborty : +91 91762 73667\n" +
                                "Arushi Gangola : +91 75501 53736\n" +
                                "Rushali Gupta : +91 89391 03440");
                        view.getContext().startActivity(intent);

                        break;
                    case 1:
                        Intent intent1 = new Intent(view.getContext(), test_activity.class);
                        intent1.putExtra("pic", R.drawable.hiredorfired);
                        intent1.putExtra("data", "Rounds:\n" +
                                "\n" +
                                "Round 1: For your Eyes Only\n" +
                                "The logo of a brand will be made in to a jigsaw puzzle. Along with it we will add similar incorrect jigsaw pieces to confuse the participants. They must put the correct pieces and recreate the logo in the given time.\n" +
                                "\n" +
                                "Round 2: Casino Royale\n" +
                                "There will be a pinwheel given which will be showing the companies' stocks and it's rise and fall after each spin. It will be divided randomly into sections which will not be equal. As the wheel spins, the point at which it stops decides the rise and fall of that stock. As the pinwheel does not have equal distribution of red and green slots, the process is purely based on chance, just like stocks originally are.\n" +
                                "\n" +
                                "Round 3: Gold finger\n" +
                                "Participants in groups must practically recreate the brand allotted to them. They will be given 60 minutes to decide their product and collect junk/items from the College campus. In the next 40 minutes, they must materialize their product using the items that they have collected. Materials like glue, stapler, etc. will be provided to them by the hosts.\n" +
                                "RULES: Judging criteria will be based on the choice of product, recycling of junk, innovation and creativity, marketing skills.\n" +
                                "\n" +
                                "Round 4: No deals, Mr Bond\n" +
                                "All The participants who qualify to round 4 will be given a chit upon entering, the chit will contain a situation according to which they have been fired from their respective companies. A duration of 1 hour will be given to each team in which they will have to come up with a speech stating reasons to re-hire them.\n" +
                                "RULES:\n" +
                                "The duration of speech should not exceed 15 minutes. After the speech 5 minutes will be given to other companies to refute the speech. Marks will be given to the speech as well as to the companies that refute accordingly.\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Aprajey Akhouri +91 89390 55202\n" +
                                "Ayushman Borah: +91 99529 22506\n" +
                                "Ayushi Kumar : +91 89393 29871\n" +
                                "K KISHORE : +91 96264 13805\n" +
                                "Vikesh Ku Singh : +91 96319 72779");
                        view.getContext().startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(view.getContext(), test_activity.class);
                        intent2.putExtra("pic", R.drawable.manwithaplan);
                        intent2.putExtra("data", "Theme:\n" +
                                "\n" +
                                "Stock Market, entrepreneurship, ethical values of business.Rounds:\n" +
                                "\n" +
                                "Round 1: Licence To Hunt\n" +
                                "Participants will be given hints with the help of which they have to find the clues which are hidden around the campus. The clues will include famous taglines or names of famous business personal. The participants have to crack the clue and bring back the answer.\n" +
                                "Rules: It is an individual, time critical task.\n" +
                                "\n" +
                                "Round 2: Golden Mind\n" +
                                "Situations (real or fictional) will be provided to the participants. There will be three options and a blank space provided. Considering the ethical values of business, the participants have to choose an appropriate answer or provide their own. The participants will be judged on the views of business and their awareness of business ethics.\n" +
                                "Rules: It is an individual , time critical task.\n" +
                                "\n" +
                                "Round 3: Quantum Of Solace\n" +
                                "Participants are given a list of social issues like drug abuse, traffic, women safety…ect to pick from. They have to come up with with an innovative product or service which can help counter the issue chosen.They have to then present their idea on paper with a logo, a tag line and a business plan. The participants will be judged on their innovative thinking and presentation of their product.\n" +
                                "Rules: It is a group task. Participants will be given 5 mins to choose their issue and 45 mins to come up with the idea.\n" +
                                "\n" +
                                "Round 4:A View For Property\n" +
                                "In this round the participants will play the basic game of monopoly with the plots being that of SRM University. Dice will be provided. Each participant will be provided with a minimum amount of monopoly money to start with. They can buy the place they land on and if they land on the same place next time they can build a house to increase their income. When a fellow participant lands on your plot , the participant will have to pay rent. The basic ‘community chest’ and ‘take a chance’ cards will be provided which will have to be drawn and followed when the chance occurs. The participant with the highest amount of money and value of plots will be the winner.\n" +
                                "Rules: It is an individual task.\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Kishan +91 75608 87027\n" +
                                "Harshit Tiwari: +91 98737 07120\n" +
                                "Nehal Agnihotr : +91 77710 08046\n" +
                                "Shaswat Dubey : +91 89489 49577\n" +
                                "V AMUKTHAMALYADA : +91 75501 72784");
                        view.getContext().startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(view.getContext(), test_activity.class);
                        intent3.putExtra("pic", R.drawable.apl);
                        intent3.putExtra("data","Theme:\n" +
                                "\n" +
                                "Stock Market, entrepreneurship, ethical values of business.Rounds:\n" +
                                "\n" +
                                "Round 1:In this round, two boxes will be provided to the participants containing a set of questions. Get ready for a joy ride down the spin bowls of cricket management. \n" +
                                "\n" +
                                "Round 2: It's basically a sponsorship round. We as committee heads will be representors of a company which they want the sponsorship for. But they must specify which company which they want the sponsorship for and accordingly they would approach us and based on their pitching, they will be awarded the amount which will be helpful for them in the round\n" +
                                "\n" +
                                "Round 3: IPL Auction \n" +
                                "An event for everyone who not only just loves the game of cricket, but also analyses it to the limit. This event makes you the don of the hat of a bidder. You need to manage your budget and you can strategize to make the best possible team competing against other opponents who will give you a run for your money, quite literally. If you love cricket, if you have followed IPL and if you can mix common sense with passion into your bidding strategy, this event is a must for you.\n" +
                                "\n" +
                                "Rules: \n" +
                                "1. A team must comprise of 2-3 members.\n" +
                                "2. A team member cannot register in more than one team.\n" +
                                "3. Multiple teams from institutes are allowed and encouraged\n" +
                                "4. In case of discrepancies, decision of the judges/event organizers will be final.\n" +
                                "\n" +
                                "Judging Criteria :The team which will have the highest attribute score will be judged as the Winner of the event.\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Kushank Mahajan +91 94637 43900\n" +
                                "Harshit Shukla: +91 75501 67020\n" +
                                "Shivam Bhatia : +91 89015 43339\n" +
                                "Pranav Bharti : +91 84282 77588");
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

