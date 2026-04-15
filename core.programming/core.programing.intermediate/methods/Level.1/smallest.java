import java.util.*;

public class smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        smallest(a, b, c);
    }

    public static void smallest(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println("smallest: " + a);
        } else if (b < a && b < c) {
            System.out.println("smallest: " + b);
        } else {
            System.out.println("smallest: " + c);
        }

        if (a > b && a > c) {
            System.out.println("largest: " + a);
        } else if (b > a && b > c) {
            System.out.println("largest: " + b);
        } else {
            System.out.println("largest: " + c);
        }
    }

}
