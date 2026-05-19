import java.util.*;

public class iterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> a = list.iterator();
        while(a.hasNext()){
            int b = a.next();
            System.out.println(b);
        }
    }
    
}
