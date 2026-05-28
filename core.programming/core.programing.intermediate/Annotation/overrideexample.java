class animal{
    void display(){
        System.out.println("animal");
    }
}

class dog extends animal{
    @Override
    void Display(){
        System.out.println("dog");
    }
}

public class overrideexample {
    public static void main(String[] args) {
        animal a = new dog();
        a.display();
    }
    
}
