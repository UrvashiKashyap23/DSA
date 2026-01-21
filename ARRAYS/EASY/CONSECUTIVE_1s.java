public class CONSECUTIVE_1s {
    public static void main(String[] args) {
        int arr []={1,1,0,1,1,1,1,0,1,1,1};
        for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int res = find(arr);
        System.out.println("MAX NO OF 1s are " + res);
    }
    public static int find(int arr[]){
        int temp = 0 ;
        int count = 0;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]==1){
                temp++;
    
            }
            else{
                temp = 0;
            }
            if(temp>count){
                count = temp;
            }
        }
        return count;
    }
}
