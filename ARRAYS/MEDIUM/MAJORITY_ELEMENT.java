package ARRAYS.MEDIUM;
import java.util.HashMap;

public class MAJORITY_ELEMENT {
    public static void main(String[] args) {
        int arr[] = {2,10,10,3,10,10};
        int n = arr.length;
       System.out.println("MAJORITY ELEMENT IS:" + majority_element(arr, n)); 

    }
    public static int majority_element(int arr[] , int n) {
        // int count=0;                            // bruteforce approach
                                                   //Time : O(n^2)
        // for(int i  = 0 ; i<n ; i++){
        //       for(int j= 0 ; j<n ; j++){
        //         if(arr[j]==arr[i]){
        //             count++;
        //         }
        //       }
        //     if(count>n/2){
        //         return arr[i];
        //     }
        // }
        // return -1;
        // HashMap<Integer,Integer>map = new HashMap<>();      //better approach
        // for(int i  = 0 ; i<n ; i++){                        //time: O(n) & space:O(n)
        //     if(!map.containsKey(arr[i])){
        //         map.put(arr[i], 1);
        //     }
        //     else{
        //         map.put(arr[i],map.get(arr[i]+1);
        //     }
        //     if(map.get(arr[i])>n/2){
        //         return arr[i];
        //     }
        // }
        // return-1;
        int count = 0 ;
        int element = 0;
        for(int i = 0 ; i<n ; i++){
            if(count==0){
                element = arr[i];
                count++;
            }
            else{
                if(arr[i]==element){
                   count ++;
                }
                else{
                    count--;
                                }
            }
        }
        int count2 = 0;
        for(int i = 0 ; i<n ; i++){
             if(arr[i]==element){
                count2++;
            }
        }
        if(count2>n/2){
            return element;
        }
        return -1;
    }
}
