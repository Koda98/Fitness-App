package com.example.csastudent2015.fitnessapp;

import android.content.Context;

import org.json.JSONException;

import java.io.IOException;

/**
 * Created by csastudent2015 on 1/26/16.
 */
public class JSONStorer {
    protected Context mContext;
    protected String mFilename;
    private static final int SPORT = 0;

    public JSONStorer() {}

    public JSONStorer(Context c, String f) {
        mContext = c;
        mFilename = f;
    }
}
