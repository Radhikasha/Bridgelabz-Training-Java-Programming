package hybrid;


class person{
    String name;
    int id;

    public person(String name,int id) {
        this.name = name;
        this.id = id;
    }
    

}
interface worker{
   public void performDuties();
}

class chef extends person implements worker{

            public chef(String name, int id) {
                super(name,id);
            }

          public  void performDuties(){
                System.out.println("it perform duty of cooking");
            }
    

}
class waiter extends person implements  worker{

            public waiter(String name, int id) {
                super(name,id);
            }
         public   void performDuties(){
                System.out.println("it serves customers");
            }
    

}


public class restaurent {
    public static void main(String[] args) {
         chef c = new chef("Radhika", 101);
        waiter w = new waiter("Aman", 102);

        c.performDuties();
        w.performDuties();
        
    }
    
}
