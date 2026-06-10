package com.lcwd.test;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class parsing {
    public static void main(String[] args) {
        String jsonString =
                "{\"name\":\"Radhika\",\"age\":22}";
        Object o = JSONValue.parse(jsonString);
        JSONObject jo = (JSONObject) o;
        String name = (String) jo.get("name");
        System.out.println(name);

        long age = (long) jo.get("age");
        System.out.println(age);


    }
}
