package review;

public class overloading {
    
        void dog(){
            System.out.println("This is a dog");
        }
        void dog(String a){
            System.out.println("My dog name is: "+a);
        }

    

    
}
class rev{
    public static void main(String[] args) {
        overloading b = new overloading();
        b.dog();
        b.dog("pluto");
        
    }
}
