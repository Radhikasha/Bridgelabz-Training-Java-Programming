import java.util.regex.Pattern;

public class pattern3 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-z]","a"));
        System.out.println(Pattern.matches("[a-z]","ab"));
        System.out.println(Pattern.matches("[a-zA-Z]","R"));
        System.out.println(Pattern.matches("[a-zA-Z]","a"));
        System.out.println(Pattern.matches("[a-z]+",""));
        System.out.println(Pattern.matches("[a-z]+","ab"));
          System.out.println(Pattern.matches("[a-zA-Z]+","aB"));
    }
    
}
