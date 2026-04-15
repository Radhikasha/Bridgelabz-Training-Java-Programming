import java.util.*;

public class prinicipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        simple_interest(principal, rate, time);

    }

    public static void simple_interest(int p, int r, int t) {
        int si = (p * r * t) / 100;
        System.out.println(
                "The Simple Interest is " + si + " for Principal " + p + ", Rate of Interest " + r + " and Time " + t);
    }

}
