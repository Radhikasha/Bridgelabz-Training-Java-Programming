

public class a {

    static void display(){
        System.out.println("This is a static method");
    }

    void show(){
        System.out.println("This is a non static method");
    }
    
}

class b extends a{
  static void display(){
        System.out.println("This is a child class method");
    }

    void print(){
        System.out.println("This is also non static method");
    }
}
 class c{
    public static void main(String[] args) {
        // a be = new a();  // 
        // be.display();

   
    a parent =new  b();
    parent.display();        //---->



    

        // be.show();
        // b  d = new b();
        // d.display();
        // d.print();
    }
 }
