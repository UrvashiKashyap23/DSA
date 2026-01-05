public class LARGEST_ELEMENT {
    public static void main(String[] args) {
        int arr[] = {22,89,0,13,72,222};
        int n = arr.length;
        System.out.println("THE LARGEST ELEMENT IS:"+largest(arr,n));
    }
    public static int largest(int arr[],int n) {
        int max = arr[0];
        for(int i = 0 ; i<n ; i++){
            if(arr[i]>arr[0]){
                max = arr[i];
            }
        }
        return max;
    
    }
}
