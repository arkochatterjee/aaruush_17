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

public class MyAdapter_DFundaz extends RecyclerView.Adapter<MyAdapter_DFundaz.MyViewHolder> {
    public Context mContext;
    Boolean favourite = false;
    private String[] mDataset;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter_DFundaz(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter_DFundaz.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                          int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyAdapter_DFundaz.MyViewHolder vh = new MyAdapter_DFundaz.MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MyAdapter_DFundaz.MyViewHolder holder, final int position) {
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
                        intent.putExtra("pic", R.drawable.states4);
                        intent.putExtra("data", "Description:\n" +
                                "Missing your home? We all do! Being away from one's own place is something very tough to pull off. That's why we aim at bringing you closer to your place!4 states is an event which intends to exploit the intense cultural diversity and it's melange of innumerable attributes. Indulge yourself on a journey which gives you an insight into different flavours, cultural aspects, places and people and geological wonders of the country. Let's see if you have what it takes to be called a true Indian in its truest senses !\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1: Swirlplore Your Luck\n" +
                                "\"Put on your identification cap\"\n" +
                                "Do you have what it takes to face new challenges? Come and show your patriotic fervor towards your country!! Let's see how well you know your own place and it's people!! \n" +
                                "\n" +
                                "Round 2: Race to Prevail\n" +
                                "\"Fasten your seatbelts\"\n" +
                                "Dance to the beats of desi Bhangra and to the rhythm of bharatnatyam ! Let yourselves loose people ! Desi culture is what we all Indians boast about. Let's dive in a world of rich and intense cultural attributes. Let's be shudhh desi once again !! \n" +
                                "\n" +
                                "Round 3:Venture and Explore \n" +
                                "\"Around the country in 60 minutes \"\n" +
                                "What are you waiting for ??!! Pack your bags and hop on for a journey around the country!! Travel and explore different parts of the country. Are you a cent percent Indian ??! We'll see !! \n" +
                                "\n" +
                                "Round 4: Chakh le India \n" +
                                "\"Bon Appetit\"Love to eat ??\n" +
                                "Who doesn't ! Let's show the world that no parmesan and cheddar can match the intensity of shudhh desi ghee .The diversity of Indian taste is what needs to be exploited! Chakh le India !\n" +
                                "Let's show them what a big fat Indian meal is.\n" +
                                "\n" +
                                "Rules:\n" +
                                "• Team will have no access to cellphones\n" +
                                "• Taking help of any kind will result in immediate disqualification\n" +
                                "• Aaruush 17 common registration is compulsory\n" +
                                "• Decision of event coordinators and judges will be final\n" +
                                "\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Sonam Kandoi +91 90077 03085\n" +
                                "Chitresh Garg: +91 98252 08426\n" +
                                "Pamula Sri Sruthi : +91 89031 79341\n" +
                                "Soham Dasgupta: +91 84282 77324");
                        view.getContext().startActivity(intent);

                        break;
                    case 1:
                        Intent intent1 = new Intent(view.getContext(), test_activity.class);
                        intent1.putExtra("pic", R.drawable.cid);
                        intent1.putExtra("data", "Description:\n" +
                                "There's a scarlet thread of murder running through the colorless skein of life, the police are baffled by the crime and its circumstances. Only the dead are above suspicion. Have you ever wanted to experience what Sherlock Holmes goes through when he's solving a case? Then CID is right where you belong! So, put on your coats, buckle up your belts and step into the shoes of a detective who will stop at nothing to save the city. Investigate intriguing crime cases and uncover a tragic tale of love and deadly revenge in this event, which will test both, the logical and analytical parts of your brain. \n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1: Deduce & Detect\n" +
                                "\n" +
                                "\"We can all see, but can you observe?\"\n" +
                                "Get ready to take your first step into the world of crime investigation. Put your observation skills to test. The murders have already been committed. The evidence has been left out for you, the detectives to observe the murder scenes and gather as much information as possible.\n" +
                                "\n" +
                                "Round 2:Am I Innocent?\n" +
                                "\n" +
                                "\"There is nothing like first-hand evidence.\"\n" +
                                "Another murder has taken place. You, the detectives are to investigate the crime scene, gather samples, run forensics and get to know more about the murderer.\n" +
                                "\n" +
                                "Round 3:The Chase\n" +
                                "\n" +
                                "\"Hate to sound sleazy, but tease me, I don't want it if it's that easy.\"\n" +
                                "The chase has begun! With enough proof in hand, steel your nerves and hunt for the killer in a race against time.\n" +
                                "\n" +
                                "Round 4:Can You Escape The Web?\n" +
                                "\n" +
                                "\"You have the Answer. Just be alert enough to look for it.\"\n" +
                                "It's time to finally solve the mystery. Figure out the identity of the mastermind and prove that you're the best detective out there !\n" +
                                "\n" +
                                "Rules:\n" +
                                "• Team will have no access to cellphones\n" +
                                "• Taking help of any kind will result in immediate disqualification\n" +
                                "• Aaruush 17 common registration is compulsory\n" +
                                "• Decision of event coordinators and judges will be final\n" +
                                "\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Shitanshu Thakur +91 70188 33070\n" +
                                "Aarti Dubey: +91 73974 62195\n" +
                                "Gaurang Kaushik : +91 89392 62442 \n" +
                                "M.V.P.P.Sai Hemanth: +91 89781 75655");
                        view.getContext().startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(view.getContext(), test_activity.class);
                        intent2.putExtra("pic", R.drawable.icefire);
                        intent2.putExtra("data", "Theme: \n" +
                                "Game of Thrones\n" +
                                "Description:\n" +
                                "Ice and fire is the perfect event for every game of thrones fanatic out there. It lets you explore the land of Westeros, home of the Andals, First Men etc. As every GOT head knows very well, Winter is coming. The reign of the White Walkers is just around the corner. So get ready to defeat this menace through a series of invigorating games.\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1:You know nothing\n" +
                                "Get ready to prove how big of a fan of Game of Thrones you really are. This round will have questions containing basic facts regarding the tv show, and also basic maths and science.\n" +
                                "\n" +
                                "Round 2:My watch begins\n" +
                                "Game of Thrones is known for it’s catchy dialogues and crazy scenes. Can you guess them?\n" +
                                "\n" +
                                "Round 3:My watch begins\n" +
                                "Game of Thrones is known for it’s catchy dialogues and crazy scenes. Can you guess them?\n" +
                                "\n" +
                                "Round 4: Winter has come\n" +
                                "The dreaded long night has arrived. People are dying of hunger and frostbite. The reign of White Walkers has thus begun. They are invincible and immortal. They can only be eliminated with a dragon glass. So get your coats out and swords sharpened, as you embark on hunt for the dragon glass.br>\n" +
                                "Rules:• Team will have no access to cellphones\n" +
                                "• Taking help of any kind will result in immediate disqualification\n" +
                                "• Aaruush 17 common registration is compulsory\n" +
                                "• Decision of event coordinators and judges will be final\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Abhay kumar manjhi +91 90941 70019\n" +
                                "Himanshu Sharma: +91 81245 89109\n" +
                                "Ritwika Neogi : +91 98303 48906 \n" +
                                "Asmita Pal : +91 83348 61600");
                        view.getContext().startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(view.getContext(), test_activity.class);
                        intent3.putExtra("pic", R.drawable.pottermania);
                        intent3.putExtra("data","Theme: \n" +
                                "Part 5, 6, 7 and 8 of the Harry Potter Series\n" +
                                "Description:\n" +
                                "Potter Mania 2.0 is the second season of the sensational Potter Mania 1.0 of Aaruush 2016 where you once again get to leave the Muggle world and get into the shoes of Harry Potter to relive the magical fun with Maths and Science! The mind is not a book to be opened at will and examined at leisure. So, gear up for a ‘swish and a flick’ along with some brainstorming sessions to compete with your fellow Potter Heads!\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1:The Rebellion Begins\n" +
                                "When You-Know-Who has returned, it’s time you pull up your socks and be a part of Dumbledore’s Army. Sharpen up your mind for some mind boggling questions. We’ve all got both light and dark inside us. What matters is the part we choose to act on. That’s who we really are. Yes, be ready to rise from the ashes!\n" +
                                "\n" +
                                "Round 2:Dark Secrets Revealed\n" +
                                "The menace of the Death Eaters has amplified with Draco joining Voldemort’s Army. It is the unknown we fear when we look upon death and darkness, nothing more. But remember, in this Wizard world only Maths and Science can save you and help you tread forward. Put on your invisible cloaks and go hard otherwise, go home!\n" +
                                "\n" +
                                "Round 3:“Searching is half the fun: paying attention to that piece; gives you the little tweak.”\n" +
                                "It’s time to get into hunting mode. So don the hunting attire and remember to hunt successfully you must know your ground. The Horcruxes aren’t an easy catch. The more active you are, the less you pay the price for it. Just keep in mind that life is simply solving puzzles but wit beyond measure is a man’s greatest treasure. So, hunt on Potter head!\n" +
                                "\n" +
                                "Round 4:: It All Ends Here\n" +
                                "Prepare yourself for a mind twisting and challenging series of games that need you to exhibit the best of your Maths and Science skills along with the Potter Maniac you are! Going this way, you might end the era of You-Know-Who or else it might be your end. Working hard is important. But there is something that matters even more, believing in yourself. Buckle up; Potters Heads belong to the zenith!\n" +
                                "\n" +
                                "Rules:\n" +
                                "• Team will have no access to cellphones\n" +
                                "• Taking help of any kind will result in immediate disqualification\n" +
                                "• Aaruush 17 common registration is compulsory\n" +
                                "• Decision of event coordinators and judges will be final\n" +
                                "\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Anushka Bhargava +91 89393 44323\n" +
                                "Himanshu Pandey: +91 98978 59005\n" +
                                "Abhishek Kumar\u202C : +91 97092 25132 \n" +
                                "Prateek Kumar : +91 84272 77109\n" +
                                "Deepali Verma +91 94157 80454");
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
