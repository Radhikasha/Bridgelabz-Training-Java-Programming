package com.lcwd.test.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class assertExample {

    @Test
    public void test(){
        System.out.println("Test 1");
        float act = 12;
        Float exp = 12.0f;
        //Assertions.assertEquals(exp,act);


        int []actu = {1,2,3,4};
        int[]expe = {1,2,3,2,};
        //Assertions.assertArrayEquals(expe,actu);

        String s3 = "radhika";
        String  s =  "radhika";
        //Assertions.assertSame(s,s3); return true

        String s1 = new String("radhika");
        String  s2 = new String("radhika");
        //Assertions.assertSame(s2,s1); return false
        //Assertions.assertEquals(s2,s1); return true

        boolean b = true;
        //Assertions.assertTrue(b);
        boolean b2 = false;
        //Assertions.assertFalse(b2);

        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(1,2,4,3);
       // Assertions.assertIterableEquals(list2,list1);


      //  Assertions.assertThrows(RuntimeException.class, ()->{
            //System.out.println("this is radhu"); // test case failes bcz it does not give runtime exce
      //      throw new RuntimeException("this is testing"); // now it is pass

      //  });




    }
}
