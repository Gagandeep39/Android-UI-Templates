package com.example.gagandeep.myapplication.List.List5;

import android.graphics.Color;

/**
 * Created by gagandeep on 8/30/17.
 */

public class Custom2 {

    private String head;
    private String body;
    private int resourceId1;
    private int resourceId2;
    private int colorId;

    public Custom2(String mHead, String mBody, int mResourceId1, int mResourceId2, int mBackground){
        head = mHead;
        body = mBody;
        resourceId1 = mResourceId1;
        resourceId2 = mResourceId2;
        colorId = mBackground;
    }

    public String getHead(){
        return head;
    }

    public String getBody(){

        return body;
    }

    public int getResourceId1(){

        return resourceId1;
    }

    public int getResourceId2(){

        return resourceId2;
    }

    public int getBackground(){

        return colorId;
    }

}
