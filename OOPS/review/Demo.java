



public class Demo {
    
    {
        System.out.println("instant method");
    }

    static {
        System.out.println("static block!!");
    }     

    Demo(){
        System.out.print("Demo const");
    }

    static void print(){
        System.out.println("static method");
    } 


    void display(){
        System.out.println("non static method");
    }

    public static void main(String[] args) {
        
        print();    //----> 1)SB 2)SM 3) insta 4) const 5) Display   //---> 
        Demo dm = new Demo();    //-----> Dinesh 1) SB 2) insta b 3)Demo const )  //
        dm.display();          
                       //---> 1)SB 2)Instat 3) Cons 4) print 5) Display 

    }
}
