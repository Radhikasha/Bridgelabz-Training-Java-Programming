class test<T>{
    T obj;

     test(T obj) {
        this.obj = obj;
    }
    public T get(){
        return this.obj;
    }
    
}






public class class1 {
    public static void main(String[] args) {
        test<Integer> t = new test<Integer>(4);
        System.out.println(t.get());

        test<String> s = new test<String>("radhika");
        System.out.println(s.get());
    }
    
}
