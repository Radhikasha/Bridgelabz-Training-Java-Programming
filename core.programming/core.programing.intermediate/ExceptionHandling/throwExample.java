public class throwExample {


    public static void fun(){
        try {
            
            throw new NullPointerException();
        } catch (NullPointerException e) {

            System.out.println("Error:Occur in fun() Exception occur: "+e);
            throw e;
        }
    }




    public static void main(String[] args) {
           try {
               fun();
           } catch (NullPointerException e) {


              System.out.println("Error: Occur in main method  Exception occur: "+e);
           }
        
    }


    
    
}
