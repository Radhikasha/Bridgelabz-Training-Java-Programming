import java.util.*;

public class height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 11;
        int arr[] = new int[11];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += arr[i];
        }
        int mean = sum / 11;
        System.out.println("mean: " + mean);
    }
}
