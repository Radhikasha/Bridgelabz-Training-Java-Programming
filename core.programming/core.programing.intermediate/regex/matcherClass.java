
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matcherClass {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("hy");
        Matcher m = p.matcher("hy radhika hy aashu");
        while(m.find()){
            System.out.println("Start from: "+ m.start() +"and end to: "+m.end());
        }

         Pattern p1 = Pattern.compile("hy");
        Matcher m1 = p1.matcher(" radhika");
        while(m1.find()){
            System.out.println("Start from: "+ m1.start() +"and end to: "+m1.end());
        }
    }
    
}
