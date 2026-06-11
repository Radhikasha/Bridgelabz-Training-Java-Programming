
import java.util.*;

public class Natural_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            int sum = number * (number + 1) / 2;

            System.out.println("Sum of natural numbers up to " + number + " is: " + sum);
        } else {
            System.out.println(number + " is not a natural number.");
        }
    }

}
