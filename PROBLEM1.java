//QUICK SORT : ADVANCED SORTING 
public class PROBLEM1 {
    public static int partition(int arr[], int low , int high) {
        int pivot = arr[high];
        int i = low - 1 ;
        for(int j = low ; j < high ; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void quicksort(int arr[] , int low , int high) {
        if(low < high){
        int pidx = partition(arr,low, high);
        quicksort(arr, 0, pidx-1);
        quicksort(arr, pidx+1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,45,9,86,33,17};
        int n = arr.length;
        System.out.println("UNSORTED ARRAY");
        for(int i = 0 ; i<arr.length ; i++){
             System.out.print(arr[i]+ " ");  
        }
        System.out.println();
        quicksort(arr, 0, n-1);
        System.out.println("SORTED ARRAY ");
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
