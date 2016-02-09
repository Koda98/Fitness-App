package com.example.csastudent2015.fitnessapp;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by csastudent2015 on 1/14/16.
 */
public class StrengthTrainingWorkout {
    private String name;
    private String  time;
    private String  date;
    private String weight;
    private String  numReps;
    private float ratingBar;

    public StrengthTrainingWorkout( String name, String time, String date, String weight,
                          String numReps, float rating){
        this.name = name;
        this.time = time;
        this.date = date;
        this.weight = weight;
        this.numReps = numReps;
        this.ratingBar = rating;
    }
}
