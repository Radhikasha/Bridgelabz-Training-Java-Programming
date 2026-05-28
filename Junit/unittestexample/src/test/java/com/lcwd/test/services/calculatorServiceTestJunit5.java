package com.lcwd.test.services;

import org.junit.jupiter.api.*;

public class calculatorServiceTestJunit5 {


    @BeforeAll
    public static void print(){
        System.out.println("before all the test cases");
    }

    @AfterAll
    public static void print2(){
        System.out.println("after all the test cases");
    }

    @BeforeEach
    public  void dis(){
        System.out.println("before each test case");
    }
    @AfterEach
    public  void dis2(){
        System.out.println("After each test case");
    }

    @Test
    @DisplayName("sum2332564")
    public void sumTest() {
       System.out.println("sum");
        int actualResult = calculatorService.sum(12, 12);
        int expected = 24;
        Assertions.assertEquals(actualResult, expected, "Not match with the expected output");


    }
    @Test
    @Disabled
    public void anyNumberSumTest(){
        System.out.println("Any Number sum");
        int res = calculatorService.anyNumberSum(2,4,3,1);
        int exp = 10;
        Assertions.assertEquals(exp,res,"failed");


    }

    //@Test
    @RepeatedTest(2)
    public void productTest(){
        System.out.println("product");
        int res = calculatorService.product(3,4);
        int exp = 12;
        Assertions.assertEquals(exp,res,"failed");

    }
    @Test
    public void divideTest(){
        System.out.println("divide");
        double res = calculatorService.divide(15,3);
        double exp = 5;
        Assertions.assertEquals(exp,res,"failed");

    }

}