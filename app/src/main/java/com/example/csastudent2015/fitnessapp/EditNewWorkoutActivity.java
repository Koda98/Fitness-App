package com.example.csastudent2015.fitnessapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by csastudent2015 on 2/1/16.
 */
public class EditNewWorkoutActivity extends FragmentActivity {
    public static final String TAG = "EditNewWorkoutActivity";

    private Button SportButton;
    private Button CardioButton;
    private Button STButton;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_enw, container, false);
        return rootView;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enw);
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = null;// = fm.findFragmentById(R.id.fragmentContainer);

        Log.e(TAG, "you are here");

        if (fragment == null) {
            if (NewWorkout.SPORT == getIntent().getIntExtra("workout_name", 0)) {
                fragment = new SportWorkoutFragment();
                fm.beginTransaction()
                        .add(R.id.fragmentContainer, fragment)
                        .commit();
                Log.e(TAG, "created new sport frag");
            }
            else if (NewWorkout.CARDIO == getIntent().getIntExtra("workout_name", 0)) {
                fragment = new StrengthTrainingWorkoutFragment();
                fm.beginTransaction()
                        .add(R.id.fragmentContainer, fragment)
                        .commit();
                Log.e(TAG, "created new cardio frag");
            }
            else if (NewWorkout.ST == getIntent().getIntExtra("workout_name", 0)) {
                fragment = new CardioWorkoutFragment();
                fm.beginTransaction()
                        .add(R.id.fragmentContainer, fragment)
                        .commit();
                Log.e(TAG, "created new st frag");
            }
        }
    }
    /*

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragementContainer);
        fragment = new NewWorkoutFragment();
        fm.beginTransaction()
                .add(R.id.fragementContainer, fragment)
                .commit();

                */

    }




