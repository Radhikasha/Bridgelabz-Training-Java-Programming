
import java.util.function.Predicate;

public class predicate {
    public static void main(String[] args) {
        
 Predicate<Integer> p = n -> n%2 == 0;
 //test - return true or false;
 System.out.println(p.test(2));
 System.out.println(p.test(5));


 //and()
 Predicate<Integer> p2 = n -> n>12;
 System.out.println(p.and(p2));



    }
    
}
