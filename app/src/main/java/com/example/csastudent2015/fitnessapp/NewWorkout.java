package com.example.csastudent2015.fitnessapp;

/**
 * Created by csastudent2015 on 2/1/16.
 */
public class NewWorkout {
    public static final int SPORT = 0;
    public static final int CARDIO= 1;
    public static final int ST= 2;
    public static int workout;


    public static void setWorkoutName(int name)
    {
        workout = name;
    }

    public int getWorkoutName()
    {
        return workout;
    }
}
