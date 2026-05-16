class book<T,U>{

    T i;
    T j;

    book(T i, T j) {
        this.i = i;
        this.j = j;
    }
    public void print(){
        System.out.println("Integer type: "+i);
        System.out.println("String type: "+j);

    }
    
}



 public class multiple {
    public static void main(String[] args) {
        book<Integer,String> s = new book(12, "radhika");
        s.print();
    }
    
}
