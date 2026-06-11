import java.util.Arrays;
import java.util.List;

public class minMax {

    public static void main(String[] args) {
        

        List<Integer> list = Arrays.asList(1,2,4,2,5,5,1,7);
        Integer a = list.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println("min: "+a);

        Integer b = list.stream().max((x,y)-> x.compareTo(y)).get();
        System.out.println("max: "+b);
    }
    
}
