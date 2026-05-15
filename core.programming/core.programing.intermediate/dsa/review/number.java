package review;

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
       int max = 0;

       String s = String.valueOf(n);
       s = s.replaceFirst("6", "9");
       System.out.println(Integer.parseInt(s));
        
    
         //System.out.println(Integer.parseInt(s.replaceFirst("6", "9")));

        
    }
    
}
