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

public class MyAdapter_DYud extends RecyclerView.Adapter<MyAdapter_DYud.MyViewHolder> {
    public Context mContext;
    Boolean favourite = false;
    private String[] mDataset;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter_DYud(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter_DYud.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                           int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyAdapter_DYud.MyViewHolder vh = new MyAdapter_DYud.MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MyAdapter_DYud.MyViewHolder holder, final int position) {
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
                        intent.putExtra("pic",R.drawable.appocasm);
                        intent.putExtra("data","Description:\n" +
                                "As the name speaks APPOCASM is basically an enthusiasm for making Mobile Applications. This event welcome not only those who are hardcode app developers but also those who want to expedition in app development for the very first time. So all you App freaks, its your chance to showcase what you possess on a national level platform. The participants can come individually or as a team of 2.\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1: Simple Java Questions\n" +
                                "As we all know to run android apps we need to know java. Therefore java basic and intermediate questions will constitute to the first round MCQs.\n" +
                                "Judgement Criteria : No. Of questions correct.\n" +
                                "\n" +
                                "Round 2: XML design recreation.\n" +
                                "A XML design will be provided with some auxillary images and other hard possible designs which will have to be designed by participants.\n" +
                                "Judgement Criteria : Aptness and priority to be given to those who write the XML code instead of just drag and drop.\n" +
                                "\n" +
                                "Round 3: Basic App Making.\n" +
                                "In this round participants will be asked to make either of 4 given options\n" +
                                "Calculator.\n" +
                                "Basic Latitude Longitude reading App.\n" +
                                "Firebase authentication.\n" +
                                "Radio buttons and Intent\n" +
                                "Judgement Criteria: Aptness and time consumed. Proper working is an important factor.\n" +
                                "\n" +
                                "Round 4: Server Site Databse\n" +
                                "People qualifying to this round will be expected to be well acquainted with MySQL and php so that they can make a local server site database with XAMPP and we can check it on Postman.\n" +
                                "Judgement Criteria: Aptness and time consumed.\n" +
                                "\n" +
                                "Rules:\n" +
                                "1. Internet can be used.\n" +
                                "2. No other source of help should be taken.\n" +
                                "3. Decision of the coordinators will be final.\n" +
                                "\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Pracheesh Pandey: +91 75501 72028\n" +
                                "Mohit Pandiya: +91 81246 01254\n" +
                                "Pooja Goel: +91 95542 47862\n" +
                                "Shivam Malani: +91 75501 69742");
                        view.getContext().startActivity(intent);

                        break;
                    case 1:
                        Intent intent1 = new Intent(view.getContext(), test_activity.class);
                        intent1.putExtra("pic",R.drawable.geekcipher);
                        intent1.putExtra("data","Description:\n" +
                                "If mystery solving gives you kick or you find decrypting the encrypted then GEEK-CIPHER is definitely the place where you should be found. Come, Showcase your Sherlockism and enhance your Cipher skills. The participants can come individually or as a team of 2.\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1:Participants need to solve the Sudoku using the hints which are derived from the C code. Dry run the C code to get values and fill in your Sudoku.\n" +
                                "\n" +
                                "Round 2:A sequence of pictures will be shown to the team. The problem statement will be hidden in the series of picture. Team need to guess the problem statement and should code accordingly in the given time. Team with maximum accuracy will win.\n" +
                                "\n" +
                                "Round 3:We will provide the team with certain block of codes of with some changes in the basic keywords (for eg: for is written as gps- [g comes after f similarly p comes after o and s comes after r]). The whole block of codes will be encrypted. Teams need to decrypt it and re-write the code in other way(for eg:- in given code swapping of two numbers is done using temporary variable in other code team should not use temporary variable)\n" +
                                "\n" +
                                "Round 4: Being the last round of a Cryptography event, we expect the finalists to have good knowledge of Cryptography. Hence, they will be given chits to choose from where in two different cryptographic algorithms will be mentioned. The participants have to combine these two algorithms and make a new algorithm. Then, they have to write a code for the algorithm as well. The one who does this first will be the winner.\n" +
                                "\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Pracheesh Pandey: +91 75501 72028\n" +
                                "Mohit Pandiya: +91 81246 01254\n" +
                                "Pooja Goel: +91 95542 47862\n" +
                                "Shivam Malani: +91 75501 69742");
                        view.getContext().startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(view.getContext(), test_activity.class);
                        intent2.putExtra("pic",R.drawable.webtrap);
                        intent2.putExtra("data","Description:\n" +
                                "We have been using web pages since quiet a time now, and this is something which fascinates you then this is your place where you can prove your skills set. The participants can come individually or as a team of 2.\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1:The round 1 will be fun filled and easy and will involve basic ideas of web design and development. The participants will be given a snippet of basic HTML code and they will have to try to output the text given in the code. The text given in this code will hold importance in the 3rd round of the event. The code will have some missing tags. The knowledge of basic HTML will be enough to get you through this round.\n" +
                                "The duration of the round will be 15 minutes\n" +
                                "\n" +
                                "Round 2:This round will contain chits which the participants have to choose one paper chit from a bowl. The paper chit will contain an element of HTML or CSS to be implemented. For example, if there is video player written in the chit, then the participants have to make a video player using HTML and CSS. The participants who can complete the task within the given time period and make it attractive, will proceed to the next round.\n" +
                                "Time duration: 30 minutes\n" +
                                "\n" +
                                "Round 3: This round will be linked to the first round. The text given in the first round will have a hint to what they have to make in this round. If the text contains something like “Show me the entrance of the Chamber of Secrets”, it means that they have to create a Login page.\n" +
                                "There will be an additional twist. There will be a virtual auction. The elements of the code have to be bought from the amount of virtual money given to them. Each tag and element will be assigned a price and participants have to buy them keeping in mind the cost of the elements. For example, if the participants want to use the li tag, they will have to buy it in the auction. \n" +
                                "It will test their vast knowledge about HTML, CSS and Bootstrap in general and also their crisis handing skills. \n" +
                                "Time duration: 15 minutes for auction and 30 minutes to do the task\n" +
                                "\n" +
                                "Round 4:This will be the round where the real challenge will be given. The participants will be shown a webpage which has incorporated some elements from HTML, CSS, JS JQuery and Bootstrap. The participants have make that page in the given time period. The point to be noted here is, the tags they can use for this round will be the ones they have bought in the 3rd Round. This way, We link 3rd And 4th round. The participants who have completed the page or have come closest to finishing it, will be declared the winner. \n" +
                                "Time duration: 1 hours\n" +
                                "\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Pracheesh Pandey: +91 75501 72028\n" +
                                "Mohit Pandiya: +91 81246 01254\n" +
                                "Pooja Goel: +91 95542 47862\n" +
                                "Shivam Malani: +91 75501 69742");
                        view.getContext().startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(view.getContext(), test_activity.class);
                        intent3.putExtra("pic", R.drawable.codeearth);
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