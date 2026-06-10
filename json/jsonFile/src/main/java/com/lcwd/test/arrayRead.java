package com.lcwd.test;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class arrayRead {

    public static void main(String[] args) {
        String arr = "{\"skills\" :[\"java\",\"react\",\"python\"]}";
          Object o = JSONValue.parse(arr);
        JSONObject jo = (JSONObject) o;
        JSONArray s = (JSONArray) jo.get("skills");
        for(Object i : s){
            System.out.println(i);
        }


    }
}
