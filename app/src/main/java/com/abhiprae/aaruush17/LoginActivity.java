package com.abhiprae.aaruush17;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
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
import Model.User;

/**
 * Created by Abhiprae on 7/21/2017.
 */

public class LoginActivity extends AppCompatActivity {

    public static final String mypreference = "mypref";
    public static final String Name = "nameKey";
    public static final String Email = "emailKey";
    public static final String Password = "passKey";
    public final String MYPREF = "AARUUSH";
    EditText email, password;
    User userS, userR;
    ProgressDialog pd;
    Context context;
    SharedPreferences pref;
    SharedPreferences sharedPreferences;

    private static String convertInputStreamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        String result = "";
        while ((line = bufferedReader.readLine()) != null)
            result += line;

        inputStream.close();
        return result;

    }

    public void Save() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(Name,userR.getName());
        editor.putString(Password, userR.getPassword());
        editor.putString(Email, userR.getEmail());
        editor.putBoolean("session",true);
        editor.apply();
    }

    public void Get() {
        sharedPreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);
        if (sharedPreferences.contains(Email)) {
            email.setText(sharedPreferences.getString(Email, ""));
        }
        if (sharedPreferences.contains(Password)) {
            password.setText(sharedPreferences.getString(Password, ""));
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
        email = (EditText) findViewById(R.id.et_username);
        password = (EditText) findViewById(R.id.et_password);
        Get();
        userS = new User();
        userR = new User();
        context = this;
        pref = getSharedPreferences(MYPREF, MODE_PRIVATE);
    }

    public void onSignIn(View view) {
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("first_run", "no");
        editor.apply();
        pd = new ProgressDialog(context);
        pd.setMessage("Please Wait...");
        pd.setTitle("Signing In...");
        pd.setCancelable(false);
        pd.show();
        userS.setEmail(email.getText().toString());
        userS.setPassword(password.getText().toString());
        if (!isConnected()) {
            pd.dismiss();
            Toast.makeText(getBaseContext(), "Invalid Username or Password", Toast.LENGTH_SHORT).show();
        } else {
            new LoginActivity.HttpAsyncTask().execute("http://aakashresearchlabs.org/aaruush/login.php");
        }
    }

    /*
     **************************************SERVER**************************************************
     */

    public void onSignUp(View view) {
        Intent intent = new Intent(context, RegisterActivity.class);
        startActivity(intent);
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
            jsonData = gson.toJson(userS, User.class);
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

    public class HttpAsyncTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... urls) {
            return POST(urls[0]);
        }

        // onPostExecute displays the results of the AsyncTask.
        @Override
        protected void onPostExecute(String result) {
            if (result.contains("failed")) {
                Toast.makeText(getBaseContext(), "Problem in Logging, Try Again!", Toast.LENGTH_SHORT).show();
                    pd.dismiss();
            } else {
                Log.d("result:----", result);
                Gson g = new Gson();
                userR = g.fromJson(result.substring(0, result.indexOf("}") + 1), User.class);
                if (!userR.getName().equals("")) {
                    SharedPreferences.Editor editor = pref.edit();
                    editor.putString("first_run", "no");
                    editor.apply();
                    Save();
                    Session.setUser(userR);
                    Log.d("-------", Session.getUser().getName());
                        pd.dismiss();
                    Intent intent = new Intent(context, MainActivity.class);
                    startActivity(intent);
                } else {
                        pd.dismiss();
                    Toast.makeText(getBaseContext(), "Server Error, Try Again !", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}