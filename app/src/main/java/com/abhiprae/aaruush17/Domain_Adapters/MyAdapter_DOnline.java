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

public class MyAdapter_DOnline extends RecyclerView.Adapter<MyAdapter_DOnline.MyViewHolder> {
    public Context mContext;
    Boolean favourite = false;
    private String[] mDataset;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter_DOnline(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter_DOnline.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                          int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyAdapter_DOnline.MyViewHolder vh = new MyAdapter_DOnline.MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MyAdapter_DOnline.MyViewHolder holder, final int position) {
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
                        intent.putExtra("pic",R.drawable.googlehunt);
                        intent.putExtra("data","Content:\n" +
                                "If you ever wanted to be a part of a treasure hunt but are too lazy to go out of your room in the sun, GOOGLE HUNT if the place for you. Be a part of this online treasure hunt and try your luck.\n" +
                                "Description:\n" +
                                "This treasure hunt will be conducted on the online basis, where the clues and answers will be totally online, like words in a website’s specific page and similar stuff.\n" +
                                "\n" +
                                "Rules:\n" +
                                "1.Decision of the Organizer will be final.\n" +
                                "2.If any type of malpractice is found, It will lead to disqualification of the participant. \n" +
                                "\n" +
                                "Committee Heads:\n" +
                                "Parvesh Chaudhary: +91 9003260383 \n" +
                                "Arshpreet Singh: +917206399806");
                        view.getContext().startActivity(intent);

                        break;
                    case 1:
                        Intent intent1 = new Intent(view.getContext(), test_activity.class);
                        intent1.putExtra("pic",R.drawable.digicomics);
                        intent1.putExtra("data","Content:\n" +
                                "If Marvel and DC is what you dream of, if superheroes and cartoons is what you live for, DIGI-COMIC is the right place for you. Showcase your skills of imagination and be a great comic book writer. Prove your love and devotion for all those fictional characters in this digital comic book writing arena.\n" +
                                "Description:\n" +
                                "Participants will be required to write a comic on different scenarios and on a specific topic.\n" +
                                "\n" +
                                "Rules:\n" +
                                "1. Decision of the Organizer will be final.\n" +
                                "2.If any type of malpractice is found, It will lead to disqualification of the participant. \n" +
                                "\n" +
                                "Committee Heads:\n" +
                                "Ankana Roy: +918294998015\n" +
                                "Akeel Haider: +917358331224\n" +
                                "Sonawane Shreya Prakashrao: +918754564099");
                        view.getContext().startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(view.getContext(), test_activity.class);
                        intent2.putExtra("pic",R.drawable.camophilic);
                        intent2.putExtra("data","Content:\n" +
                                "If photography is your favourite passion, if you feel that cam-worm in you then CAM-O-PHILIC is the right place for you. Come, showcase your photography skills and be the next renowned photographer.\n" +
                                "Description:\n" +
                                "1st Round:- Click a picture on a given theme.\n" +
                                "2nd Round:- A theme will be given and five pictures will have to be clicked and they should relate to make a story.\n" +
                                "\n" +
                                "\n" +
                                "Rules:\n" +
                                "1. Decision of the Organizer will be final.\n" +
                                "2.If any type of malpractice is found, It will lead to disqualification of the participant.\n" +
                                "\n" +
                                "Committee Heads:\n" +
                                "Pratik Raheja: +918910222463 \n" +
                                "Mukesh: +919003992086");
                        view.getContext().startActivity(intent2);
                        break;
                 /*   case 3:
                        Intent intent3 = new Intent(view.getContext(), test_activity.class);
                        intent3.putExtra("data","Description:\n" +
                                "Coding is the new swag and what better way to pamper it with Hacker Earth. All you coders its an open challenge to COME,CODE and COMPILE. The participants can come as a team of 2.\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1:The first round will be simple and easy. The participants will be provided with normal coding multiple choice questions. Participants have to individually get a score above the threshold limit and only then will be allowed to enter the next round.\n" +
                                "Number of questions: 20\n" +
                                "Time duration: 25 minutes\n" +
                                "\n" +
                                "Round 2:The 2nd round of the event will be based on your error detection skills. We will test the basic knowledge of syntax and analysis of code.The level of this round will be easy and the questions will be missing some tokens or the output of the code won’t be as expected. The questions will be from three languages: C, C++, Java.Participants will have to find the error and correct the code to get the correct results.\n" +
                                "Number of questions: 5\n" +
                                "The time durations will be 30 minutes\n" +
                                "\n" +
                                "Round 3: This round will be further from the depths of programming. Participants will be giving some scenario based questions of fairly easy level. There will be some additional twists to the game like the keys will be swapped. The participants can code in any of the above four languages.The level of the questions will be easy and the additional twist will make it a little more interesting.\n" +
                                "Time duration: 30 minutes\n" +
                                "The participants who have solved most questions will proceed to the next round.\n" +
                                "\n" +
                                "Round 4: This round will be about hardcore programming. The questions will be scenario based and the level of questions will be medium or hard. The questions will be long and will test the logical thinking and programming knowledge of the participants. Participants can code in any of the above 3 languages. The team or the individual to complete the questions first will be declared the winner. \n" +
                                "Number of questions:2\n" +
                                "Time: 1 Hour\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Pracheesh Pandey: +91 75501 72028\n" +
                                "Mohit Pandiya: +91 81246 01254\n" +
                                "Pooja Goel: +91 95542 47862\n" +
                                "Shivam Malani: +91 75501 69742");
                        view.getContext().startActivity(intent3);
                        break;

*/



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