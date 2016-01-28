package com.example.csastudent2015.fitnessapp;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

/**
 * Created by csastudent2015 on 1/14/16.
 */
public class SportWorkout extends Workout /* implements applicant data?? */ {

//BUT DO WE EVEN NEED ANY OF THIS REALLY???!?!?!??

        public SportWorkout()
        {
        }

        public SportWorkout(String name, String time, Date date, String effort, String comments) {

            setName(name);   // these are methods in Workout - setName, setTime, setDate, setEffort, setComment
            setTime(time);
            setDate(date);
            setEffort(effort);
            setComment(comments);

        }

    /* NAH


    public Sibling(JSONObject json) throws JSONException {


    }

        public SportWorkout(JSONObject json) throws JSONException {
            mName = json.getString(JSON_NAME);
            mTime = json.getString(JSON_TIME);
            mDate = json.getString(JSON_TIME);    //or getDate?
            mTime = json.getString(JSON_TIME);
            mTime = json.getString(JSON_TIME);

}
 */



        public String toString()
        {
            return "Sport Workout: " + getName() + " \nfor  " + getTime() + " \non " + getDate.toString() + " \nEffort level of: " + getEffort() + "\nComments: " + getComment();
        }



    }

}

