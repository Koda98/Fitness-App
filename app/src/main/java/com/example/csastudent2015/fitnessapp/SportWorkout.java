package com.example.csastudent2015.fitnessapp;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

/**
 * Created by csastudent2015 on 1/14/16.
 */
public class SportWorkout extends Workout {
    private String name;
    private String  time;
    private String  date;
    private String effort;
    private String  comments;

    public SportWorkout( String name, String time, String date, String effort,
                          String comments){
        this.name = name;
        this.time = time;
        this.date = date;
        this.effort = effort;
        this.comments = comments;
    }
}



