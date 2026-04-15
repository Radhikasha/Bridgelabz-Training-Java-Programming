import java.util.*;

public class positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        positive(n);
    }

    public static void positive(int n) {
        if (n > 0) {
            System.out.println("1");
        } else if (n < 0) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }
    }

}
