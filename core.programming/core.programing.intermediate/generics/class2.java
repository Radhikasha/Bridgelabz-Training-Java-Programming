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
        s.add("aashu");
        System.out.println(i.get());
        System.out.println(s.get());

    }
    
}
