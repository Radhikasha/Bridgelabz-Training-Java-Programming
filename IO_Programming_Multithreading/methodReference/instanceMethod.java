
import java.util.Arrays;
import java.util.List;

class printer{
    public void print(String msg){
        System.out.println("Message is: "+msg);
    }
}




public class instanceMethod {

    public static void main(String[] args) {

          List<String> names =
                Arrays.asList("Radhika","Aman","Kiran");


        printer p = new printer();
        names.forEach(p::print);     // names.forEach(name -> d.show(name));
        
    }
    
}
