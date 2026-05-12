package sorting;

public class merge {

   static void conquer(int arr[],int left, int mid, int right){

    int n1 = mid - left +1;
    int n2 = right - mid;

    int l[] = new int[n1];
    int r[] = new int[n2];

    for(int i=0;i<n1;i++){
        l[i] = arr[left + i];
    }

    for(int j=0;j<n2;j++){
        r[j] = arr[mid +j +1];
    }

    int i=0 , j=0, k = left;
    while(i < n1 && j < n2){
        if(l[i] <= r[j]){
            arr[k] = l[i];
            i++;
        }
        else{
            arr[k] = r[j];
            j++;
        }
        k++;
    }
    while(i < n1){
        arr[k] = l[i];
        i++;
        k++;
    }
    while(j < n2){
        arr[k] = r[j];
        j++;
        k++;
    }


   }



static void divide(int arr[], int left, int right){
    
    if(left < right){
        int mid = (left + right)/2;

        divide(arr,left,mid);
        divide(arr,mid+1,right);
        conquer(arr,left,mid,right);

    }
}

    public static void main(String[] args) {
        int arr[] = {5,3,8,1};
        divide(arr,0,arr.length-1);

        for(int i : arr){
            System.out.println(i);
        }
        
    }
    
}
