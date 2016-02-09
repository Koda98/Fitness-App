package com.example.csastudent2015.fitnessapp;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by csastudent2015 on 1/20/16.
 */
public class SportWorkoutFragment extends Fragment {
    private static final String TAG = "SportWorkoutFragment";

    //picker frag
    private FragmentActivity myContext;

    private EditText mName;
    private EditText mLength;
    private EditText mDate;
    private EditText mEffort;
    private EditText mComments;
    private static EditText mShowDate;
    private static EditText mShowTime;
    private Context mAppContext;
    private Button mTimeButton;
    private Button mDateButton;
    private Button mSave;
    public DialogFragment datePicker = new DatePickerFragment();
    public DialogFragment timePicker = new TimePickerFragment();
    private static String date;
    private static String time;
    private String name;
    private String effort;
    private String comments;
    private String length;
    private Workout workout;
    private static TextView mWorkout;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sport_workout, container, false);

        getActivity().setTitle("Sport Workout");

        mName = (EditText)rootView.findViewById(R.id.sport_name);
        mLength = (EditText)rootView.findViewById(R.id.sport_time);
        //mDate = (EditText)rootView.findViewById(R.id.sport_date);
        mEffort = (EditText)rootView.findViewById(R.id.sport_effort);
        mComments= (EditText)rootView.findViewById(R.id.sport_comments);
        mShowDate= (EditText)rootView.findViewById(R.id.showDate);
        mShowTime= (EditText)rootView.findViewById(R.id.showTime);
        mSave= (Button)rootView.findViewById(R.id.save_button);
        mWorkout = (TextView) rootView.findViewById((R.id.display_workout));


        /* //picker frag
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
        */



        mShowDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "date clicked");
                FragmentManager fragManager = myContext.getSupportFragmentManager();
                datePicker.show(fragManager, "datePicker");
            }
        });

        mShowTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "date clicked");
                FragmentManager fragManager = myContext.getSupportFragmentManager();
                timePicker.show(fragManager, "datePicker");
            }
        });

        mSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "save clicked");
                name = mName.getText().toString();
                comments = mComments.getText().toString();
                effort = mEffort.getText().toString();
                length = mLength.getText().toString();
                workout = new Workout(name, date, time, effort, comments, length);
                Log.e(TAG, workout.toString());
                mWorkout.setText(workout.toString());
            }
        });






        return rootView;
    }

    public static class DatePickerFragment extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {

        private FragmentManager mSupportFragmentManager;
        private int year;
        private int month;
        private int day;


        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current date as the default date in the picker
            final Calendar c = Calendar.getInstance();
            year = c.get(Calendar.YEAR);
            month = c.get(Calendar.MONTH);
            day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(getActivity(), this, year, month, day);

        }


        public void onDateSet(DatePicker view, int year, int month, int day) {

        mShowDate.setText(month + "/" + day + "/" + year);
        date = month + "/" + day + "/" + year;

        }
    }

    public static class TimePickerFragment extends DialogFragment
            implements TimePickerDialog.OnTimeSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current time as the default values for the picker
            final Calendar c = Calendar.getInstance();
            int hour = c.get(Calendar.HOUR_OF_DAY);
            int minute = c.get(Calendar.MINUTE);

            // Create a new instance of TimePickerDialog and return it
            return new TimePickerDialog(getActivity(), this, hour, minute,
                    DateFormat.is24HourFormat(getActivity()));
        }

        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            mShowTime.setText(hourOfDay + ":" + minute);
            time = hourOfDay + ":" + minute;
        }

    }


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAppContext = this.getActivity();
        Log.d(TAG, "Context: " + mAppContext);



    }

    //picker frag
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
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
