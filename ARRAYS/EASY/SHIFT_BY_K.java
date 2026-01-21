public class SHIFT_BY_K {
    public static void reverse(int arr[] , int start , int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static int[] rotate_array(int arr[] , int k , String direction) {
        int n =arr.length;
        if(n==0||k==0){
            return arr;
        }
        k=k%n;
        if(direction.equals("right")){
            reverse(arr, 0, n-1);
            reverse(arr, 0, k-1);
            reverse(arr, k, n-1);
        }
        if(direction.equals("left")){
             reverse(arr, 0, k-1);
             reverse(arr, k, n-1);
              reverse(arr, 0, n-1);
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        rotate_array(arr, 2, "left");
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}



