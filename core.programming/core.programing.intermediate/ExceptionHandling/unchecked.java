public class unchecked {
    public static void main(String[] args) {
        try {
            
            int a =10;
            int b = 0;
            int res = a / b;
            System.out.println("Result is: "+res);


            
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. Exception caught: " + e);
        }

        try {
            int arr[] = {1,2,2,4,1};
            System.out.println("6th element of array is: "+arr[6]);
            
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: element not found. Exception caught: "+e);
        }


        try {
            String a = null;
            System.out.println(a.length());
        } catch (NullPointerException e) {
            System.out.println("Error: You initalize a null. Exception caught: " + e);
        }
    }
    
}
