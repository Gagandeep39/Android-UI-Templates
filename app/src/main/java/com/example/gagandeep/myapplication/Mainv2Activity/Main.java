package com.example.gagandeep.myapplication.Mainv2Activity;

/**
 * Created by gagandeep on 8/31/17.
 */

public class Main {

    private String text;
    private int background;
    public Main(String mText, int mBackground){

        text = mText;
        background = mBackground;
    }

    public String getText(){

        return text;
    }

    public int getBackground(){

        return background;
    }
}
