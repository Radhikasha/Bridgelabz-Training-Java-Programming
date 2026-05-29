


@FunctionalInterface
interface lambda{
    void show();
} 
public class functionalinterface {
    public static void main(String[] args) {

        lambda o = () ->{
            System.out.println("hello");
        };
        o.show();
        
    }
    
}
