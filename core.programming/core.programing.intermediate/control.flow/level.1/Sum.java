import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double num;
        do {
            num = sc.nextDouble();
            total += num;
        } while (num != 0);
        System.out.println(total);

    }

}
