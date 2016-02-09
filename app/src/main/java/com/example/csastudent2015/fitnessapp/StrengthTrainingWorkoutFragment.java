package com.example.csastudent2015.fitnessapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by csastudent2015 on 1/20/16.
 */
public class StrengthTrainingWorkoutFragment extends Fragment {
    private static final String TAG = "STWFragment";

    private Context mAppContext;
    /*private EditText mName;
    private EditText mWeight;
    private EditText mNumReps;
    private EditText mTime;
    private EditText mDate;
    private RatingBar mRating;
    private String test;

    private EditText mComments;*/

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_strength_training_workout, container, false);

        getActivity().setTitle("User");
/*
        mName = (EditText)rootView.findViewById(R.id.type_of_workout);
        mWeight = (EditText)rootView.findViewById(R.id.weight_used);
        mNumReps= (EditText) rootView.findViewById(R.id.num_of_reps);
        mTime = (EditText)rootView.findViewById(R.id.training_time);
        mDate = (EditText)rootView.findViewById(R.id.date);
        mRating = (RatingBar)rootView.findViewById(R.id.ratingBar);
        test =  toString(mRating.getRating());

        mComments= (EditText)rootView.findViewById(R.id.additional_comments);
*/
        return rootView;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mAppContext = this.getActivity();
        Log.d(TAG, "Context: "+ mAppContext);
    }

    public void onPause(){
        super.onPause();
    }

    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG, "onSavedInstanceState got called");
        savedInstanceState.putString("What is a key", "Is this the string I want to put");
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG,"Fragment started");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG, "Fagment Resumed");
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
