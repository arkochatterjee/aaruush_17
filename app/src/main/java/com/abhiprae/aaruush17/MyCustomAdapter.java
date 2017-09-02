package com.abhiprae.aaruush17;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import Model.SellBuyStock;
import Model.Session;

/**
 * Created by Abhiprae on 7/22/2017.
 */

public class MyCustomAdapter extends BaseExpandableListAdapter {

    Context context = null;
    String name[];
    int price[];
    int x;
    ProgressDialog pd;
    int index;
    SellBuyStock send;

    public MyCustomAdapter(Context context, int x, String name[], int price[]) {
        this.context = context;
        this.name = name;
        this.price = price;
        this.x = x;
    }

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
    public int getGroupCount() {
        return name.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return 1;
    }

    @Override
    public String getGroup(int groupPosition) {
        return name[groupPosition];
    }

    @Override
    public String getChild(int groupPosition, int childPosition) {
        return "" + price[childPosition];
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }
        TextView title = (TextView) convertView.findViewById(R.id.name);
        title.setText(name[groupPosition]);
        return convertView;
    }

    @Override
    public View getChildView(final int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        if (!name[groupPosition].equals("")) {
            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.stocks, parent, false);
            }
            TextView message = (TextView)convertView.findViewById(R.id.message);
            message.setText(price[groupPosition]+"");
            Button buy_sell = (Button) convertView.findViewById(R.id.buy_sell);
            if (x == 0) {
                buy_sell.setText("Sell");
            } else {
                buy_sell.setText("Buy");
            }
            send = new SellBuyStock();
            buy_sell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (x == 0) {
                        if (!isConnected()) {
                            Toast.makeText(context, "No Internet..", Toast.LENGTH_SHORT).show();
                        } else {
                            pd = new ProgressDialog(context);
                            pd.setMessage("Please Wait...");
                            pd.setTitle("Selling Stock...");
                            pd.setCancelable(false);
                            pd.show();
                            send.setEmail(Session.getUser().getEmail());
                            send.setStock_name(name[groupPosition]);
                            send.setPrice(price[groupPosition]);
                            index = groupPosition;
                            new HttpAsyncTask().execute("http://aakashresearchlabs.org/aaruush/sell_stock.php");
                        }
                    } else {
                        if (!isConnected()) {
                            Toast.makeText(context, "No Internet..", Toast.LENGTH_SHORT).show();
                        } else {
                            pd = new ProgressDialog(context);
                            pd.setMessage("Please Wait...");
                            pd.setTitle("Buying Stock...");
                            pd.setCancelable(false);
                            pd.show();
                            if(Session.getUser().getBalance()<price[groupPosition]){
                                Toast.makeText(context,"You don't have sufficient balance !",Toast.LENGTH_SHORT).show();
                                pd.dismiss();
                            }
                            else{
                                send.setEmail(Session.getUser().getEmail());
                                send.setStock_name(name[groupPosition]);
                                send.setPrice((double) price[groupPosition]);
                                index = groupPosition;
                                Log.d("Price-----", send.getPrice() + "");
                                new HttpAsyncTask().execute("http://aakashresearchlabs.org/aaruush/buy_stock.php");
                            }
                        }
                    }
                }
            });
            return convertView;
        } else {
            return null;
        }
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

    /**
     * It returns true if network connectivity is available.
     */
    public boolean isConnected() {
        ConnectivityManager connMgr = (ConnectivityManager) context.getSystemService(Activity.CONNECTIVITY_SERVICE);
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
            jsonData = gson.toJson(send, SellBuyStock.class);
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
            if (result.contains("failed")) {
                Toast.makeText(context, "Error in selling, Try Again!", Toast.LENGTH_SHORT).show();
                pd.dismiss();
            } else {
                Log.d("result:----", result);
                if (x == 0) {
                    Session.getUser().setBalance(Session.getUser().getBalance() + price[index]);
                    Toast.makeText(context, "Stock Sold !", Toast.LENGTH_SHORT).show();
                } else {
                    Session.getUser().setBalance(Session.getUser().getBalance() - price[index]);
                    Toast.makeText(context, "Stock Bought !", Toast.LENGTH_SHORT).show();
                }
                pd.dismiss();
                Intent intent = new Intent(context, GameLoading.class);
                context.startActivity(intent);
            }
        }
    }
}
