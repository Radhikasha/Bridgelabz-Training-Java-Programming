import java.util.*;

public class three_friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amar_age = sc.nextInt();
        int akbar_age = sc.nextInt();
        int anthony_age = sc.nextInt();
        int amar_height = sc.nextInt();
        int akbar_height = sc.nextInt();
        int anthony_height = sc.nextInt();
        youngest(amar_age, akbar_age, anthony_age);
        tallest(amar_height, akbar_height, anthony_height);
    }

    public static void youngest(int amar_age, int akbar_age, int anthony_age) {
        if (amar_age < akbar_age && amar_age < anthony_age) {
            System.out.println("Youngest: Amar");
        } else if (akbar_age < amar_age && akbar_age < anthony_age) {
            System.out.println("Youngest: Akbar");
        } else {
            System.out.println("Youngest: Anthony");
        }
    }

    public static void tallest(int amar_height, int akbar_height, int anthony_height) {
        if (amar_height > akbar_height && amar_height > anthony_height) {
            System.out.println("Tallest: Amar");
        } else if (akbar_height > amar_height && akbar_height > anthony_height) {
            System.out.println("Tallest: Akbar");
        } else {
            System.out.println("Tallest: Anthony");
        }
    }

}
