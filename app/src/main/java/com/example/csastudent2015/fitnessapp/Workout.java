package com.example.csastudent2015.fitnessapp;

import android.widget.RatingBar;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

/**
 * Created by csastudent2015 on 1/14/16.
 */
public class Workout {
    protected String mName;
    protected String mDate;
    protected Boolean mCompleted;
    protected String mComment;
    protected String mEffort;
    protected String mTime;
    protected String mLength;
    protected RatingBar mRating;

    public static final String JSON_NAME = "name";
    public static final String JSON_DATE = "date";
    public static final String JSON_COMPLETED = "completed";
    public static final String JSON_COMMENT = "comment";
    public static final String JSON_EFFORT = "effort";
    public static final String JSON_TIME = "time";
    public static final String JSON_RATING = "rating";

    public static final int CARDIO = 0;
    public static final int SPORT = 1;
    public static final int STRENGTH = 2;

    public Workout(String name, String date, String time, String effort, String comments, String length)
    {
        mName = name;
        mDate = date;
        mTime = time;
        mComment = comments;
        mEffort = effort;
        mLength = length;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String mDate) {
        this.mDate = mDate;
    }

    public Boolean getCompleted() {
        return mCompleted;
    }

    public void setCompleted(Boolean mCompleted) {
        this.mCompleted = mCompleted;
    }

    public String getComment() {
        return mComment;
    }

    public void setComment(String mComment) {
        this.mComment = mComment;
    }

    public String getEffort() {
        return mEffort;
    }

    public void setEffort(String mEffort) {
        this.mEffort = mEffort;
    }

    public String getTime() {
        return mTime;
    }

    public void setTime(String mTime) {
        this.mTime = mTime;
    }

    public RatingBar getRating() {return mRating; }

    public void setRating(RatingBar mRating) {this.mRating = mRating; }

    @Override
    public String toString()
    {
        return "Workout for: " + mDate + "\n Time of Workout: " + mTime + "\n Length of Workout: " + mLength + " minutes" + "\n Name of Workout: " + mName + "\n Effort Level: " + mEffort + "\n Comments: " + mComment;

    }

    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(JSON_NAME, mName);
        json.put(JSON_DATE, mDate);
        json.put(JSON_COMPLETED, mCompleted);
        json.put(JSON_EFFORT, mEffort);
        json.put(JSON_TIME, mTime);
        json.put(JSON_RATING, mRating);
        return json;
    }
}
