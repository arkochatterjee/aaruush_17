package com.abhiprae.aaruush17.Domain_Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.abhiprae.aaruush17.R;
import com.abhiprae.aaruush17.highlights_kenny;
import com.abhiprae.aaruush17.test_activity;

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class MyAdapterHighlights extends RecyclerView.Adapter<MyAdapterHighlights.MyViewHolder> {
    public Context mContext;
    private String[] mDataset;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapterHighlights(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapterHighlights.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                               int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyAdapterHighlights.MyViewHolder vh = new MyAdapterHighlights.MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyAdapterHighlights.MyViewHolder holder, final int position) {
        holder.mTextView.setText(mDataset[position]);
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = mDataset[position];
                Log.d("CardView", "CardView Clicked: " + currentValue);
                // Toast toast = Toast.makeText(
                //getActivity(),"Custom Toast From Fragment",Toast.LENGTH_LONG
                //  view.getContext(), "Clicked on " + currentValue, Toast.LENGTH_LONG);
                // toast.show();
                switch (position) {
                    case 0:

                        //Intent intent = new Intent(view.getContext(), test_activity.class);

                        // view.getContext().startActivity(intent);

                        Intent intent = new Intent(view.getContext(), highlights_kenny.class);
                        intent.putExtra("pic", R.drawable.harshguestlecture);
                        intent.putExtra("data","Mr. Harsh Songra has developed My Child—a free mobile app that could help parents monitor the growth of a child to screen potential neurological, physical and speech disorders. Launched in January 2015, the app has been downloaded more than 8,000 times across 100 countries.\n" +
                                "Songra has received seed funding from investors like Pankaj Jain, a partner in Silicon Valley-based venture capital fund 500 Startups, and Pallav Nadhani, co-founder of FusionCharts and a member of the first Forbes India 30 under 30 List. Songra has garnered global support and praise, with a mention on Facebook COO Sheryl Sandberg’s blog last year. He has also received technical support and mentorship from Facebook’s FBStart programme.");
                        view.getContext().startActivity(intent);
                        break;

                    case 1:

                        //Intent intent = new Intent(view.getContext(), test_activity.class);

                        // view.getContext().startActivity(intent);

                        Intent intent3 = new Intent(view.getContext(), highlights_kenny.class);
                        intent3.putExtra("pic", R.drawable.suneetguestecture);
                        intent3.putExtra("data","Suneet Tuli graduated from Toronto University in 1990 in Applied Sciences in Engineering. He is the co-founder of DataWind. His first technological venture had the objective of developing sales of large size fax machines. In his second innovative venture, he started creating battery operated handheld printers and hand held scanners. Tuli has been recognised by Forbes Magazine in its 2012 and recently by Ban ki Moon Secretary General of United Nations, while launching his product Aakash 2 tablets");
                        view.getContext().startActivity(intent3);
                        break;
                    case 2:

                        //Intent intent = new Intent(view.getContext(), test_activity.class);

                        // view.getContext().startActivity(intent);

                        Intent intent1 = new Intent(view.getContext(), highlights_kenny.class);
                        intent1.putExtra("pic", R.drawable.miraguestlecture);
                        intent1.putExtra("data","Mira Erda, who began her journey as one of the youngest in national karting, had been competing in LGB Formula 4 till last year. She proved herself by winning the Formula 4 Rookie Champion of the Year during the annual FMSCI awards.By signing up at just 17 for JK Euro, which features the BMW FB02 car, she will be among the youngest Indian drivers to race at this level. Interestingly, Mira who is preparing for her Twelfth Class boards, will have a packed season as she plans to not only race in the National Championship but also in national rallies and international karting competitions.");
                        view.getContext().startActivity(intent1);
                        break;
                    case 3:

                        //Intent intent = new Intent(view.getContext(), test_activity.class);

                        // view.getContext().startActivity(intent);

                        Intent intent2 = new Intent(view.getContext(), highlights_kenny.class);
                        intent2.putExtra("pic", R.drawable.arjunguestlecturefinal);
                        intent2.putExtra("data","Arjun Vajpai is the third-youngest Indian to climb Mount Everest. He achieved this feat at an age of 16 years, 11 months and 18 days.On 20 May 2011, he became the youngest climber ever to summit Lhotse, aged 17.Arjun also became the youngest to summit Manaslu on 4 October 2011. \n" +
                                "He did his schooling from Ryan International School, Noida.Since childhood he was fascinated with trekking and mountaineering . He has underwent training in the Nehru Institute of Mountaineering for 2 years.\n");
                        view.getContext().startActivity(intent2);
                        break;

                    case 4:

                        //Intent intent = new Intent(view.getContext(), test_activity.class);

                        // view.getContext().startActivity(intent);

                        Intent intent4 = new Intent(view.getContext(), highlights_kenny.class);
                        intent4.putExtra("pic", R.drawable.benildguestlecture);
                        intent4.putExtra("data","Benild Joseph is a 25 year old Limca Book Record Holder and renowned White Hat Hacker with definitive experience in the field of computer security in India. Microsoft Social Forum and Silicon India Magazine have also listed him among the Top 10 Ethical Hackers in India. Benild is working with various corporate companies, law enforcement agencies and government organizations. He is a regular speaker at Information security & digital forensics conferences in India and abroad. He has also worked on various security projects at Cyber Crime Investigation Bureau (CCIB), International Cyber Threat Task Force (CTTF) and Cyber Security Forum Initiative (CSFI ). He is the co-author of “CCI” a book written for law enforcement agencies in India. His research interests include Internet Security, Data Forensic, Virtualization and Mobile Security. He has been interviewed by Various Newspapers and TV Channels where he has shared his experiences relating to cyber attacks, latest vulnerabilities and cyber crimes.\n");
                        view.getContext().startActivity(intent4);
                        break;

                }





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

        public MyViewHolder(View v) {
            super(v);
            //mContext = v.getContext();
            mCardView = (CardView) v.findViewById(R.id.card_view);
            mTextView = (TextView) v.findViewById(R.id.card_view_text);
        }
    }
}