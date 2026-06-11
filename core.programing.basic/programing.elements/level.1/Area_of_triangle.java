import java.util.*;

public class Area_of_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();
        double area = 0.5 * base * height;
        System.out.println("The area of triangle is: " + area);
    }

}
