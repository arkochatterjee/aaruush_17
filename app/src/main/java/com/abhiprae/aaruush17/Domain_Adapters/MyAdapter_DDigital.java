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

public class MyAdapter_DDigital extends RecyclerView.Adapter<MyAdapter_DDigital.MyViewHolder> {
    public Context mContext;
    Boolean favourite = false;
    private String[] mDataset;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter_DDigital(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter_DDigital.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                           int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyAdapter_DDigital.MyViewHolder vh = new MyAdapter_DDigital.MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MyAdapter_DDigital.MyViewHolder holder, final int position) {
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
                        intent.putExtra("pic",R.drawable.artsylens);
                        intent.putExtra("data","Theme: Artsy lens is an event that has come up in order to help students built in confidence on his/her creative abilities and let him/her explore their brain as to making them think out of the box.\n" +
                                "\n" +
                                "Description: It is an event which consist of three rounds. These rounds would seem to look as an easy task but it has its own level of difficulty that will helps us in testing the cognitive abilities of a student for his/her well being in the world of digitalisation.\n" +
                                "\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1: The Picture \n" +
                                "About round: Participants are given 5 different pictures. He/she has to make a new picture using these pictures through Photoshop or paints application. The time limits is 1 hour . \n" +
                                "Example:- Five pictures of different natural environment is given to the candid .He / she is given 1 hour to make a new unique natural environment using them.\n" +
                                "\n" +
                                "Round 2:Pic stop\n" +
                                "About round:-Photographers have to go to pic stop, there they will be given a theme and they have to click a photo on that theme using different photography skills. The time limit is 1 hour.\n" +
                                "Example:- The theme given to candidate is bikes. He/She is given 1 hour to go around the campus in search of different bikes and click photos of it using their phones with different photography skills and effects.\n" +
                                "\n" +
                                "Round 3 : Capture the Beauty\n" +
                                "About Round:-Go around the beautiful campus of SRM UNIVERSITY and click pics of the beautiful places in and around the campus and make a presentation showcasing the beauties of the University.But this has to be done using an Instax cameras which we will provide to the participant.Instax is used in olden days to capture a pic and get a copy within fraction of seconds.\n" +
                                "\n" +
                                "Round 4:Poster Mania\n" +
                                "About round:-In the final round the participant has to design two posters defining any change.Theme can be chosen by the participant himself.Particpant can also design a poster for Aaruush following all the criteria required.\n" +
                                "\n" +
                                "Rules:\n" +
                                "1.Taking help from any external source or non-particpant will result in immediate disqualification.\n" +
                                "2.Team will have no access to cellphone.\n" +
                                "3.Common Registration is compulsory for participation.\n" +
                                "4.Decision of Event Coordinators and Judges is final.\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "Coordinators:Aakash Mal: +91 77027 29278 \n" +
                                "Harish: +91 97878 79513\n" +
                                "SriVidya: +91 76739 37555\n" +
                                "Zindahi Flinxzer: +91 94444 34959");
                        view.getContext().startActivity(intent);

                        break;
                    case 1:
                        Intent intent1 = new Intent(view.getContext(), test_activity.class);
                        intent1.putExtra("pic",R.drawable.digizine);
                        intent1.putExtra("data","Theme:THIS EVENT IS FOR THOSE WHO ARE GOOD WITH VOCABULARY.IT TESTS OUT THE CREATIVE SKILLS OF THE PARTICIPANT IN VIDEOGRAPHY,DUBSMASHING.\n" +
                                "\n" +
                                "Description:THE EVENT HAS THREE ROUNDS.IN FIRST ROUND THE VOCABULARY OF THE PARTICIPANT WILL BE TESTED.THE SECOND ROUND IS FUN STUFF CONTAINING DUBSMASH.IN THIS ROUND PARTICIPANTS WILL MAKE A DUBSMASH AS PER THEIR CREATIVITY.THIRD ROUND IS CALLED UNICAPURE AND IT IS RELATED TO VIDEOGRAPHY SKILLS.IN THIS PARTICIPANTS (2 IN A GROUP) WILL BE CAPTURING SOME MAGNIFICIENT SCENES FROM AND AROUND THE CAMUPUS TO HIGHLIGHT THEIR IDEAS AND THEME GIVEN.\n" +
                                "\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1:WORDSWORTH\n" +
                                "THEME: TO TEST THE VOCABULARY OF PARTICIPANT.\n" +
                                "DESCRIPTION: IN THIS ROUND PARTICIPANTS WILL BE GIVEN A WORD ON THE PROJECTOR AND THEY HAVE TO MAKE SMALLER WORDS OUT OF IT.THE MINIMUM NUMBER OF SMALL WORDS POSSIBLE FROM THE BIG WORD WOULD BE DETERMINED BY THE COORDINATORS AND BASED ON THE DIFFICULTY OF WORD A MINIMUM CRITERA FOR EACH WORD WOULD BE SET.PARTICIPANT WHO CLEARS THE MINIMUM CUTOFF WOULD GO TO NEXT ROUND. EXAMPLE- \n" +
                                "WORD IS “ DEMATERIALIZATIONS”\n" +
                                "SMALL WORDS CAN BE -→\n" +
                                "1.LIZARD 2.RATION 3.LATE 4.MATERIAL 5.RAT 6.EAT 7.ATE 8.AIR 9.LIER 10.DARE ETC.\n" +
                                "\n" +
                                "Round 2:Chase the Maze\n" +
                                "The word given in First round has to be broken down into four Words(need not make any sense) and these four words have to be used as directions to direct the participant throughout a Maze set up.And at the end of the maze Four boxes with different genres are put up.The participant has to pick up his genre for round 3.\n" +
                                "Example:Dematerialisation can be broken into Demat,Eria,Lisa,Tion which can be used as Left,right,up and down.Maze leads to genres like Action,Romantic,Sad,Punch Dialogues.\n" +
                                "\n" +
                                "Round 3:DUB IT!\n" +
                                "THEME: THIS IS A DUBSMASH ROUND AND IT WILL TEST DUBSMASHING SKILLS OF PARTICIPANT.\n" +
                                "DESCRIPTION: THIS IS A FUN ROUND TO CREATE DUBSMASHES.IT CAN BE ANY SONG,CLIP ,DIALOGUE IN ANY LANGUAGE DEPENDING ENTIRELY ON PATICIPANT’S CHOICE.IT IS HIS/HER CREATIVE SKILLS THAT IS GOING TO WORK OUT FOR THE ROUND.IT CAN BE OF 1-2 MINS AND TWO DIFFERENT CLIPS CAN BE JOINED TO CREATE SOMETHING MEANINGFUL.THE BEST WORK WOULD BE SELECTED FOR NEXT ROUND.\n" +
                                "EXAMPLE: MAKE ANY DUB.\n" +
                                "\n" +
                                "Round 4: UNI CAPTURE ! AROUND THE CAMPUS IN 150 SECS....\n" +
                                "THEME: THIS IS THE FINAL ROUND AND IT WOULD BE CHECKING THE CREATIVITY OF THE PARTICIPANTS IN VIDEOGRAPHY.\n" +
                                "DESCRIPTION: IN THIS FINAL ROUND THE GROUPS FORMED WILL BE GIVEN A THEME BY THE JUDGES. THEY WOULD BE GIVEN 120 MINUTES TO GO AROUND THE CAMPUS (INCLUDING MAIN CAMPUS) AND TAKE THE CLIPS TO DEMONSTRATE THEIR THEME PERFECTLY AND DO THE REQUIRED EDITING BEFORE PRESENTATION.ALSO THEY HAVE TO SPEAK FOR A MINUTE WHILE PRESENTING THEIR IDEA TO THE JUDGES.THE APPS THAT WOULD BE USED FOR EDITING WILL BE CHOSEN BY EVENT COORDINATORS EARLIER AND PARTICIPANTS WOULD BE TAUGHT TO WORK WITH IT IF NEEDED. THE BEST VIDEO DEMONSTRATING THE THEME CLEARLY AND PRECISELY WOULD BE CHOSEN.\n" +
                                "EXAMPLE: MAKE ANY VIDEO.\n" +
                                "\n" +
                                "Rules:\n" +
                                "1.Taking help from any external source or non-particpant will result in immediate disqualification.\n" +
                                "2.Team will have no access to cellphone.\n" +
                                "3.Common Registration is compulsory for participation.\n" +
                                "4.Decision of Event Coordinators and Judges is final.\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "Coordinators:Bhavya Agarwal: +91 75501 67245\n" +
                                "Prakhar: +91 78453 40256\n" +
                                "Shruti Shahi: +91 73760 94680\n" +
                                "Sri Supraja:+91 97909 54153");
                        view.getContext().startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(view.getContext(), test_activity.class);
                        intent2.putExtra("pic",R.drawable.locationdecrypted);
                        intent2.putExtra("data","Description:\n" +
                                "This event not only entertain the participants , but also they will be acknowledged with this Encryption-Decryption as this technique is mostly used now-a-days for data security. In this event we are giving some riddles and images to the participants and they have to solve them by using some digital techniques (i.e. software) and in final they have to make an animation video based on the information that what they have collected previously. \n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1:THE SPOTTER\n" +
                                "In this round, participants have to guess the place they are shown using a photo with the help of clues.\n" +
                                "\n" +
                                "Round 2:DIG DEEP: \n" +
                                "In this round the participant has to solve the riddle and find out that the given image is encrypted. Then had to decrypt the image. \n" +
                                "\n" +
                                "Round 3:EPICENTER\n" +
                                "In this round, the participant had to open the website name, which was hidden behind the photo in first round. The website then tells you to go to another folder, which has the grids of a single photo. Rearrange all the grids of the image.\n" +
                                "Round 4:ANIMATED SCREEN\n" +
                                "In this the participant has to go to the place which was in the picture showing in round 2. After going to that place some data will be provided to all contestants indirectly (i.e. in the form of chits etc.) containing a theme on which they have to make an animation video.\n" +
                                "\n" +
                                "Rules:\n" +
                                "1.Team will have no access to cellphones\n" +
                                "2.Taking help of any kind will result in immediate disqualification\n" +
                                "3.Aaruush 17 common registration is compulsory\n" +
                                "\n" +
                                "4.Decision of event coordinators and judges will be final.\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Akshat Agarwal : +91 9952914937 \n" +
                                "Barath K : +91 8686144788\n" +
                                "Gouse Basha : +91 9492076949\n" +
                                "Manasa Kumar : +91 9176095131");
                        view.getContext().startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(view.getContext(), test_activity.class);
                        intent3.putExtra("pic", R.drawable.madadzzz);
                        intent3.putExtra("data","Description:\n" +
                                "The first round is quiz and tagline competiton followed by second round in which name, logo and tagline is to be designed for a particular product given. The third round is to make a video on the product given.\n" +
                                "\n" +
                                "Rounds:\n" +
                                "\n" +
                                "Round 1:LOGO BUZZ\n" +
                                "The participants will have to give a logo and tagline quiz. Participants that are able to answer all of them will qualify for the next round. \n" +
                                "\n" +
                                "Round 2:BRANDALISM: \n" +
                                "The participants will be provided with a product, they have to design the logo, name and a catchy tagline.\n" +
                                "\n" +
                                "Round 3:REEL RUN\n" +
                                "“If you can’t tell anything, you can’t sell anything”. This round is about designing an advertisement of the product. Twist is the advertisement will be mute and will be set of photographs that should focus on marketing a thing however a team can use audio mixing and adding dialogues thus giving life to it. The reason for keeping mute video is that the things which are silent are actually violent.\n" +
                                "Round 4:XYZ\n" +
                                "Shoot an advertisement for your product.Looks like round 3 right??We have a small twist for you.Here you act anmd shoot the video unlike round 3 where you make an Add video on a software.\n" +
                                "\n" +
                                "Rules:\n" +
                                "1.Team will have no access to cellphones\n" +
                                "2.Taking help of any kind will result in immediate disqualification\n" +
                                "3.Aaruush 17 common registration is compulsory\n" +
                                "\n" +
                                "4.Decision of event coordinators and judges will be final.\n" +
                                "5. Access to internet is strictly prohibited in Round1.Anyone Found accessing the Internet will be disqualified immediately.\n" +
                                "\n" +
                                "Coordinators:\n" +
                                "Neha Dabeeru : +91 7550074473\n" +
                                "Varun Tiwari : +91 9176232235\n" +
                                "Arun : +91 9952774176");
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