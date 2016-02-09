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
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainActivity extends ActionBarActivity {
//a test commen
    public static final String TAG = "ActionBarActivity";
    public String value = "poo";
    public Button login;
    public Button createUser;
    public EditText usernameField;
    public EditText passwordField;

    private static final String TAG_DETAILS = "deets";
    private static final String TAG_WORKOUT_ID = "workoutid";
    private static final String TAG_NAME = "name";
    private static final String TAG_USERNAME = "username";

    private ProgressDialog pDialog;
    JSONParser jsonParser = new JSONParser();
    private static String url_create_product = "http://nevernotconfused.com/android_connect/create_user.php";
    private static String url_get_details = "http://nevernotconfused.com/android_connect/get_user_details.php";
    private static final String TAG_SUCCESS = "success";

    ArrayList<HashMap<String, String>> userDetailList;

    private JSONArray userDetails = null;
    //just to change something
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.home_button);
        createUser = (Button) findViewById(R.id.create_new_user_button);
        usernameField = (EditText) findViewById(R.id.username_field);
        passwordField = (EditText) findViewById(R.id.password_field);

        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                new GetUserDetails().execute();
                scootAlong();
            }
        });
        createUser.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new CreateNewProduct().execute();
                scootAlong();
            }

        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void scootAlong(){
        Intent myIntent = new Intent(MainActivity.this, NewWorkoutActivity.class);
        MainActivity.this.startActivity(myIntent);
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
            String name = usernameField.getText().toString();
            String password = passwordField.getText().toString();

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
    /**
     * Background Async Task to Load all product by making HTTP Request
     * */
    class GetUserDetails extends AsyncTask<String, String, String> {

        /**
         * Before starting background thread Show Progress Dialog
         * */
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(MainActivity.this);
            pDialog.setMessage("Loading products. Please wait...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(false);
            pDialog.show();
        }

        /**
         * getting All products from url
         * */
        protected String doInBackground(String... args) {
            String username = "'" + usernameField.getText() + "'";
            String password = "'" + passwordField.getText() + "'";
            // Building Parameters
            List<NameValuePair> params = new ArrayList<>();

            params.add(new BasicNameValuePair("username",username));
            //params.add(new BasicNameValuePair("password", password));
            // getting JSON string from URL
            JSONObject json = jsonParser.makeHttpRequest(url_get_details, "GET", params);
            // Check your log cat for JSON reponse
            Log.e("ffff",json.toString());
            try {
                // Checking for SUCCESS TAG
                int success = json.getInt(TAG_SUCCESS);
                Log.e("",json.get("success").toString());
                if (success == 1) {
                    // products found
                    // Getting Array of Products
                    userDetails = json.getJSONArray(TAG_DETAILS);

                    // looping through All Products
                    for (int i = 0; i < userDetails.length(); i++) {
                        JSONObject c = userDetails.getJSONObject(i);

                        // Storing each json item in variable
                        String id = c.getString(TAG_WORKOUT_ID);
                        String name = c.getString(TAG_NAME);

                        // creating new HashMap
                        HashMap<String, String> map = new HashMap<String, String>();
                        // adding each child node to HashMap key => value
                        map.put(TAG_WORKOUT_ID, id);
                        map.put(TAG_NAME, name);

                        // adding HashList to ArrayList
                        userDetailList.add(map);
                        Log.e("REACHED",userDetailList.get(1).toString());
                    }
                } else {
                    Log.e(TAG, "user not found");
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
            // dismiss the dialog after getting all products
            pDialog.dismiss();
            // updating UI from Background Thread
            runOnUiThread(new Runnable() {
                public void run() {
                    /**
                     * Updating parsed JSON data into ListView
                     * */
                    /*ListAdapter adapter = new SimpleAdapter(
                            MainActivity.this, userDetailList,
                            R.layout.list_item, new String[] { TAG_PID,
                            TAG_NAME},
                            new int[] { R.id.pid, R.id.name });
                    // updating listview
                    setListAdapter(adapter);*/
                    Log.e(TAG,"user found");
                }
            });

        }

    }
}
