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

public class RegisterActivity extends AppCompatActivity {

    public static final String MYPREF = "AARUUSH";
    User user;
    EditText fname, lname, email, phone, password;
    SharedPreferences pref;
    Context context;
    ProgressDialog pd;

    private static String convertInputStreamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        String result = "";
        while ((line = bufferedReader.readLine()) != null)
            result += line;

        inputStream.close();
        return result;

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);
        context = this;
        fname = (EditText) findViewById(R.id.et_firstname);
        lname = (EditText) findViewById(R.id.et_lastname);
        email = (EditText) findViewById(R.id.et_email);
        phone = (EditText) findViewById(R.id.et_phone);
        password = (EditText) findViewById(R.id.et_password);
        user = new User();
        pref = getSharedPreferences(MYPREF, MODE_PRIVATE);
    }

    /**
     * *************************************SERVER**************************************************
     */

    public void onSignUp(View view) {
        user.setName(fname.getText().toString() + " " + lname.getText().toString());
        user.setEmail(email.getText().toString());
        user.setPhone(phone.getText().toString());
        user.setBalance(12000.0);
        user.setPassword(password.getText().toString());
        if (user.getName().equals("") || user.getEmail().equals("") || user.getPassword().equals("") || user.getPhone().equals("")) {
            Toast.makeText(getApplication(), "Fill All the fields", Toast.LENGTH_SHORT).show();
        } else {
            pd = new ProgressDialog(context);
            pd.setMessage("Please Wait...");
            pd.setTitle("Registering...");
            pd.setCancelable(false);
            pd.show();
            if (!isConnected()) {
                pd.dismiss();
                Toast.makeText(getBaseContext(), "Problem Connecting to Server", Toast.LENGTH_SHORT).show();
            } else {
                new RegisterActivity.HttpAsyncTask().execute("http://aakashresearchlabs.org/aaruush/register.php");
            }
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
                result = "Failed";

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
                Toast.makeText(getBaseContext(), "Problem in Registering, Try Again!", Toast.LENGTH_SHORT).show();
                pd.dismiss();
            } else {
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("first_run", "no");
                editor.commit();
                Session.setUser(user);
                pd.dismiss();
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        }
    }
}
