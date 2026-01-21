package ARRAYS.MEDIUM;
import java.util.HashMap;

public class TWO_SUM {

    public static boolean sum(int arr[] , int target) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0 ;i<arr.length ; i++){
            int num = target - arr[i];
            
            if(map.containsKey(num)){
                return true;
            }
            map.put(arr[i], i);
        }
        
        return false;
        
    }
    public static void main(String[] args) {
        int arr[] = {4,7,1,9};
        int target = 4;
        boolean res = sum(arr,target);
        System.out.println(res);
    }
}