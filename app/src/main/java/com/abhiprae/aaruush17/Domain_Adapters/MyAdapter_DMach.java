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

public class MyAdapter_DMach extends RecyclerView.Adapter<MyAdapter_DMach.MyViewHolder> {
    public Context mContext;
    Boolean favourite = false;
    private String[] mDataset;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter_DMach(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter_DMach.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                           int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyAdapter_DMach.MyViewHolder vh = new MyAdapter_DMach.MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MyAdapter_DMach.MyViewHolder holder, final int position) {
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
                        intent.putExtra("pic",R.drawable.cartantara);
                        intent.putExtra("data","Description:\n" +
                                "What’s the whole framework on which the car is made rigid? Chassis. Involving the basics of the truss and its application, Machination presents Car Tantra. Play, test, and build your knowledge about trusses. \n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1: Piece by Piece\n" +
                                "Bit by bit we’ll go. Get a puzzle, analyze the helping image, remember, and start arranging it up. Puzzling is more fun in engineering. Let’s go mind boggling.\n" +
                                "\n" +
                                "Round 2: The Assembly Line\n" +
                                "What happens when you combine assembly and an app? You get The Assembly Line. Test your practical knowledge here. Make best use of the of the material provided in the mobile game and make a rover. But be strong!\n" +
                                "\n" +
                                "Round 3: Trust your Truss\n" +
                                "\n" +
                                "Every parameter comes in account while building a prototype. Don’t forget anything this time. Make a structure strong enough to sustain itself. It’ll go through a lot of crash test. Build the strongest structure, and you are the winner.\n" +
                                "\n" +
                                "Rules and Regulations\n" +
                                "\n" +
                                "1. Participants are not allowed to use mobile phones during the event.\n" +
                                "2. Participants can either take part individually or in teams of 2.\n" +
                                "3. Event and Common Registration is compulsory.\n" +
                                "4. Taking help of any kind will result in immediate disqualification.");
                        view.getContext().startActivity(intent);

                        break;
                    case 1:
                        Intent intent1 = new Intent(view.getContext(), test_activity.class);
                        intent1.putExtra("pic",R.drawable.wildstrike);
                        intent1.putExtra("data","Description:\n" +
                                "Does the sound of guns give you more rush than a can of RedBull? Are you always on the edge of your seats during action sequences? Is Arnold Schwarzeneggar one of your favourite heroes? If yes, then be ready to be FIRED... Coz here \"Nothing is true, everything is permitted!!\"\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1: To know about a weapon, the basics are a must. A quiz round allows the participants to showcase their knowledge\n" +
                                "\n" +
                                "Round 2: Forged from fire\n" +
                                "\n" +
                                "Hand eye coordination and response time.is crucial in a conflict situation. An audio visual round that will test your responses.\n" +
                                "\n" +
                                "Round 3: Weapon Masters\n" +
                                "\n" +
                                "A round to test your engineering creativity. Grab what u need from daily stuff, assemble and bang. This round will put forward your management skills and technicality.\n" +
                                "\n" +
                                "Event Coordinators:\n" +
                                "\n" +
                                "Ankit Srivastav: 8939434573\n" +
                                "Anudipta Chaudhuri: 9475586318\n" +
                                "Asidipta Chaudhuri: 8900400528\n" +
                                "Rajkanya Datta: 9952902095\n" +
                                "Tanya Pande: 9595088551");
                        view.getContext().startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(view.getContext(), test_activity.class);
                        intent2.putExtra("pic",R.drawable.retronation);
                        intent2.putExtra("data","Description:\n" +
                                "It is the opportunity to explore THE VINTAGE MACHINES and revive the thirst to go further and gain knowledge about the purest of machines which have evolved to be the best ROUND DESCRIPTION.\n" +
                                "\n" +
                                "ROUNDS\n" +
                                "\n" +
                                "ROUND 1:\n" +
                                "Do you have what it takes? Come and prove your knowledge . See the basic engine and machine concepts in a series of slides projected.\n" +
                                "\n" +
                                "ROUND 2:\n" +
                                "Time to have some quick reflexes!!!See the pic which would be depicting something and be the first tohit the pedal to the medal.\n" +
                                "\n" +
                                "ROUND 3:\n" +
                                "Let’s get your hands dirty!! With the help of clues and trails of thebasic components go in search for it in our SRM city and then build avintage beauty.........an amazing masterpiece.\n" +
                                "\n" +
                                "EVENT COORDINATORS:\n" +
                                "\n" +
                                "GNAANAVARUN: 8939033039\n" +
                                "POOJA N GAJBIYE: 7032662304\n" +
                                "M.AYESHWARRAM THANGARAJ: 9941622200\n" +
                                "R.YESHWANTH: 9843670560\n" +
                                "A SUJITH KUMAR: 9092655465");
                        view.getContext().startActivity(intent2);
                        break;
                    /*case 3:
                        Intent intent3 = new Intent(view.getContext(), test_activity.class);
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