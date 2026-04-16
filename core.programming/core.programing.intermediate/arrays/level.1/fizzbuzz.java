import java.util.*;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res[] = new String[n];
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                res[i] = "Fizz";
            } else if (i % 5 == 0) {
                res[i] = "Buzz";
            } else {
                res[i] = Integer.toString(i);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }

}
