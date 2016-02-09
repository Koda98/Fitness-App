package com.example.csastudent2015.fitnessapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by csastudent2015 on 1/20/16.
 */
public class CardioWorkoutFragment extends Fragment {
    private static final String TAG = "CardioWorkoutFragment";

    private EditText mName;
    private EditText mTime;
    private EditText mDate;
    private EditText mEffort;
    private EditText mComments;
    private EditText mDistance;
    private Context mAppContext;
    private RatingBar mRatingBar;
    private Button mTimeButton;
    private Button mDateButton;
    public DialogFragment datePicker = new DatePickerFragment();
    public DialogFragment timePicker = new TimePickerFragment();
    private String date;
    private FragmentActivity myContext;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView =inflater.inflate(R.layout.fragment_cardio_workout, container, false);

        getActivity().setTitle("Cardio Workout");


        mName = (EditText)rootView.findViewById(R.id.enter_name);
        mTime = (EditText)rootView.findViewById(R.id.enter_time);
        mDate = (EditText)rootView.findViewById(R.id.enter_date);
        mEffort = (EditText)rootView.findViewById(R.id.enter_effort);
        mComments= (EditText)rootView.findViewById(R.id.enter_comments);
        mDistance = (EditText) rootView.findViewById(R.id.enter_distance);
        mRatingBar = (RatingBar) rootView.findViewById(R.id.enter_rating);

        mTimeButton = (Button) rootView.findViewById(R.id.time_button);
        mDateButton = (Button) rootView.findViewById(R.id.date_button);

        mTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "time clicked");
                FragmentManager fragManager = myContext.getSupportFragmentManager();
                timePicker.show(fragManager, "timePicker");
            }
        });

        mDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "date clicked");
                FragmentManager fragManager = myContext.getSupportFragmentManager();
                datePicker.show(fragManager, "datePicker");
            }
        });


        return rootView;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mAppContext = this.getActivity();
        Log.d(TAG, "Context: " + mAppContext);
    }

    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }

    public void onPause(){
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG, "onSavedInstanceState got called");
        savedInstanceState.putString("AND HIS NAME IS JOHN CENA", "DEEZ NUTS");
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG, "fragment started");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG, "fragment resumed");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG, "fragment stopped");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "fragment destroyed");
    }
}
