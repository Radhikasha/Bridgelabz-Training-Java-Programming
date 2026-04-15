import java.util.*;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        triangle2(a, b, c);
    }

    public static void triangle2(int a, int b, int c) {
        int rounds = 0;
        int perimeter = a + b + c;
        rounds = 5000 / perimeter;
        System.out.println(rounds);
    }

}
