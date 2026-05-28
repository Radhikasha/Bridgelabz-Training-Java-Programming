package com.lcwd.test.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class asertall {

    @Test
    public void display(){
        String s = "radhika";
        String s2 = "radhika";
        String s3 = new String("radhika");
        String s5 = "sdfg";
            String s4 = null;

        Assertions.assertAll("There are following assert conditions",
                ()-> Assertions.assertNull(s4),
        () -> Assertions.assertEquals(s,s2),
                () -> Assertions.assertEquals(s,s3),
                () -> Assertions.assertNotEquals(s5,s3)
        );
    }
}
