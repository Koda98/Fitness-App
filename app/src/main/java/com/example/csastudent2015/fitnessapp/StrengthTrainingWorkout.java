package com.example.csastudent2015.fitnessapp;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by csastudent2015 on 1/14/16.
 */
public class StrengthTrainingWorkout extends Workout{

    protected String effort;
    protected String mLastName;

    private ArrayList<Lift> workouts = new ArrayList<Lift>();

    public StrengthTrainingWorkout(String name, Date date,Boolean complete){
        super();
    }

    public boolean addLift(String name, int startingWeight, int increment){
        workouts.add(new Lift(name,startingWeight,increment));
        return true;
    }

}
