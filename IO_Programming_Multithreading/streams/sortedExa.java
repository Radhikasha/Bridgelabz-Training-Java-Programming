import java.util.Arrays;
import java.util.List;

class sortedExa{
    public static void main(String[] args) {
        
List<Integer> list = Arrays.asList(1,2,4,2,5,5,1,7);
list.stream().sorted().forEach(System.out:: println);

    }
}

