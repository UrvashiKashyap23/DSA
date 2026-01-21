public class Second_LARGEST {
    public static void main(String[] args) {
        int arr[] = {10,8,55,94,31,62};
        int n = arr.length;
        System.out.println("2nd LARGEST ELEMENT : " + Second_Largest(arr,n));
        System.out.println("2nd SMALLEST ELEMENT : " + Second_smallest(arr,n));
    }
    public static int Second_Largest(int arr[] , int n) {
        if(n<2){
            return -1;
        }
        int Largest = Integer.MIN_VALUE;
        int Second_Large = Integer.MIN_VALUE;
        for(int i = 0 ; i<n ; i++){
            if(arr[i]>Largest){
                Second_Large=Largest;
                Largest = arr[i];
            }
            else {
                if(arr[i]>Second_Large && arr[i]<Largest){
                Second_Large = arr[i];
            }
            }
        }
        return Second_Large;
    }

    public static int Second_smallest(int arr[] , int n) {
        int smallest = Integer.MAX_VALUE;
        int Second_Small = Integer.MAX_VALUE;
        if(n<2){
            return -1;
        }
        for(int i = 0 ; i<n ; i++){
            if(arr[i]<smallest) {
                Second_Small = smallest;
                smallest = arr[i];
            }
            else if(arr[i]<Second_Small && arr[i]>smallest){
                Second_Small = arr[i];
            }
        }
        return Second_Small;
    }
}
