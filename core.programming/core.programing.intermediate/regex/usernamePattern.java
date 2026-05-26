
import java.util.Scanner;
import java.util.regex.Pattern;

public class usernamePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(String.valueOf(Pattern.matches("^[a-zA-Z0-9@$]+$", s)));
    }
    
}
