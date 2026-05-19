
import java.util.*;

public class collectionInterface {

    public static void main(String[] args) {
        Collection<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("mango");
        fruits.add("grapes");
        fruits.add("banana");
        System.out.println("show items in collection");
        for(String i : fruits){
            System.out.println(i);
        }

        fruits.remove("apple");
         System.out.println("After removing apple  in collection");
        for(String i : fruits){
            System.out.println(i);
        }

        fruits.clear();
         System.out.println("use clear in collection");
        for(String i : fruits){
            System.out.println(i);
        }

    }
    
}
