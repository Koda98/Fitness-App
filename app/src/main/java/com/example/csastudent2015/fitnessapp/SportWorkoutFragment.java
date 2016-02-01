package com.example.csastudent2015.fitnessapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by csastudent2015 on 1/20/16.
 */
public class SportWorkoutFragment extends Fragment {
    private static final String TAG = "SportWorkoutFragment";

    private EditText mOldPassword;
    private EditText mNewPassword1;
    private EditText mNewPassword2;
    private Button mBtn;
    private Context mAppContext;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sport_workout, container, false);

        getActivity().setTitle("User");

/*
        mOldPassword = (EditText)rootView.findViewById(R.id.old_password);
        mNewPassword1 = (EditText)rootView.findViewById(R.id.new_password1);
        mNewPassword2 = (EditText)rootView.findViewById(R.id.new_password2);

        mBtn = (Button)rootView.findViewById(R.id.button_change);

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (change()) {
                    Intent intent = new Intent(getActivity(), ApplicantActivity.class);
                    intent.putExtra("password", password);
                    Log.e(TAG, password);
                    intent.putExtra("pass", "true");
                    getActivity().startActivity(intent);
                    Log.e(TAG, password);
                } else {
                    Log.e(TAG, "Wrong username or password");
                    Log.e(TAG, password);
                }
            }
        }); */

        return rootView;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAppContext = this.getActivity();
        Log.d(TAG, "Context: " + mAppContext);

        /*
        mStorer = new UserJSONStorer(mAppContext, FILENAME);
        try { //begin try block, this is needed in case the file specified by FILENAME does not exist
            mUser = mStorer.load(); // get the Profile information from the file
        } catch (Exception e) { //if the file is not found do the following
            mUser = new User();// create a new default Profile
            Log.e(TAG, "Error loading user: " + FILENAME, e); //log message to let us know the profile was not loaded.
        }

        if (savedInstanceState != null) {
            mUser.setPassword(savedInstanceState.getString(KEY_PASSWORD));
            Log.i(TAG, "The password is " + mUser.getPassword());
        }*/
    }


    public void onPause() {
        super.onPause();
        /* if(saveUser()){
            Log.e(TAG,"saved the thing");
        }
        Log.d(TAG, "Fragment paused."); */
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG, "onSaveInstanceState got called and it was a BLAST!!!1: ");
        savedInstanceState.putString("I HVE NO IDEA WHAT THE HELL IS HAPPENING","ASDFasfdgibuaerobg");
    }




    @Override
    public void onStart() {
        super.onStart();

        Log.d(TAG, "Fragment started.");
    }
    @Override
    public void onResume() {
        super.onResume();

        Log.d(TAG, "Fragment resumed.");
    }

    @Override
    public void onStop() {

        super.onStop();
        Log.d(TAG, "Fragment stopped.");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Fragment destroyed.");
    }


}
