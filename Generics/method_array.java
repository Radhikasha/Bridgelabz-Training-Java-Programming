public class method_array {


    static <R> void display(R []arr){
        for(R i : arr){
            System.out.print(i+" ");
            


        }


    }

    public static void main(String[] args) {
        Integer []arr = {1,32,5,5,3,2,3};
        Double []arr2 = {3.5,3.6,2.6,2.4,2.4,2.4};
        Character []arr3 = {'H','T','D','J'};
        String []arr4 = {"aas","assds","adsf","Dasfdfg"};
          System.out.println("Integer");
        display(arr);
        System.out.println();
        System.out.println("Double");
        display(arr2);
        System.out.println();
        System.out.println("Character");
        display(arr3);
        System.out.println();
        System.out.println("String");
        display(arr4);
        

    }
    
}
