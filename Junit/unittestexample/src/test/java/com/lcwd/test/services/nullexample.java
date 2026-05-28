package com.lcwd.test.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class nullexample {

    @Test
    public void dis() {
        String s = "aaashu";
        String s2 = null;
        //Assertions.assertNull(s2); //pass
        // Assertions.assertNull(s); // fail
        //Assertions.assertNotNull(s); //pass
        Assertions.assertNotNull(s2);
    }

}
