import java.util.*;

public class lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                res += (char) (ch + 32);
            } else {
                res += ch;
            }
        }
        System.out.println("using charAt: " + res);
        System.out.println("using toLowerCase method: " + str.toLowerCase());
    }

}
