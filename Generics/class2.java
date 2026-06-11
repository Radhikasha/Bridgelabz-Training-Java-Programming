class user<T>{
    private T t;

     
    public void add(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
}




public class class2 {
    public static void main(String[] args) {
        user<Integer> i = new user<Integer>();
        user<String> s = new user<String>();

        i.add(12);
        System.out.println(i.get());
        i.add(new Integer(10));
        System.out.println(i.get());
        s.add(new String("muni"));
        System.out.println(s.get());
        s.add("aashu");
        
        System.out.println(s.get());

    }
    
}
