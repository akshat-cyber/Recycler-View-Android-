package com.example.scroller;

import android.util.Log;

import java.util.ArrayList;

public class fillArrayList {
    public ArrayList<dataSet> setArrayList;
    private String[] name = {
            "A", "B", "D", "E", "F", "G", "H",
            "A", "B", "D", "E", "F", "G", "H",

    };
    private String[] stat = {
            "yes", "no ", "no ", "yes", "yes", "no ", "no ",
            "yes", "no ", "no ", "yes", "yes", "no ", "no ",
    };
    public ArrayList<dataSet> getSetArrayList() {
        if(name.length == stat.length)
        {   try {
            this.setArrayList = new ArrayList<dataSet>();
            for (int i = 0; i < name.length; i++) {
                setArrayList.add(i, new dataSet(this.name[i], this.stat[i]));
            }
        } catch (ArrayIndexOutOfBoundsException g) {
            g.printStackTrace();
        }
    }
        return this.setArrayList;
    }
}
