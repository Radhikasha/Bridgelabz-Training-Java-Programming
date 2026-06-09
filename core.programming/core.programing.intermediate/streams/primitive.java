
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class primitive {

    public static void main(String[] args) {
        

        IntStream.range(1, 3).forEach(System.out::println);

        LongStream.range(3, 7).forEach(System.out::println);

        DoubleStream.iterate(7.1, d -> d < 11.1, d -> d + 1.0).forEach(System.out::println);
    }
    
}
