package com.lcwd.test;

import org.json.simple.JSONObject;

public class jsonWrite {
    public static void main(String[] args) {
        JSONObject jo = new JSONObject();
        jo.put("NAME","radhika");
        jo.put("AGE",21);
        System.out.println(jo);
    }
}
