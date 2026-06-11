import java.util.*;

public class factorial3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        int fact = 1;
        while (counter <= n) {

            if (n % counter == 0) {
                System.out.println(counter);
            }
            fact *= counter;

            counter++;

        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }

}
