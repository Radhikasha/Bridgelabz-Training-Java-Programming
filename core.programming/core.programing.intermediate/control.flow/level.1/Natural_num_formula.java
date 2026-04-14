import java.util.*;

public class Natural_num_formula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            int sum = number * (number + 1) / 2;

            System.out.println("Using formula " + sum);
        }
        int i = 1;
        int sum2 = 0;
        while (i != number) {
            sum2 += i;
            i++;

        }
        sum2 += number;
        System.out.println("Using while loop " + sum2);
    }

}
