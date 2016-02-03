package com.example.csastudent2015.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by csastudent2015 on 1/15/16.
 */
public class NewWorkoutFragment extends Fragment {
    private Button mSportButton;
    private Button mSTButton;
    private Button mCardioButton;
    private static final String TAG = "tag";

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_new_workout, container, false);

        mCardioButton = (Button)rootView.findViewById(R.id.cardio_button);
        mSportButton = (Button)rootView.findViewById(R.id.sport_button);
        mSTButton = (Button)rootView.findViewById(R.id.st_button);




        mSportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "sport clicked");
                Intent intent = new Intent(getActivity(), EditNewWorkoutActivity.class);
                intent.putExtra("workout_name", 0);
                startActivity(intent);


            }
        });

        mCardioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "cardio clicked");
                Intent intent = new Intent(getActivity(), EditNewWorkoutActivity.class);
                intent.putExtra("workout_name", 1);
                /*getActivity().*/startActivity(intent);

            }
        });

        mSTButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "st clicked");
                Intent intent = new Intent(getActivity(), EditNewWorkoutActivity.class);
                intent.putExtra("workout_name", 2);
                startActivity(intent);

            }
        });

        return rootView;


    }

    @Override
    public void onPause(){
        super.onPause();

    }
}
