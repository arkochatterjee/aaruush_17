package com.abhiprae.aaruush17;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;

/**
 * Created by Abhiprae on 8/16/2017.
 */

public class BaseBackPressedListener implements OnBackPressedListener {

    private final FragmentActivity activity;

    public BaseBackPressedListener(FragmentActivity activity) {
        this.activity = activity;
    }

    @Override
    public void doBack() {
        Intent intent = new Intent(activity.getBaseContext(), MainActivity.class);
        activity.startActivity(intent);
        //activity.getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }

}
