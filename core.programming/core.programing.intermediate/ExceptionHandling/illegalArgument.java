public class illegalArgument {

    public static void setAge(int i){
        if(i <= 0){
            throw new IllegalArgumentException();
        }
        System.out.println("Your age is good");
    }
    





    public static void main(String[] args) {
     try {

        setAge(-2);
         
     } catch (IllegalArgumentException e) {
        System.out.println("Error: your age is not valid. Exception Caught: "+e);
     }    
    
    
    
    
    }
    
}
