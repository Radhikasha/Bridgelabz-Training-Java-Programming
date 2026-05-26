import java.util.regex.*;
public class group {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("g*s");
        Matcher m = p.matcher("eekgsForGeeks");
        while(m.find()){
            System.out.println(m.group());
        }

    }
    
}
