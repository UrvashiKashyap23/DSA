public class CHECK_ARRAY_SORTED {
    public static void main(String[] args){
        int arr[] ={10,46,54,65,70};
        int n = arr.length;
        boolean x = check_array(arr, n);
        if(x==true){
            System.out.println("Given array is sorted");
        }
        else{
            System.out.println("Given array is not sorted");
        }
    }
    public static boolean check_array(int arr[],int n){
        if(n==0 || n==1){
            return true;
        }
        for(int i = 1 ; i<n ; i++){
            int j = i-1;
            if(arr[i]<arr[j]){
                return false;
            }
        }
        return true;
    }
}
