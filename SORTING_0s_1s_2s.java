public class SORTING_0s_1s_2s {
    public static void main(String[] args) {
        int arr[] = {2,0,1,0,2};
        sorted(arr);
        for(int j = 0 ; j<arr.length ; j++){
            System.out.print(arr[j]+ " ");
        }
        
    }
    public static void sorted(int arr[]) {
        int low = 0;
        int high = arr.length - 1 ;
        int mid = 0 ;
        while(mid<=high){
            if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
            }
            else{
                if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            }
               else{
                mid++;
            }
        }
    }
    }
    public static void swap(int arr[] , int i,int j) {
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
     }
}
