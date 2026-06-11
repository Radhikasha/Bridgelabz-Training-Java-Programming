package abstraction;

abstract class vehicle {
    abstract  void start();
    void fuel(){
        System.out.println("vehicle needs fuel");
    }
    
}

class car extends vehicle{
    void start(){
        System.out.println("car start using the key");
    }
}
class bike extends vehicle{
    void start(){
        System.out.println("bike start using key and also from kick");
    }
}
public class execute{
    public static void main(String[] args) {
        vehicle v = new car();
        vehicle v1 = new bike();

        v.start();
        v1.start();
        v.fuel();
        v1.fuel();

    }
}
