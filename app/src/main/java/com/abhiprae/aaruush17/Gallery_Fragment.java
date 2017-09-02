package com.abhiprae.aaruush17;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Arko Chatterjee on 01-08-2017.
 */

public class Gallery_Fragment extends Fragment {

    public static final String TAG = "TimeLineActivity";

    private static final String baseURl = "https://facebook.com";

    private static final String widgetInfo = "<a class=\"twitter-timeline\" href=\"https://twitter.com/Aaruush_Srmuniv\">Tweets by Aaruush_Srmuniv</a> <script async src=\"//platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>";

    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.activity_twitter_view, container, false);
        load_background_color();
        ((MainActivity) getActivity()).setOnBackPressedListener(new BaseBackPressedListener(getActivity()));
        WebView webView = (WebView) v.findViewById(R.id.webview);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.facebook.com/pg/aaruush.srm/photos/?ref=page_internal");


        return v;
    }

    private void load_background_color() {
        WebView webView = (WebView) v.findViewById(R.id.webview);
        //webView.setBackgroundColor(getResources().getColor(R.color.twitter_dark));
        webView.setBackgroundColor(0); // transparent
    }


}
