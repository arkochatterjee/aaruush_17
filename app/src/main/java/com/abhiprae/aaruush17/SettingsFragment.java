package com.abhiprae.aaruush17;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import static android.content.Context.MODE_PRIVATE;
import static com.abhiprae.aaruush17.LoginActivity.Name;
import static com.abhiprae.aaruush17.LoginActivity.Password;
import static com.abhiprae.aaruush17.LoginActivity.mypreference;

//import com.theartofdev.edmodo.cropper.CropImage;
//import com.theartofdev.edmodo.cropper.CropImageView;

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class SettingsFragment extends Fragment {
    public final String MYPREF = "AARUUSH";
    SharedPreferences pref;

    public SettingsFragment() {
        // Required empty public constructor
    }

    private void sendtostart() {
        Intent startintent = new Intent(getActivity(), LoginActivity.class);
        startActivity(startintent);
        getActivity().finish();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        ((MainActivity) getActivity()).setOnBackPressedListener(new BaseBackPressedListener(getActivity()));
        LinearLayout editNameLayout, editPicLayout, logOutLayout;
        //  editNameLayout = (LinearLayout) view.findViewById(R.id.editName);
        //editPicLayout = (LinearLayout) view.findViewById(R.id.editPic);
        logOutLayout = (LinearLayout) view.findViewById(R.id.logOut);

        /*editNameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(getContext());
                LayoutInflater inflater = getActivity().getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.edit_name_dialog, null);
                dialogBuilder.setView(dialogView);

                final EditText edt1 = (EditText) dialogView.findViewById(R.id.edit1);
                final EditText edt2 = (EditText) dialogView.findViewById(R.id.edit2);

                dialogBuilder.setTitle("Edit Username");
                dialogBuilder.setCancelable(false);
                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //do something with edt.getText().toString();
                    }
                });
                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });
                AlertDialog b = dialogBuilder.create();
                b.show();            }
        });*/
        logOutLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pref = getActivity().getSharedPreferences(MYPREF, MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("first_run", "yes");
                editor.apply();
                sendtostart();
            }
        });
        /*editPicLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CropImage.activity()
                        .setGuidelines(CropImageView.Guidelines.ON)
                        .setAspectRatio(1, 1)
                        .start(getActivity());
            }
        });*/
        return view;
    }
}