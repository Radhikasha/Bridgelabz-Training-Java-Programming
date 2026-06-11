import java.util.Arrays;
import java.util.List;

public class flatmapExa {
    public static void main(String[] args) {
        

        List<List<Integer>> l = Arrays.asList(
            Arrays.asList(12,4),
            Arrays.asList(13,4),
            Arrays.asList(65,2,5)
        );

        l.stream().flatMap(e -> e.stream()).forEach(System.out::println);
    }
    
}
