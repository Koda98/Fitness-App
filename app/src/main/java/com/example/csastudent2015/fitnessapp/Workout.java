package com.example.csastudent2015.fitnessapp;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

/**
 * Created by csastudent2015 on 1/14/16.
 */
public abstract class Workout {
    protected String mName;
    protected Date mDate;
    protected Boolean mCompleted;
    protected String mComment;
    protected String mEffort;
    protected String mTime;

    public static final String JSON_NAME = "name";
    public static final String JSON_DATE = "date";
    public static final String JSON_COMPLETED = "completed";
    public static final String JSON_COMMENT = "comment";
    public static final String JSON_EFFORT = "effort";
    public static final String JSON_TIME = "time";

    public static final int CARDIO = 0;
    public static final int SPORT = 1;
    public static final int STRENGTH = 2;

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
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

    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(JSON_NAME, mName);
        json.put(JSON_DATE, mDate);
        json.put(JSON_COMPLETED, mCompleted);
        json.put(JSON_EFFORT, mEffort);
        json.put(JSON_TIME, mTime);
        return json;
    }
}
