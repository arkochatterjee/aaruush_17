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

public class MyAdapter_DPrae extends RecyclerView.Adapter<MyAdapter_DPrae.MyViewHolder> {
    public Context mContext;
    Boolean favourite = false;
    private String[] mDataset;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter_DPrae(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter_DPrae.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                           int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyAdapter_DPrae.MyViewHolder vh = new MyAdapter_DPrae.MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MyAdapter_DPrae.MyViewHolder holder, final int position) {
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
                        intent.putExtra("pic",R.drawable.paperpresentation);
                        intent.putExtra("data","Description:\n" +
                                "\n" +
                                "\n" +
                                "Theme of this event is to depict the 4 - stages of life i.e school, college, work, and death. All the 4 rounds are based on the 4 stages of life.\n" +
                                "This event is about the 4- stages of life and related memories with these 4 - stages. The motive of this event is to recall all the memories and depict all those memories in any expressive way.Rounds:\n" +
                                "\n" +
                                "Round 1:This round is analogous to the first stage of life where an individual learns to survive in this world and makes everlasting friends with whom they have numerous memories. In this participants will be given to write, draw about their best school memory. Any medium can be used to portray the school memories in the best possible manner.\n" +
                                "\n" +
                                "Round 2: This round is related to college life. It talks about college life where you experience different emotions and how you deal with them. In this participants will be given two emotions and he has to choose any one of them and defend that emotion through his expression and speech.\n" +
                                "\n" +
                                "Round 3: This round is analogous to the stage in life where a person is over with his college life and is on the initial stages of building their careers. This round is a formal interview in which the participants will be asked to prepare their CV based on which an interview would take place. The performance of the participants in the interview would determine whether they reach the final round.\n" +
                                "\n" +
                                "Round 4:Last stage of life where the participant is at a deathbed and is at a final leg of his/her life.\n" +
                                "In this round, the participants will be given a choice to change 1 aspect of his/her life and then speak on it. Elaborate on the beautiful life that they have had. The winner will be decided on the basis of how detailed and imaginative their story is.\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Pooja +91 75501 72853\n" +
                                "Aditi +91 73582 81919\n" +
                                "Tanya +91 98106 77699\n" +
                                "Hardik +91 89792 03601");
                        view.getContext().startActivity(intent);

                        break;
                    case 1:
                        Intent intent1 = new Intent(view.getContext(), test_activity.class);
                        intent1.putExtra("pic",R.drawable.expresso);
                        intent1.putExtra("data","Description:\n" +
                                "\n" +
                                "\n" +
                                "As the name suggests, it’s about expressing oneself by different means.\n" +
                                "It checks out the overall view point of the participant towards seeing things.\n" +
                                "It gives an opportunity to test all forms of communication and how effectively one is able to present themselves.Rounds:\n" +
                                "\n" +
                                "Round 1:The participant would be asked to select a random chit from a bowl. On the chit would be written the name of any object (eg. Sharpener, pen, fan, etc.). Now the participant, according to the object on the chit, would have to express his/her life as that object in a specified amount of time like 30 seconds or a minute. The participant who is spontaneous enough and is able to talk without taking excessive time out gets promoted to the next round.\n" +
                                "Eg.- Suppose the participant has to talk about a pen. He/she could start by talking about where he/she was made, what is he/she made of, who were his/her previous owners, any specific accident that might have happened to him/her in the past, etc. (The idea is to be spontaneous enough so that you’re able to talk for the specified amount of time).\n" +
                                "\n" +
                                "Round 2: 5-6 random words or quotes would be given to the participant and using those words or quotes, they would have to make up an interesting story or a plot.Now, after the participant has written his/her story, they will be asked to be a critic of their own story and thus, they will have to point out the loopholes in it.\n" +
                                "Eg.- Suppose the participant has been given a quote “Live within your income, even if you have to borrow to do so”. Now the participant has to come up with an interesting story or a plot that is somewhat related to the quote, directly or indirectly. After writing the story or the plot, the participant would be asked to critically analyze their own story or plot and point out the loopholes in it.\n" +
                                "\n" +
                                "Round 3: A half drawn painting will be given to the participant and the participant, using their own imaginative and creative skills would have to complete the drawing and give it a deep meaningful touch. The participant has to explain what the painting depicts either orally or by writing.\n" +
                                "Eg.- Suppose the participant has been given a half drawn painting of a scenery. The participant then would have to draw the other half using his/her creative skills and give the painting a meaningful touch. It’s not necessary that the other half should be related to the scenery. In the end, the full painting should carry a meaning.\n" +
                                "\n" +
                                "Round 4:The participant would be shown a series of pictures relating to anything. He/she would then have to write a meaningful poem relating to the series of pictures and then decipher it.\n" +
                                "Eg.- Suppose the participant is shown a series of 5 pictures that consists of a picture of a beautiful valley, a picture of a boy, a picture of a dog, a picture of a flower and a picture of a river. Now the participant has to link these pictures in a way so as to make a meaningful poem out of it. He/she would then have to decipher the poem.\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Kriti +91 75501 72822\n" +
                                "Vagisha +91 78570 47203\n" +
                                "Vidushi +91 89392 69226\n" +
                                "Pranav +91 99208 43823");
                        view.getContext().startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(view.getContext(), test_activity.class);
                        intent2.putExtra("pic",R.drawable.fandom);
                        intent2.putExtra("data","Description:\n" +
                                "\n" +
                                "\n" +
                                "FANDOM. Aims at exploiting the large and ever growing world of fans following different TV Series and movie franchises.\n" +
                                "ABOUT THE EVENT: We will have a list of TV Series and movie series (like Game of Thrones, FRIENDS, Harry Potter, Star Wars, etc). The participants will be asked to choose 3 among these and the whole event for them will be based on the 3 they chose for them.\n" +
                                "These events will appeal to the large numbers of fans and will test them on their knowledge and skills to write fan fictions based on the ones the love.Rounds:\n" +
                                "\n" +
                                "Round 1:Participants will be asked rapid fire questions based on their chosen series all whilst doing a physical task, like playing badminton, etc.\n" +
                                "\n" +
                                "Round 2:The participants will play a game of charades based on the characters/objects from their fandom.\n" +
                                "2.The participants will be required to write a fan fiction by using all the characters and objects they win in the previous round and will judged on various parameters.\n" +
                                "\n" +
                                "Round 3:The participants will have to face each other in pairs for this round. They will both chose 1 fandom each and now will play a game of Block and Tackle. They will have to defend their own fandom and trash talk the opponent’s fandom.\n" +
                                "\n" +
                                "Round 4:This will be the Quest. The participants will be required to reach the destination after solving various riddles, tasks and puzzles. One reaching the end first gets to be the king/queen of the Fandom. The task may include stuff like trying to convince a neutral person that he/she is a particular character and so forth. Each location will offer a task and a clue. The participants will get the clue only after completing the task.\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Prutha +91 95501 67905\n" +
                                "Pushpa +91 94661 90776\n" +
                                "Aashi +91 88790 87023\n" +
                                "Jai +91 90877 83527");
                        view.getContext().startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(view.getContext(), test_activity.class);
                        intent3.putExtra("pic", R.drawable.modinomics);
                        intent3.putExtra("data","Description:\n" +
                                "\n" +
                                "\n" +
                                "Continuation of the previous edition of Modinomics, this event aims at providing real world scenarios where participants will work together as a team to come up with practical solutions to tackle situations as a world leader. A simulation of the national stage where each participant would be tested based on their leadership skills through a set of rounds and a Grand Conference.Rounds:\n" +
                                "\n" +
                                "Round 1:The participant would be provided with a picture and accordingly the participant would have to write an article in less than 60 words expressing a fictional real world scenario based on the picture shown.\n" +
                                "The participants would be tested based on their creativity and their writing.\n" +
                                "\n" +
                                "Round 2:The participants would be given a Indian Cabinet Post and an agenda along with a study guide. The participants have to speak on the topic given for an allotted time and express their views on the topic and recommend solutions to the agenda based on their post.\n" +
                                "\n" +
                                "Round 3 (2 days):A 2 day simulation of a crisis Conference where participants will have to debate with each other, and come up with feasible solutions to the crisis. This crisis has to be solved as a committee. The participants with the best solutions and a knack to sway the committee will be declared as the winner.\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Swasti +91 73185 56894\n" +
                                "Vinny +91 83025 36330\n" +
                                "Mansi +91 99997 79605\n" +
                                "Tushar +91 97571 71863");
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