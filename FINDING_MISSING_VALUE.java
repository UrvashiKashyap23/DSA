public class FINDING_MISSING_VALUE {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6 };
        int N = 6;
    //     for (int i = 0; i < arr.length; i++) {    //this is better appraoch
    //          System.out.print(arr[i]+ " ");
    //     }
    //     System.out.println();
    //     int result = missing(arr, N);
    //     System.out.println("MISSING NO IS " + result);
    // }
    // public static int missing(int[] arr, int N) {
    //     int sum = N * (N + 1) / 2;
    //     int s = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         s = s + arr[i];
    //     }
    //     int missing = sum - s;
    //     return missing;
    
    int xor1 = 0;                    //this is optimal approach
    for(int i = 1 ; i<=N ; i++ ){
        xor1 = xor1^i;
    }
     int xor2 = 0;
    for(int i = 0 ; i<arr.length ; i++ ){
        xor2 = xor2^arr[i];
    }
    int res = xor1^xor2;
    System.out.println("MISSING NO. IS "+ res);
    }

}
