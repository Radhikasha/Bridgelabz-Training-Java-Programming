package com.lcwd.test;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class jsonread {
    public static void main(String[] args) {
        String str = "{\"Full Name\":\"Ritu Sharma\",\"Tuition Fees\":65400.0,\"Roll No.\":1704310046}";

        Object o = JSONValue.parse(str);
        JSONObject jo = (JSONObject) o;
       String name = (String) jo.get("Full Name");
       double tuition = (double) jo.get("Tuition Fees");
       long roll = (long) jo.get("Roll No.");

       System.out.println(name + " "+ tuition +" "+ roll);

    }
}
