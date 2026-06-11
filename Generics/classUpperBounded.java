class execute<T extends A>{

    T a;

     execute(T a) {
        this.a =a;
    }

    

    void run(){
        a.run();
    }
    
}
class A{
    void run(){
        System.out.println("Inside class A");
    }
}
class B extends A{
    void run(){
        System.out.println("Inside class B");
    }
}

class C extends A{
    void run(){
        System.out.println("Inside class C");
    }

}
public class classUpperBounded {
    public static void main(String[] args) {

        execute<A> a = new execute<>(new A());
        a.run();
        execute<B> b = new execute<>(new B());
        b.run();
        execute<C> c = new execute<>(new C());
        c.run();
        
    }
    
}
