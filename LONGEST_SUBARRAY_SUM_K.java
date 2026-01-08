//WE USE THE TECHNIQUES OF SLIDING WINDOW CONSIDERING THAT ARRAY ONLUY CONTAINS THE POSITIVE NUMBERS
public class LONGEST_SUBARRAY_SUM_K {
    public static int subarray(int arr[] , int k){
        int left = 0;
        int sum = 0; //IT CALCULATES OUR PREFIX SUM
        int maxlen = 0;
        for(int right = 0 ; right<arr.length ; right++){
            sum+=arr[right];
            if(sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                int length = right-left+1;
                maxlen = Math.max(length , maxlen);
            }

        }
        return maxlen;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 1, 1};
         int k = 3;
         for(int j = 0 ; j<arr.length ; j++){
            System.out.print(arr[j]+ " ");
         }
         System.out.println();
         int res = subarray(arr, k);
        System.out.println("THE LONGEST SUBARRAY's LENGTH IS "+res+" WHOSE SUM IS "+k);

    }
    

}
