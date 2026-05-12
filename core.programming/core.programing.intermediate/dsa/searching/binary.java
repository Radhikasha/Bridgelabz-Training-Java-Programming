
package searching;

class binary{
    public static void main(String []args){
        int arr[] = {10,20,30,40,50,60,70};
        int low = 0;
        int tar = 60;
        int high = arr.length-1;
        while(low <= high){

            int mid = (low + high) /2;
            if(arr[mid] == tar){
                System.out.println(mid);
                break;
            }
            else if(arr[mid] < tar){
                low = mid + 1;
            }
            else{
                  high = mid -1;
            }

        }


    }

}