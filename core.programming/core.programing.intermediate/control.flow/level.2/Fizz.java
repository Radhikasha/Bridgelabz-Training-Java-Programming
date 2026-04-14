import java.util.*;

public class Fizz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (n % 3 == 0) {
                System.out.println("Fizz");
            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(n);
            }
        } else {
            System.out.println("Not a natural number");
        }
    }

}
