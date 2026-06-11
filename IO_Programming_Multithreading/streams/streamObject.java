
import java.util.stream.Stream;

public class streamObject {
    public static void main(String[] args) {
        String names[] = {"radhika","aashu","muni"};

        Stream<String> s = Stream.of(names);
        s.forEach(e -> {
            System.out.println(e);
        });
    }
    
}
