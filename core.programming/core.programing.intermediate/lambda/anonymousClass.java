public interface car{
    public abstract void print();
}



public class anonymousClass {

    public static void main(String[] args) {
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
    }
    
}
