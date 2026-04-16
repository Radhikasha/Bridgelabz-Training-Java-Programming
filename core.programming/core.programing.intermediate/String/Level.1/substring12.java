import java.util.*;

public class substring12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println("using charAt method: ");
        String res = "";
        for (int i = start; i < end; i++) {
            res += str.charAt(i);
        }
        System.out.println(res);
        System.out.println("using substring method: ");
        System.out.println(str.substring(start, end));

    }

}
