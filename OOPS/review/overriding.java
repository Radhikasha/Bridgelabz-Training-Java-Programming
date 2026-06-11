package review;

public class overriding {
    void animal(){
        System.out.println("This is dog");
    }

    
}
class cat extends overriding{
    void animal(){
        System.out.println("This is cat");
    }
}
class exe{
    public static void main(String[] args) {
        cat c = new cat();
        overriding o = new overriding();
        c.animal();
        o.animal();
    }
}
