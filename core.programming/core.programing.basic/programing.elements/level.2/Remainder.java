import java.util.*;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        int remainder = dividend % divisor;
        int quotient = dividend / divisor;
        System.out.println(" The Quotient is " + quotient + " and Reminder is " + remainder + " of two numbers "
                + dividend + " and " + divisor);
    }
}
