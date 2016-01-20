package com.example.csastudent2015.fitnessapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by csastudent2015 on 1/15/16.
 */
public class NewWorkoutFragment {
    private Button mSportButton;
    private Button mSTButton;
    private Button mCardioButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_new_workout, container, false);

        mCardioButton = (Button)rootView.findViewById(R.id.cardio_button);
        mSportButton = (Button)rootView.findViewById(R.id.sport_button);
        mSTButton = (Button)rootView.findViewById(R.id.st_button);

        CardioButtonOnClickListener cardioButtonOnClickListener = new CardioButtonOnClickListener;
        SportButtonOnClickListener sportButtonOnClickListener = new SportButtonOnClickListener;
        STButtonOnClickListener stButtonOnClickListener = new STButtonOnClickListener;
    }
}
