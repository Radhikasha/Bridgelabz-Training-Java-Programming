
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class alphanumericPattern {

    public static void main(String[] args) {
        String s = "234adfBADSFDGF6H5";
        Pattern p = Pattern.compile("[a-zA-Z0-9]+");
        Matcher m = p.matcher(s);
        Boolean b = m.matches();
        System.out.println(b);
    }
    
}
