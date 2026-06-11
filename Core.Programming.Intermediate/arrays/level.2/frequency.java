import java.util.*;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int freq[] = new int[n];
        for (int i = 0; i < n; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < n; i++) {

            System.out.println(arr[i] + " " + freq[i]);

        }
    }

}
