public class stackOverFlow {

    public static void recursive(){
        recursive();
    }



    public static void main(String[] args) {
        try {
            System.out.println("Recursive function call without base condition");
            recursive();
            
        } 
        catch (StackOverflowError e) {
            System.out.println("Error: Invalid base condition. exception occurs: "+e);
        }
    }
    
}
