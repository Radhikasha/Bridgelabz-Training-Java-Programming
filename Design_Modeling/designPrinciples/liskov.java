class animal{
    void print(){
        System.out.println("Animal");
    }
}
class dog extends animal{
    void print(){
        System.out.println("bark");
    }
}




public class liskov {
    public static void main(String[] args) {
        animal a = new dog();
        a.print();
    }
    
}
