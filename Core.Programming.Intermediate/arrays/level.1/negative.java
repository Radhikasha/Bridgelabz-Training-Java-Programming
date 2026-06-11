import java.util.*;

public class negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int total = 0;
        int i = 0;
        while (true) {
            arr[i] = sc.nextInt();
            if (arr[i] <= 0) {
                break;
            }

            i++;
        }
        for (int j = 0; j < arr.length; j++) {
            total += arr[j];

        }
        System.out.println("Total: " + total);
    }

}
