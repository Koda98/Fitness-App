package com.example.csastudent2015.fitnessapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {
//a test commen
    public static final String TAG = "ActionBarActivity";
    public String value = "poo";
    public Button moveOn;
    public Button createUser;

    private ProgressDialog pDialog;
    JSONParser jsonParser = new JSONParser();
    private static String url_create_product = "http://nevernotconfused.com/android_connect/create_user.php";
    private static final String TAG_SUCCESS = "success";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moveOn = (Button) findViewById(R.id.home_button);
        /*createUser = (Button) findViewById(R.id.create_user_button);*/

        moveOn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent myIntent = new Intent(MainActivity.this, NewWorkoutActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
        createUser.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new CreateNewProduct().execute();
            }

        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    class CreateNewProduct extends AsyncTask<String, String, String> {

        /**
         * Before starting background thread Show Progress Dialog
         * */
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(MainActivity.this);
            pDialog.setMessage("Creating Product..");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(true);
            pDialog.show();
        }

        /**
         * Creating product
         * */
        protected String doInBackground(String... args) {
            //String name = inputName.getText().toString();
           // String price = inputPrice.getText().toString();
            //String description = inputDesc.getText().toString();
            String name = "AmadorLagunas";
            String password = "zippy";

            // Building Parameters
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("username",name));
            params.add(new BasicNameValuePair("password", password));

            // getting JSON Object
            // Note that create product url accepts POST method
            JSONParser parser = new JSONParser();
            JSONObject json = parser.makeHttpRequest(url_create_product,
                    "POST", params);
            // check log cat fro response
            Log.d("Create Response", json.toString());

            // check for success tag
            try {
                int success = json.getInt(TAG_SUCCESS);

                if (success == 1) {
                    Log.e(TAG,"worked supposedly");
                } else {
                    Log.e(TAG,"failure");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        /**
         * After completing background task Dismiss the progress dialog
         * **/
        protected void onPostExecute(String file_url) {
            // dismiss the dialog once done
            pDialog.dismiss();
        }

    }
}
