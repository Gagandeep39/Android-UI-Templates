package com.example.gagandeep.myapplication.Mainv3;

/**
 * Created by gagandeep on 9/11/17.
 */

public class Main3 {
    public Main3(String head, String body, int resourceId) {
        this.head = head;
        this.body = body;
        this.resourceId = resourceId;
    }

    private String head;
    private String body;
    private int resourceId;

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
