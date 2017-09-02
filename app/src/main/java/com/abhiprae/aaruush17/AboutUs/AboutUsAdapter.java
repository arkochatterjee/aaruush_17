package com.abhiprae.aaruush17.AboutUs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class AboutUsAdapter extends FragmentPagerAdapter {
    private String tabTitles[] = new String[]{"SRM University", "Legacy", "Tagline", "Theme", "Timeline"};

    public AboutUsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AboutSrmFragment();
            case 1:
                return new AboutLegacyFragment();
            case 2:
                return new AboutTaglineFragment();
            case 3:
                return new AboutThemeFragment();
            case 4:
                return new AboutTimlineFragment();
            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}