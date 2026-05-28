/*package com.lcwd.test.services;

import org.junit.*;

import java.util.Date;

public class calculatorServiceTest {

    @BeforeClass
    static public void initi(){
        System.out.println("before all test cases");
        System.out.println("started on: "+new Date());
    }

    @Before
    public  void beforeeach(){
        System.out.println("RUN THIS METHOD BEFORE EACH METHOD OR TEST CASES");
    }


         @Test
    public void sumTest(){
        System.out.println("Run sum test");
       int res =  calculatorService.sum(12,10);
         int expected = 22;
        Assert.assertEquals(expected,res);

    }


    @Test
    public void anyNumberSum(){
        System.out.println("run any number sum test");
             int res = calculatorService.anyNumberSum(12,1,2);
             int exepected = 15;
             Assert.assertEquals(exepected,res);
    }
    @Test
    public void productTest(){
        System.out.println("run product test");
             int res = calculatorService.product(2,3);
             int exp = 6;
             Assert.assertEquals(exp,res);
    }

    @AfterClass
    public static void end(){
        System.out.println("After all test cases");
        System.out.println("End on: "+new Date());
    }

    @After
    public   void after(){
        System.out.println("AFTER ALL THE TESET CASES");
    }

}

 */
