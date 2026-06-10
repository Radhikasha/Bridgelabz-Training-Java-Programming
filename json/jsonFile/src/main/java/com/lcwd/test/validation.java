package com.lcwd.test;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class validation {
    public static void main(String[] args) {
        String json =
                "{\"name\":\" \",\"age\":22,"
                        + "\"email\":\"radhika@gmail.com\"}";


        JSONObject jo = (JSONObject) JSONValue.parse(json);

        //present validation
        if( ! jo.containsKey("name")){
            System.out.println("name is required");
        }

        //length
        String name  = (String) jo.get("name");
        if(name.length() < 3){
            System.out.println("name length should be greater than 3");
        }

        // Range Validation
        Long age = (Long) jo.get("age");

        if (age < 18 || age > 60) {
            System.out.println("Invalid age");

        }


    }

}
