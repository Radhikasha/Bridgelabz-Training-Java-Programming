package com.lcwd.test.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class parameterizedtest {


   // @ParameterizedTest
   // @ValueSource(ints = {2,4,8})
    public void test2(int n){
        System.out.println(n/2);
    }
    @ParameterizedTest
    @ValueSource(strings = {"radhika","aashu","koyal"})
    public void test3(String i){
        System.out.println(i);
    }
}
