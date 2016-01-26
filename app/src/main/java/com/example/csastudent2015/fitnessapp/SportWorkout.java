package com.example.csastudent2015.fitnessapp;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

/**
 * Created by csastudent2015 on 1/14/16.
 */
public class SportWorkout extends Workout /* implements applicant data?? */ {


        public SportWorkout()
        {
        }

        public SportWorkout(String name, String time, Date date, String effort, String comments) {

            setName(name);   // need to make these methods in Workout - setName, setTime, setDate, setEffort, setComments
            setTime(time);
            setDate(date);
            setEffort(effort);
            setComments(comments);

        }

    /* public Sibling(JSONObject json) throws JSONException {


    }*/

        public SportWorkout(JSONObject json) throws JSONException {
            mName = json.getString(JSON_NAME);
            mTime = json.getString(JSON_TIME);
            mDate = json.getString(JSON_TIME);    //or getDate?
            mTime = json.getString(JSON_TIME);
            mTime = json.getString(JSON_TIME);




        }

        public String toString()
        {
            return "Sport Workout: " + getName() + " \nfor  " + getTime() + " \non " + getDate + " \n " + ;
        }



    }

}

