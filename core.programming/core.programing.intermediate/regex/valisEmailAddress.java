import java.util.Scanner;
import java.util.regex.Pattern;

public class valisEmailAddress {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         System.out.println(String.valueOf(Pattern.matches("^[a-zA-Z0-9_.$-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$",s)));
    }
    
}
