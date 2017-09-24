package com.example.gagandeep.myapplication.List.List4;

/**
 * Created by gagandeep on 8/30/17.
 */

public class Custom1 {
    private String head;
    private String body;
    private int resourceId;
    public Custom1(String mHead, String mBody, int mResourceID){
        head = mHead;
        body = mBody;
        resourceId = mResourceID;
    }

    public String getHead(){

        return head;
    }
    public String getBody(){

        return body;
    }
    public int getResourceId(){

        return resourceId;
    }
}
