public class classCast {

    public static void main(String[] args) {
        try {
            Object data = 10;

            String s = (String) data;

            System.out.println(s);
            
        } catch (ClassCastException e) {
            System.out.println("Error: you cast an object to wrong type. Exception occur: " +e);
        } 
    }
    
}
