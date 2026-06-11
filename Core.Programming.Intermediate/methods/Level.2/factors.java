import java.util.*;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res[] = factors(n);
        System.out.println("Factors of " + n + ": " + Arrays.toString(res));
        int sum = 0;
        for (int factor : res) {
            sum += factor;
        }
        System.out.println("Sum of factors: " + sum);
        int product = 1;
        for (int factor : res) {
            product *= factor;
        }
        System.out.println("Product of factors: " + product);
        int sumOfSquares = 0;
        for (int factor : res) {
            sumOfSquares += factor * factor;
        }
        System.out.println("Sum of squares of factors: " + sumOfSquares);

    }

    public static int[] factors(int n) {
        ArrayList<Integer> factorList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factorList.add(i);
            }
        }
        int[] result = new int[factorList.size()];
        for (int i = 0; i < factorList.size(); i++) {
            result[i] = factorList.get(i);
        }
        return result;
    }

}
