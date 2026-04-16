import java.util.*;

public class numberFormatException {
    public static void main(String[] args) {
        String str = "abc";
        try {
            int num = Integer.parseInt(str);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception caught: " + e.getMessage());
        }
    }

}
