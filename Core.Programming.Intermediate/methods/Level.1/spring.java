import java.util.*;

public class spring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        spring(d, m);
    }

    public static void spring(int d, int m) {
        if ((m == 3 && d >= 20) || (m == 4) || (m == 5) || (m == 6 && d <= 20)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Its not a Spring Season");
        }
    }

}
