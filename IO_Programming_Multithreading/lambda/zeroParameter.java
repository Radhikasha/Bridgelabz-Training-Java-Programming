interface cat{
    abstract void display();
}


public class zeroParameter {

    public static void main(String[] args) {

        cat c = ()->{
            System.out.println("This is example of zero parameter lambda expression");
        };
        c.display();
        


    }
    
}
