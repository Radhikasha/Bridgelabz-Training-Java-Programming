package com.lcwd.test.services;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class tag {
    @Test
    @Tag("fast")
    public void fast(){
        System.out.println("this is fast method");
    }
    @Test
    @Tag("slow")
    public void slow(){
        System.out.println("this is slow test");
    }
}
