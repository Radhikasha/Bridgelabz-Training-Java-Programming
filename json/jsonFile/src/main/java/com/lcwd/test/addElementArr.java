package com.lcwd.test;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class addElementArr {

    public static void main(String[] args) {

        String arr = "{\"marks\" : [1,2,3,3,4,5]}";

        JSONObject jo = (JSONObject) JSONValue.parse(arr);
        JSONArray a = (JSONArray) jo.get("marks");
        long sum = 0;
        for(Object i : a){
            sum += (long)i;
        }
        System.out.print(sum);
    }
}
