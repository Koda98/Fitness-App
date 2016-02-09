package com.example.csastudent2015.fitnessapp;

import java.util.concurrent.TimeUnit;

/**
 * Created by csastudent2015 on 1/14/16.
 */
public class CardioWorkout{

    private String name;
    private String  time;
    private String  date;
    private String effort;
    private String  comments;
    private String  distance;
    private float ratingBar;

    public CardioWorkout( String name, String time, String date, String effort,
                          String comments, String distance, float rating){
        this.name = name;
        this.time = time;
        this.date = date;
        this.effort = effort;
        this.comments = comments;
        this.distance = distance;
        this.ratingBar = rating;
    }

}
