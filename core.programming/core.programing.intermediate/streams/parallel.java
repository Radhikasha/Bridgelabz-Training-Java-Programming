import java.util.Arrays;
import java.util.List;


public class parallel{
    public static void main(String []args){


 List<String> list = Arrays.asList("aashu","garima","devanshi","preeti","chanchal");

// parallel
System.out.println("parallel() method");
list.stream().parallel().forEach(n -> System.out.println(n));

System.out.println("now parallelStream() method");

list.parallelStream().forEach(n -> System.out.println(n));



    }
}

