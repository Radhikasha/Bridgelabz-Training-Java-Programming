import java.lang.*;
class depricatedexample{


    @Deprecated(since = "1.8" ,forRemoval= true)
    static  void display(){
        System.out.println("hyy, i am radhika");
    }

    public static void main(String[] args) {
        display();
    }
}
