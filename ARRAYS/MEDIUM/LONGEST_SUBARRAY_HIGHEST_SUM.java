
public class LONGEST_SUBARRAY_HIGHEST_SUM {
    public static void main(String[] args) {
        int arr[] = {-2,-3,-7,-2,-10,-4,1};
        System.out.println(sum(arr));
    }
    public static int sum(int arr[]){
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i<arr.length ; i++){
            sum = sum+arr[i];
            if(sum>maxi){
                maxi = Math.max(maxi,sum);
            }
            if(sum<0){
                sum=0;
            }    
        }
        return maxi;
    }
}
