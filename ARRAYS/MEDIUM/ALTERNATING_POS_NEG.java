public class ALTERNATING_POS_NEG{
    public static void main(String[] args) {
        int arr[] = {10,20,90,-30,-40,-60};
        updatedArray(arr);

    }
    public static void updatedArray(int arr[]) {
        // int n = arr.length;        //bruteforce approach
        // int pos[] = new int[n/2];
        // int neg[] = new int[n/2];
        // int p = 0;
        // int q = 0;
        // for(int i = 0 ; i<arr.length ; i++){
        //     if(arr[i]>0){
        //        pos[p]=arr[i];
        //        p++;
        //     }
        //     else{
        //         neg[q]=arr[i];
        //         q++;
        //     }
        // }
        // for(int i = 0 ; i<n/2 ; i++){
        //     arr[2*i]=pos[i];
        //     arr[(2*i) +1]=neg[i];
        // }
        // for(int j = 0 ; j<n ; j++){
        //     System.out.print(arr[j]+ " ");
        // }
        int n = arr.length;
        int pos = 0;
        int neg = 1;
        int ans[] = new int[n];
        for(int i = 0 ; i<n ;i++){
            if(arr[i]>0){
                ans[pos]=arr[i];
                pos=pos+2;
            }
            if(arr[i]<0){
                ans[neg]=arr[i];
                neg=neg+2;
            }
        }
        for(int j = 0 ; j<n ; j++){
            System.out.print(ans[j]+ " ");
        }
    }
}