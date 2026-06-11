import java.util.*;

public class natural_rec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        natural(n);
        System.out.println("using formula: " + recursion(n));
    }

    public static void natural(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("using formula : " + sum);
    }

    public static int recursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursion(n - 1);
    }

}
