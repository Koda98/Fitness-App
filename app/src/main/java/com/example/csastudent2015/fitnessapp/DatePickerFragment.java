package com.example.csastudent2015.fitnessapp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.DatePicker;

import java.util.Calendar;

/**
 * Created by csastudent2015 on 2/5/16.
 */
public class DatePickerFragment extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {

    private FragmentManager mSupportFragmentManager;
    private int year;
    private int month;
    private int day;
    private String date;

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

        public int getYear()
        {

            return year;
        }
        public int getMonth()
        {
            return month;
        }
        public int getDay()
        {
            return day;
        }


        public void onDateSet(DatePicker view, int year, int month, int day) {






            // Do something with the date chosen by the user

        }



}

