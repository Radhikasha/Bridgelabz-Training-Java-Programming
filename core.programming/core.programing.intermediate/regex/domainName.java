
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class domainName {
    public static void main(String[] args) {
        String text = "Websites: https://www.google.com, http://example.org, and https://github.com";
        String reg = "https://(www\\.)?([a-zA-Z0-9.-]+)";
                   
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(text);
        while(m.find()){
            System.out.println("found: "+m.group(2));
        }


    }
    
}
