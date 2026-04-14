import java.util.*;

public class multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0 && n <= 100) {
            for (int j = 100; j >= 1; j--) {
                if (n % j == 0) {
                    System.out.println(j);
                    continue;
                }
            }
        } else {
            System.out.println("Invalid input");
        }
    }

}
