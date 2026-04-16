import java.util.*;

public class StringIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // stringindex out of boound exception
        try {
            System.out.println(str.charAt(10));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }

}
