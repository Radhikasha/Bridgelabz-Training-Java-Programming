import java.util.Arrays;
import java.util.List;

public class instanceObject{
    public static void main(String[] args) {
        

        List<String> names =
            Arrays.asList("java","python","react");

            names.stream().map(String :: toUpperCase).forEach(System.out::println);   //str -> str.toUpperCase()
    }
}