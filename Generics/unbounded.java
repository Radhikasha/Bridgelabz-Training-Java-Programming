import java.util.*;

public class unbounded {

    public static void display(List<?> l){
    
        for (Object i : l) {
            System.out.println(i);
            
            
        }
    }


    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,4,5,3);
        display(l1);

        List<Double> l2 = Arrays.asList(1.2,3.4,1.4);
        display(l2);
    }
    
}
