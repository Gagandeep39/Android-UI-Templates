package com.example.gagandeep.myapplication.List.Earthquake;

import java.text.SimpleDateFormat;

/**
 * Created by gagandeep on 9/16/17.
 */

public class Earthquake {

    public Earthquake(double head, String body, long milliSecond, String url) {
        this.head = head;
        this.body = body;
        this.milliSecond = milliSecond;
        this.url = url;
    }

    private double head;
    private String body;
    private long milliSecond;
    private String url;

    public double getHead(){
        return head;
    }
    public String getBody(){
        return body;
    }
    public long getMilliSecond(){
        return milliSecond;
    }
    public String getUrl(){
        return url;
    }
}
