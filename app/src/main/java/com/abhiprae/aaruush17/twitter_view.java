package com.abhiprae.aaruush17;

/**
 * Created by Abhiprae on 7/22/2017.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class twitter_view extends Fragment {

    public static final String TAG = "TimeLineActivity";

    private static final String baseURl = "https://twitter.com";

    private static final String widgetInfo = "<a class=\"twitter-timeline\" href=\"https://twitter.com/Aaruush_Srmuniv\">Please check your internet connection..</a> <script async src=\"//platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";

    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.activity_twitter_view, container, false);
        load_background_color();

        WebView webView = (WebView) v.findViewById(R.id.webview);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadDataWithBaseURL(baseURl, widgetInfo, "text/html", "UTF-8", null);


        return v;
    }

    private void load_background_color() {
        WebView webView = (WebView) v.findViewById(R.id.webview);
        //webView.setBackgroundColor(getResources().getColor(R.color.twitter_dark));
        webView.setBackgroundColor(0); // transparent
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return true;
    }
}

