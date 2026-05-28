
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class appendMethods {

    public static void main(String[] args) {
        String reg = "a*b";
        String text = "aabfooaabfooabfoob";
        String rep = "hyy";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(text);
StringBuilder sb = new StringBuilder();


        while(m.find()){
            m.appendReplacement(sb, rep);      // jo bhi regex hai usko replace kr dega replacement string se aur sb m store kr dega

        }
        m.appendTail(sb); /// bche kuche words hai text me yeh unko sb me add kr dega
        System.out.println(sb);

    }
    
}
