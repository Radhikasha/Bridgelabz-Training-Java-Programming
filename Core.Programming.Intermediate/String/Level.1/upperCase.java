import java.util.*;

public class upperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                res += (char) (ch - 'a' + 'A');
            } else {
                res += ch;
            }
        }
        System.out.println("using charAt: " + res);
        System.out.println("using toUpperCase method: " + str.toUpperCase());
    }

}
