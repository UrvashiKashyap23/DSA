public class MOVING_0s_AT_END {
    public static void main(String[] args) {
        int arr[] = {10,0,30,0,0,40};
        int n = arr.length;
        moving(arr , n);
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void moving(int arr[], int n) {
    int index = 0;

    for (int i = 0; i < n; i++) {
        if (arr[i] != 0) {
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            index++;
        }
    }
}

}
