import java.util.*;

// 564
public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = 1;
        int temp = n;
        int i = 0;
        int res[] = new int[10];
        while (temp > 0) {
            int rem = temp % 10;
            digit = digit * 10 + rem;
            res[i] = rem;
            temp = temp / 10;
            i++;

        }

        for (int j = 0; j < i; j++) {
            System.out.print(res[j] + " ");
        }
    }
}
