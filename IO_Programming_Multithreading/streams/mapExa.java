import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapExa {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        list.stream().map(n -> n *3).forEach(System.out::println);


        List<Integer> ans = list.stream().map(i -> i*i).collect(Collectors.toList());
        System.out.println(ans);
    }
    
}
