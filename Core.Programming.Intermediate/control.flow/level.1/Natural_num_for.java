import java.util.*;

public class Natural_num_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            int sum = number * (number + 1) / 2;

            System.out.println("Using formula " + sum);
        }

        int sum2 = 0;
        for (int i = 1; i <= number; i++) {
            sum2 += i;
        }
        System.out.println("Using for loop " + sum2);
    }

}
