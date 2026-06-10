package com.lcwd.test;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class arrOfObjects {

    public static void main(String[] args) {

        JSONObject ob1 = new JSONObject();
        ob1.put("id",1);
        ob1.put("name","radhika");

        JSONObject ob2 = new JSONObject();
        ob2.put("id",2);
        ob2.put("name","gaurav");

        JSONObject ob3  = new JSONObject();
        ob3.put("id",3);
        ob3.put("name","khusi");
        ob3.put("rank","first");


        JSONArray arr = new JSONArray();
        arr.add(ob2);
        arr.add(ob3);
        arr.add(ob1);

        JSONObject jo = new JSONObject();
        jo.put("objectsArray",jo);
        System.out.print(arr);

    }
}
