package com.abhiprae.aaruush17;

import android.app.Activity;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.gson.Gson;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import Model.Session;
import Model.Stock;
import Model.User;

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class GameLoading extends AppCompatActivity {

    protected OnBackPressedListener onBackPressedListener;
    User user = new User();
    FragmentTransaction fragmentTransaction;

    private static String convertInputStreamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        String result = "";
        while ((line = bufferedReader.readLine()) != null)
            result += line;

        inputStream.close();
        return result;

    }

    /**
     * *************************************SERVER**************************************************
     */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_loading);
        user.setName("Sending");
        user.setEmail(Session.getUser().getEmail());
        if (!isConnected()) {
            Toast.makeText(getBaseContext(), "Problem connecting to Internet", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else {
            new GameLoading.HttpAsyncTask().execute("http://aakashresearchlabs.org/aaruush/getDetails.php");
        }
    }

    /**
     * It returns true if network connectivity is available.
     */
    public boolean isConnected() {
        ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Activity.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }

    public String POST(String url) {

        InputStream inputStream = null;
        String result = "";
        String jsonData = "";
        try {
            // 1. create HttpClient
            HttpClient httpclient = new DefaultHttpClient();
            // 2. make POST request to the given URL
            HttpPost httpPost = new HttpPost(url);
            //3. Create data Object

            //4. Prepare Json object
            Gson gson = new Gson();
            jsonData = gson.toJson(user, User.class);
            Log.d("Login", jsonData);

            // 5. set json to StringEntity
            StringEntity se = new StringEntity(jsonData);

            // 6. set httpPost Entity
            httpPost.setEntity(se);

            // 7. Set some headers to inform server about the type of the content
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");

            // 8. Execute POST request to the given URL
            HttpResponse httpResponse = httpclient.execute(httpPost);

            // 9. receive response as inputStream
            inputStream = httpResponse.getEntity().getContent();

            // 10. convert inputstream to string
            if (inputStream != null)
                result = convertInputStreamToString(inputStream);
            else
                result = "failed";

        } catch (Exception e) {
            e.printStackTrace();
        }

        Log.d("Result", result);
        return result;
    }


    private class HttpAsyncTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... urls) {
            return POST(urls[0]);
        }

        // onPostExecute displays the results of the AsyncTask.
        @Override
        protected void onPostExecute(String result) {
            if (result.equalsIgnoreCase("failed")) {
                Toast.makeText(getBaseContext(), "Problem in Connecting, Try Again!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(GameLoading.this, MainActivity.class);
                startActivity(intent);
            } else {
                Gson g = new Gson();
                String temp = result.substring(0, result.indexOf("t01"));
                Session.setStocks(g.fromJson(temp, Stock[].class));
                temp = result.substring(result.indexOf("t01") + 3, result.indexOf("t02"));
                Session.setLeaderboard(g.fromJson(temp, User[].class));
                temp = result.substring(result.indexOf("t02") + 3);
                Session.setBought(g.fromJson(temp, Stock[].class));
                double a = 0.0;
                for (int i = 0; i < Session.getBought().length; i++) {
                    a = a + Session.getBought()[i].getPrice();
                }
                Session.getUser().setAsset(a);
                ProgressBar progressBar = (ProgressBar) findViewById(R.id.pb);
                progressBar.setVisibility(View.GONE);
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new Game_Home());
                fragmentTransaction.commit();
            }
        }
    }

    public void setOnBackPressedListener(OnBackPressedListener onBackPressedListener) {
        this.onBackPressedListener = onBackPressedListener;
    }

    @Override
    public void onBackPressed() {
        if (onBackPressedListener != null)
            onBackPressedListener.doBack();
    }
}
