import java.util.*;

public class stringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        ""
        if (s1.equals(s2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        System.out.println("using charAt method: ");
        boolean flag = true;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }

}
