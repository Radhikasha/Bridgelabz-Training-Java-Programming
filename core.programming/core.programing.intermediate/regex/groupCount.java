import java.util.regex.*;

public class groupCount {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(Geeks)");
        Matcher m = p.matcher("GeeksForGeeks Geeks for For Geeks Geek");
         System.out.println(m.groupCount());


          Pattern p2 = Pattern.compile("(GFG)");
        Matcher m2 = p2.matcher("FGF GF FG FGF");
         System.out.println(m2.groupCount());


         Pattern p3 = Pattern.compile("GFG");
        Matcher m3 = p3.matcher("FGF GF FG FGF G F G  GFG");
         System.out.println(m3.groupCount());


          Pattern pattern = Pattern.compile("(a*b)(foo)(a)(d)");
        Matcher matcher = pattern.matcher("aabfoo");

        System.out.println("Groups in pattern: " + matcher.groupCount()); 

    }
    
}
