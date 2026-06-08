
import java.util.function.Supplier;

class elephant{

    public elephant() {
        System.out.println("hyy this is elephant class");
    }
    
}



public class constructor {

    public static void main(String[] args) {

        Supplier<elephant> s = elephant :: new;
        s.get();
        
    }
    
}
