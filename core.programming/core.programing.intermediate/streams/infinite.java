
import java.util.stream.Stream;

public class infinite {
    public static void main(String[] args) {
        System.out.println("Using iterrate");
    Stream.iterate(1, n-> n+1).limit(10).forEach(System.out::println);

    System.out.println("using generate");

    Stream.generate(()->"hello").limit(3).forEach(System.out::println);

    }
    
}
