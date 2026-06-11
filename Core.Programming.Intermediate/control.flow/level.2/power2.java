import java.util.*;

public class power2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = sc.nextInt();
        int res = 1;
        while (power > 0) {
            res *= n;
            power--;
        }
        System.out.println(res);
    }

}
