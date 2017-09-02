package com.abhiprae.aaruush17;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class Contactus extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.activity_contactus, container, false);
        ((MainActivity) getActivity()).setOnBackPressedListener(new BaseBackPressedListener(getActivity()));
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference("Query");

        final EditText phone = (EditText) v.findViewById(R.id.et_mobile);
        final EditText query = (EditText) v.findViewById(R.id.et_query);
        Button submit = (Button) v.findViewById(R.id.btn_submit);





        ImageView fb = (ImageView) v.findViewById(R.id.fb);
        ImageView insta = (ImageView) v.findViewById(R.id.insta);
        ImageView tw = (ImageView) v.findViewById(R.id.tw);
        ImageView yt = (ImageView) v.findViewById(R.id.yt);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone_no = phone.getText().toString();
                String query_txt = query.getText().toString();

                HashMap<String,String> data = new HashMap<String, String>();
                data.put("Phone No",phone_no);
                data.put("Query",query_txt);
                myRef.setValue(data).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(getContext(), "Data Updated Succesfully", Toast.LENGTH_LONG).show();
                        }
                        else {
                            Toast.makeText(getContext(), "Data Update Failed", Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });
        //ImageView img = (ImageView)findViewById(R.id.foo_bar);
        fb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                //intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.facebook.com/aaruush.srm"));
                startActivity(intent);
            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                //intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/aaruush_srm/"));
                startActivity(intent);
            }
        });
        tw.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                //intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://twitter.com/Aaruush_Srmuniv"));
                startActivity(intent);
            }
        });

        yt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                //intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/user/aaruush12"));
                startActivity(intent);
            }
        });

        return v;
    }

}