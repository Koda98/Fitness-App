package com.example.csastudent2015.fitnessapp;

import java.util.concurrent.TimeUnit;

/**
 * Created by csastudent2015 on 1/14/16.
 */
public class CardioWorkout extends Workout{
    protected TimeUnit timer;
    protected Double distance;

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getEffort() {
        return effort;
    }

    public void setEffort(String effort) {
        this.effort = effort;
    }

    protected String effort;

    public TimeUnit getTimer() {return timer;}
    public void setTimer(TimeUnit timer) {
        this.timer = timer;
    }
}
