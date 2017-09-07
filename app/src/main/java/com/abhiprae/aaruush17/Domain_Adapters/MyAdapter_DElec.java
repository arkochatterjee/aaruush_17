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

public class MyAdapter_DElec extends RecyclerView.Adapter<MyAdapter_DElec.MyViewHolder> {
    public Context mContext;
    Boolean favourite = false;
    private String[] mDataset;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter_DElec(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter_DElec.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                              int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyAdapter_DElec.MyViewHolder vh = new MyAdapter_DElec.MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MyAdapter_DElec.MyViewHolder holder, final int position) {
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
                        intent.putExtra("pic",R.drawable.electracode);
                        intent.putExtra("data","Description:\n" +
                                "Electra-code is an event under the domain “ELECTRIZITE” in AARUUSH’17.This event gives a basic knowledge to the participants of electrical and coding stuff. It also gives the participants an idea of microprocessors and micro-controllers and also to implement it practically. This event consists of four rounds. The participants will be promoted to the successive rounds depending upon the points they gain in each round.\n" +
                                "\n" +
                                "Rounds:\n" +
                                "Round 1:BRAINSTORM>\n" +
                                "In this round, the participants will be certain sets of MCQ’s related to electrical and electronic stuffs as well as coding other than this; this round will contain some brain storming round.\n" +
                                "Round 2:CODATHON\n" +
                                "In the second round, the participants will be provided with some logics and for those logics, the participants have to program a code in C. The participants can also use flow chart representation to get the output in a given time limit.\n" +
                                "Round 3:ELECTRO BLITZ\n" +
                                "IIn this round, the participants will get a circuits which they have to program using aurdino based programming in the given specific time period and must get the output.\n" +
                                "Round 4:SHOCKDOWN CODA\n" +
                                "This round aims to test the practical knowledge of the participants. The participants will be given two tasks which they have to solve using aurdino programming and get the output of the same.\n" +
                                "\n" +
                                "Rules:\n" +
                                "1.ID card is compulsory for participating in event.\n" +
                                "2. First round of the event would be judged on the basis of number of correct answers given by the participants example: If the question has 20 questions, the participant will be eligible for the next round if they give 10 correct answers.\n" +
                                "3.Second round of the event would be judged on the basis of the correct code written. If the code is incomplete or partially complete points will be provided depending upon the level of completion. \n" +
                                "4. Third round is purely based on the time limit; participants need to complete the given task in stipulated time.\n" +
                                "\n" +
                                "5.Fourth round would be judged on time else well as the required outputs.\n" +
                                "\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "GAURAV YADAV: +91 7049635431\n" +
                                "SIDDHANT RAJ: +91 8953447700\n" +
                                "BHUSHAN CHANDWANI: +91 9425392225\n" +
                                "RIMA HALDER: +91 8232049584\n" +
                                "TARWAY PREETI RAKESH: +91 7550167602\n" +
                                "E.SIDDHARTH MANNADIAR: +91 8458860005");
                        view.getContext().startActivity(intent);

                        break;
                    case 1:
                        Intent intent1 = new Intent(view.getContext(), test_activity.class);
                        intent1.putExtra("pic",R.drawable.digitronics);
                        intent1.putExtra("data","Description:\n" +
                                "This event is completely based on digital electronics circuits and their various applications. Digital electronics circuits are circuits which operates on discrete digital values rather than continuous analog signals. This event will judge the participant’s understanding of digital electronics and its various applications. As the event will progress the difficulty levels of the rounds will increase. Event will judge the participants technical skills as well as ability to complete a time bound task. \n" +
                                "\n" +
                                "Rounds:\n" +
                                "Round 1:Resisthon\n" +
                                "The contestants will be given a certain number of resistors whose resistance values they have to obtain according to the convention within a specified time. \n" +
                                "time limit-3minutes \n" +
                                "Round 2:Gatelock\n" +
                                "Phase 1:\n" +
                                "This round will begin with showing of basic logic gates and gate circuits to participants. This circuits will be shown as a gif files which will be continuously changing within time interval of 30 sec. This whole process will be repeated 3 times. The participants will have to identify the maximum number of gates and they have to make the truth table . The more number of circuits they identify ,more marks will be given to them. \n" +
                                "time limit-3minutes\n" +
                                "Phase 2:\n" +
                                "In this round many digital codes like hexa decimal, grey, binary etc. will be given to participants in the form of a questionnaire. They have to convert it in one minute of time. The more codes they convert the more marks will be given to them.\n" +
                                "For example :\n" +
                                "(4)16 = (0100)2\n" +
                                "The participants having marks more than a certain cut-off will be sent to round 2.\n" +
                                "time limit-5minutes\n" +
                                "Round 3:Circuitnation\n" +
                                "In this round the participants will be provided a bowl containing many chits. Each chit will contain a logic circuit. The participant will have to pick a chit from bowl and implement it on a trainers kit. The event will be time bound and if a participant implements a circuit before time then he can pick further chits from bowl. The more no of circuits he will implement the more marks will be awarded to him. High scoring participants will be sent to next round.\n" +
                                "time limit- 7 minutes \n" +
                                "Round 4:Cracktrixx\n" +
                                "In this round each participant will be provided a certain code which they have to crack. The answer of this code will be some numbers. They have to display this number in a seven segment matrix display. The time of individual will be noted and the individual with least time will be the winner. time limit-10minutes \n" +
                                "\n" +
                                "Rules:\n" +
                                "1.ID card is compulsory for participating in event.\n" +
                                "2. Students must not use their mobile phones during the event.\n" +
                                "3.No extra time will be given for the event \n" +
                                "Coordinators:\n" +
                                "Nayanika Purkayastha: +91 9436747292\n" +
                                "Saad Hashmi: +91 7550166979\n" +
                                "Nikhil Kumar Singh: +91 7358724781\n" +
                                "Nihar Pathak: +91 7358724781\n" +
                                "M Kartik: +91 9540697111");
                        view.getContext().startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(view.getContext(), test_activity.class);
                        intent2.putExtra("pic",R.drawable.electrobuzz);
                        intent2.putExtra("data","Description:\n" +
                                "Objective: To grasp a general idea about the concepts on which the events are to be based and give a direction to the functioning of the domains henceforth.\n" +
                                "\n" +
                                "THEMEBasics of electrical and electronics \n" +
                                "\n" +
                                "ABOUT THE EVENT: \n" +
                                "Detailed description of the Theme selected. The theme of the event is based on the knowledge of basic electrical and electronics . The one who is strong in his basic concepts can easily crack the rounds of this event . The event has three rounds and each round will consist of checkpoints . In the first round there are three checkpoints: memorandum , circuit builder and logogyan. In round 2 also there are three checkpoints : Rapid fire , debugging the circuit and crossword. Round 3 is the last round of the event which includes the event treasure hunt. \n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1: ELECTRO MORGULIS\n" +
                                "Checkpoint 1:Memorandum:In this the participants will be shown slides of different electrical components within a short period of time, they have to write down the names of the electrical components as many as they can remember. The participants with the maximum no of components will be allowed to progress through the next checkpoint.\n" +
                                "Checkpoint 2:\n" +
                                "Circuit Builder : In this the participants will be given a made circuit ,they have to identify the components as well as the circuit. For example :( Halfwave rectifier: Resistors, diodes, etc) Participants who complete this in minimum time will progress through the next checkpoint.Checkpoint 3:\n" +
                                "Logogyan:In this various program complier platform names will be given and the corresponding provider of the complier should be specified by the participants . (Matlab--->Mathworks)\n" +
                                "\n" +
                                "Round 2: ELECTROFELL\n" +
                                "Checkpoint 1:\n" +
                                "Rapid fire: The participants will be asked a several set of questions based on electronic circuits and components, they have to answer the question within that given span of time. The answer should be given within the time limit.The participants with the maximum marks and minimum time advances to the next checkpoint.For example: (How many diodes are used in bridge rectifier? )\n" +
                                "Checkpoint 2:\n" +
                                "Debugging the circuit:The participants will be given a circuit with technical glitches , they have to identify these glitches and remake the circuit so that it gives desirable output.The participants who completes the circuit in a given time advances to the next checkpoint.For example : (In rectifier circuit the diodes and placed in reverse order)Checkpoint 3 :\n" +
                                "Crossword:The participants will be given a crossword puzzle in which they have to write the name of the electrical component according to the given clues in the crossword. After completing the crossword they will be given a bunch of electrical components from which they have to find as many of the components that are mentioned in the crossword.The participants with the maximum number of components advances to the next round. \n" +
                                "\n" +
                                "Round 3: ELECTRO DOHARIS\n" +
                                "Treasure hunt:The participants will be sent to different rooms where they will be handed certain clues about a circuit that has to be made . They have to understand the clues and make the circuit accordingly , after the 1st circuit is done they will be given another clue as to where they have to go and what circuit they have to make next. On completing this stage they have to follow another set of clues which will eventually lead them to the final destination where they have make the last and final circuit. The participant who completes all the task quickly and with minimum time is declared as the winner .\n" +
                                "\n" +
                                "Rules:\n" +
                                "1-ID card is compulsory for participating in event.\n" +
                                "2-First round of the event would be judged on the basis of number of correct answers given by the participants example: If the question has 20 questions, the participant will be eligible for the next round if they give 10 correct answers.\n" +
                                "3-Second round of the event would be judged on the basis of the correct code written. If the code is incomplete or partially complete points will be provided depending upon the level of completion.\n" +
                                "4-After completing the second round participants will proceed to final round");
                        view.getContext().startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(view.getContext(), test_activity.class);
                        intent3.putExtra("pic", R.drawable.electromania);
                        intent3.putExtra("data","Description:\n" +
                                "hey!!! Do u find electric circuits mesmerizing...dnt wry deres nothing wrong with dat...coz we are here to appreciate ur talents and give u a chance to discover ur true selves... Because we believe in electromania!!!\n" +
                                "\n" +
                                "Rounds:\n" +
                                "Round 1: \n" +
                                "Phase 1\n" +
                                "The question bank as well as the posted answer wall will be there. The participants have to be quick to think and pick.\n" +
                                "Phase 2:\n" +
                                "The color will be unleashed only if you answer the question right. Use the colour codes then find the resisitor.\n" +
                                "Round 2:bugs don’t buzzAs the name goes identify and remove the bugs so that the circuit buzzer does not get activated while the led glows.\n" +
                                "Round 3:the wolf of riddles\n" +
                                "Circuit were never more fun..! the participant will be given a riddle that will have the hidden circuit pattern. They need to identify and construct it.\n" +
                                "Round 4:hunt of electromon\n" +
                                "The campus is like you edison’s island. The components are hidden all over the place. The answer to the question will help you find your way to the components. Once you get all the components then all you need to do is construct the circuit correctly.\n" +
                                "\n" +
                                "Rules:\n" +
                                "1.ID card is compulsory for participating in event.\n" +
                                "2. Students must not use their mobile phones during the event.\n" +
                                "3.No extra time will be given for the event \n" +
                                "\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Rahul Suthar: +91 8302591752\n" +
                                "Krishnanunni Venu Menon: +91 8943825170\n" +
                                "PANGA MAMATHA: +91 9441932929\n" +
                                "Geever Alwin : +91 7338942523\n" +
                                "GUMMA SRILEKHA: +91 9952921019\n" +
                                "Mahima Nair: 8879736269");
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