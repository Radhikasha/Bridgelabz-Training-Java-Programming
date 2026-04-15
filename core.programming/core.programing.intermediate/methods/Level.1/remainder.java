import java.util.*;

public class remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        remainder(a, b);
    }

    public static void remainder(int a, int b) {
        int rem = a % b;
        int quotient = a / b;
        System.out.println("Remainder: " + rem);
        System.out.println(quotient);
    }

}
