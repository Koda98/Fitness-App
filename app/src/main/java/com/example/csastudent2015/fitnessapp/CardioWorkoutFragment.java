package com.example.csastudent2015.fitnessapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by csastudent2015 on 1/20/16.
 */
public class CardioWorkoutFragment extends Fragment {
    private static final String TAG = "CardioWorkoutFragment";

    private Context mAppContext;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView =inflater.inflate(R.layout.fragment_cardio_workout, container, false);

        getActivity().setTitle("User");

        return rootView;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mAppContext = this.getActivity();
        Log.d(TAG, "Context: " + mAppContext);
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
