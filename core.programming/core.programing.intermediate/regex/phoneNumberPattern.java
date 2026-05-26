
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class phoneNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Pattern p = Pattern.compile("(^\\+?[0-9]{1,3}?[\\. -]?[0-9]{10}$)");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        System.out.println(b);
      
    }
    
}
