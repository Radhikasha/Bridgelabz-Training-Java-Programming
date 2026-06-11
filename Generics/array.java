public class array {

    public static  void display(int []arr){
       // for(int i: arr){
            System.out.println("i");
        //}

    }
    public static <T> void display(T []arr){
        for(T i : arr){
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        int arr[] = {1,24,4,2,1};
        display(arr);
    }
    
}
