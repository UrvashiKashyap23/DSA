public class STOCK{
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(calcProfit(arr));
    }
    public static int calcProfit(int arr[]) {
        int max_profit = 0;
        int bp = arr[0];
        if(arr==null ||arr.length==0){
            return 0;
        }
        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i]<bp){
                bp=arr[i];
            }
            else{
                int profit = arr[i]-bp;
                if(profit>max_profit){
                    max_profit=profit;
                }
            }
        }
        return max_profit;
    }
}
