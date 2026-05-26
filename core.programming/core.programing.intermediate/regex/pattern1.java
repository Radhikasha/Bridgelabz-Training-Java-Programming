
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern1 {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaab");
        Boolean b = m.matches();
        System.out.println(b);

    }
    
}
