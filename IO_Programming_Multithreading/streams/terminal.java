import  java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class terminal {

    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("mango","apple","banana","muskmelon");
        //collect
        List<String> ans = list.stream().filter(e -> e.startsWith("m")).collect(Collectors.toList());
System.out.println(ans);

      // foreach
      list.stream().forEach(System.out::println);

      // count
      System.out.println(list.stream().count());

      // findfirst
      System.out.println(list.stream().findFirst());

      //allMacth
      boolean b = list.stream().allMatch(e -> e.startsWith("m"));
      System.out.println(b);

        boolean b1 = ans.stream().allMatch(e -> e.startsWith("m"));
      System.out.println(b1);


      // anymatch
        boolean b3 = list.stream().anyMatch(e -> e.startsWith("a"));
      System.out.println(b3);

      //reduce
      System.out.println(list.stream().reduce((a,c)-> a.length() > c.length() ? a : c));

    }
    
}
