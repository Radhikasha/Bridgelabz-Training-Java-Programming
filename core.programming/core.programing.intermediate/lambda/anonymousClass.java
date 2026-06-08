public interface car{
    public abstract void print();
}
class exa implements car{
    public void print(){
        System.out.println("using class");

    }
}



public class anonymousClass {

    public static void main(String[] args) {

        // using normal method
     exa e = new exa();
     e.print();

        // anonymous class 
        car c = new car(){
            public void print(){
                System.out.println("Anonymous class");
            }
           };

           c.print();



        car c2 = new car() {
            public void print(){
                System.out.println("2 method of anonymous class");
            }
        };
        c2.print();

// using lambda 
      car c3 = ()->{
        System.out.println("This is using lambda ");
      };
      c3.print();


    }
    
}
