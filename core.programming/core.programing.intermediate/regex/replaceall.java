
import java.util.regex.*;

public class replaceall {
    public static void main(String[] args) {
        String s = "java is good, java is high level";
        String r = "java";
        Pattern p = Pattern.compile(r);
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        System.out.println("Entire string match or not: "+b);

        while(m.find()){
            System.out.println("found: "+m.group());
        }

        
            String rep = s.replaceAll(r, "python");
            System.out.println(rep);
        

        
    }
    
}
