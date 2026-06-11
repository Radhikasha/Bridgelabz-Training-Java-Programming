import java.util.*;

public class mult6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[5];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = n * (6 + i);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(n + " * " + (6 + i) + " = " + arr[i]);
        }
    }

}
