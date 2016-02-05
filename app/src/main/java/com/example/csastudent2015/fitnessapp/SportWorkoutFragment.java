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

    private EditText mName;
    private EditText mTime;
    private EditText mDate;
    private EditText mEffort;
    private EditText mComments;
    private Context mAppContext;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sport_workout, container, false);

        getActivity().setTitle("Sport Workout");

        mName = (EditText)rootView.findViewById(R.id.sport_name);
        mTime = (EditText)rootView.findViewById(R.id.sport_time);
        mDate = (EditText)rootView.findViewById(R.id.sport_date);
        mEffort = (EditText)rootView.findViewById(R.id.sport_effort);
        mComments= (EditText)rootView.findViewById(R.id.sport_comments);

        TimePickerFragment tp = new TimePickerFragment();



        return rootView;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAppContext = this.getActivity();
        Log.d(TAG, "Context: " + mAppContext);



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
