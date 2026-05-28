package com.lcwd.test.services;

public class calculatorService {
         public static int sum(int a, int b){
           return a+b;
         }

         public static int product(int a, int b){
             return a*b;
         }
         public static double divide(int a, int b){
             return a/b;
         }
         public static int anyNumberSum(int... n){
             int sum = 0;
             for(int i : n){
                 sum += i;
             }
             return sum;
         }
    public static void main(String[] args) {

    }
}
