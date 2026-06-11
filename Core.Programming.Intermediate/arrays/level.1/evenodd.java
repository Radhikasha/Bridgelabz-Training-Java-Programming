import java.util.*;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] even = new int[n / 2 + 1];
        int[] odd = new int[n / 2 + 1];
        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                even[i / 2] = i;
            } else {
                odd[i / 2] = i;
            }
        }
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
        
    }
}
