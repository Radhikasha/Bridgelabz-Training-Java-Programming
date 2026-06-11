import java.util.*;

public class quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int delta = b * b - 4 * a * c;
        if (delta > 0) {
            positiveRoots(a, b, delta);
        } else if (delta == 0) {
            oneRoot(a, b);
        } else {
            System.out.println("no real roots");
        }
    }

    public static void positiveRoots(int a, int b, int delta) {
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("two real roots: " + root1 + " and " + root2);
    }

    public static void oneRoot(int a, int b) {
        double root = -b / (2.0 * a);
        System.out.println("one real root: " + root);
    }

}
