public class FINDING_MISSING_VALUE {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6 };
        int N = 6;
        for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int result = missing(arr, N);
        System.out.println("MISSING NO IS " + result);
    }
    public static int missing(int[] arr, int N) {
        int sum = N * (N + 1) / 2;
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        int missing = sum - s;
        return missing;
    }

}
