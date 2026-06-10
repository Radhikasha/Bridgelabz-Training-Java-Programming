
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class primitive {

    public static void main(String[] args) {
        

        IntStream.range(1, 3).forEach(System.out::println);

        LongStream.range(3, 7).forEach(System.out::println);

       
    }
    
}
