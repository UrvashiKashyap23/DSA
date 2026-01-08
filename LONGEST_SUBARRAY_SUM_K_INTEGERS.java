//
import java.util.HashMap;
public class LONGEST_SUBARRAY_SUM_K_INTEGERS {
    public static int subarray(int arr[] ,int k) {
        int sum = 0; 
        int maxlen = 0;
        HashMap<Integer,Integer>Map = new HashMap<>();
        for(int i = 0 ; i< arr.length ; i++){
            sum = sum+arr[i];
            if (sum==k) {
                maxlen = i+1;
            }
            if(Map.containsKey(sum-k)){
                int length = i-Map.get(sum-k);
                maxlen=Math.max(maxlen,length);
            }
            if(!Map.containsKey(sum-k)){
               Map.put(sum,i);
            }
        }
        return maxlen;
        
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, -1, 1, 1, 1};
        int k = 3;
        for(int j = 0 ; j<arr.length ; j++){
            System.out.print(arr[j]+ " ");
         }
         System.out.println();
         int res = subarray(arr, k);
        System.out.println("THE LONGEST SUBARRAY's LENGTH IS "+res+" WHOSE SUM IS "+ k);

    }
}
