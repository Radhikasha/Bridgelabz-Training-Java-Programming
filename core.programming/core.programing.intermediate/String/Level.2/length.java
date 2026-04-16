import java.util.*;

public class length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Length using charAt: " + findLength(str));
        System.out.println("Length using length() method: " + str.length());
    }

    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {

        }
        return count;
    }
}
