package sorting;

public class quick {

    static int partition(int arr[],int low,int high){

        int pivot = arr[high];
        int i = low-1;

        for(int j=low;j<high;j++){

            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i  + 1;


    }
       

    static void divide(int arr[],int low,int high){

        if(low < high){
        int pi = partition(arr,low,high);
        divide(arr,low,pi-1);
        divide(arr,pi+1,high);

        }
    }


    public static void main(String[] args) {
        int arr[] = {5,3,8,1};
        divide(arr,0,arr.length-1);

        for(int i: arr){
            System.out.println(i);
        }
    }
    
}
