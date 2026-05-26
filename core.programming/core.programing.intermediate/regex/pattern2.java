
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern2 {
    public static void main(String[] args) {
        String regex = "a";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher("ab");
        boolean b = m.matches();
        System.out.println(b);
    }
    
}
