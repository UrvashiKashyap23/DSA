public class LONGEST_SUBARRAY_HIGHEST_SUM_ARRAY {
    public static void main(String[] args) {
        int arr[] = {-2,-3,-7,2,10,-4,-1};
        sum(arr);
    }
    public static void sum(int arr[]){
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        int tempstart=0;
        int start = 0;
        int end = 0;
        for(int i = 0 ; i<arr.length ; i++){
            sum+=arr[i];
            if(sum>maxi){
                maxi=sum;
                start=tempstart;
                end = i;
            }
            if(sum<0){
                sum=0;
                tempstart = i+1;
            }
        }
        System.out.println(maxi);
        for(int i = start ; i<=end ; i++){
            System.out.print(arr[i]+" ");
        }
    
    }
}

