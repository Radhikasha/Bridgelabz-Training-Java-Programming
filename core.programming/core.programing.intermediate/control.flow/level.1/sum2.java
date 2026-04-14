import java.util.*;

public class sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double num;
        do {
            num = sc.nextDouble();
            if (num <= 0) {
                break;
            }
            total += num;
        } while (true);
        System.out.println(total);

    }

}
