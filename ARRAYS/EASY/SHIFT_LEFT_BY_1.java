public class SHIFT_LEFT_BY_1 {
    public static void main(String[] args) {
         int arr[] = {10,14,34,66,67,88,90,108};
        int n = arr.length;
        System.out.println("GIVEN ARRAY:");
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
        int temp = arr[0];
        for(int i = 0 ; i<n-1 ; i++){
            arr[i]=arr[i+1];
        }
        arr[n-1] = temp;
        System.out.println();
        System.out.println("ROTATED ARRAY:");
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
