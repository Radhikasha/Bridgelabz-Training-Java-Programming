class exe<T extends  A & B & C>{
        T a;

    public exe(T a) {
        this.a = a;
    }
    void run(){
        a.run();
    }
        

}
class A implements B , C{
   public void run(){
        System.out.println("    Inside A");
    }

}
interface B{

   public void run();
}
interface C{
   public void run();

}


public class multipleBound {
    public static void main(String[] args) {
        exe<A> i = new exe<>(new A());
        i.run();
        
    }
    
}
