import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class filterExa {

    public static void main(String[] args) {
        

        List<String> names = Arrays.asList("radhu","anku","priya","arya");
        List<String> res = names.stream().filter(e -> e.startsWith("a")).collect(Collectors.toList());
        System.out.println(res);
    }
    
}
