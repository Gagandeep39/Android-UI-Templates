package com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler4;

/**
 * Created by gagandeep on 9/5/17.
 */

public class Custom2 {
    public Custom2(String head, String body, int resourceId) {
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
