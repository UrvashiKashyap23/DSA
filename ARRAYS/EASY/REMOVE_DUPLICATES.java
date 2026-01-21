public class REMOVE_DUPLICATES {
    public static void main(String[] args) {
        int arr[] = {10,14,14,34,66,67,88,88,90,108};
        int n = arr.length;
        duplicate(arr, n);
    }
    public static void duplicate(int arr[] , int n ) {
        int k = 1 ;
        for(int i = 1 ; i< n ; i++){
            if(arr[i] !=arr[i-1]){
                arr[k]=arr[i];
                k++;
            }
        }
        for(int i =0 ;i<k ; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
