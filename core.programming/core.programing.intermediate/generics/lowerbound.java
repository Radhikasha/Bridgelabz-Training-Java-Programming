import java.util.*;

public class lowerbound {

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3,4,5);
        display(l1);
        List<Number> l2 = Arrays.asList(1,2,3,4,2);
        display(l2);

    }

    public static void display(List< ? super Integer> l) {
        System.out.println(l);


    }
    
    
}
