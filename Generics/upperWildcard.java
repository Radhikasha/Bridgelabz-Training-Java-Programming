import java.util.*;

public class upperWildcard {




    public static double sum(List<? extends Number> n){
        double res = 0;
        for(Number i : n){
            res += i.doubleValue();
        }
        return res;

    }

    public static void main(String[] args) {
        List<Integer> integer = Arrays.asList(1,2,3,4);
        System.out.println(sum(integer));


        List<Double> l2 = Arrays.asList(2.5 ,4.4 ,5.5 , 2.3);
        System.out.println(sum(l2));




    }
    
}
