
import java.util.regex.Pattern;

public class only10digits {
    public static void main(String[] args) {
        //String n = "345"; //false
        String n = "3452345678"; //false

        Pattern p = Pattern.compile("[0-9]{10}");
        System.out.println(String.valueOf(Pattern.matches("[0-9]{10}", n)));
    }
    
}
