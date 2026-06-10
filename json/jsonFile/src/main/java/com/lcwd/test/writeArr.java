package com.lcwd.test;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class writeArr {

    public static void main(String[] args) {
        JSONArray arr = new JSONArray();
        arr.add("java");
        arr.add("python");
        arr.add("react");

        JSONObject o = new JSONObject();
        o.put("Skills",arr);
        System.out.println(o);
    }
}
