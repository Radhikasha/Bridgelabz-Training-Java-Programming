public class throwsExample {

    public static void age(int i) throws ArithmeticException{

        if(i <= 0){

            throw new ArithmeticException("AGE not valid");

            
        }

    }



    public static void main(String[] args) {
        try {
            age(-1);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error occur: "+e);
        }
    }
    
}
