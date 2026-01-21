import java.util.*;
public class LINEAR_SEARCH {
    public static void main(String[] args) {
        int arr[] = {19,38,03,73,1,28,77};
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER TO BE SEARCHED:");
        int num = sc.nextInt();
        int x = Linear_search(arr,num);
        if(x==-1){
            System.out.println("ELEMENT NOT FOUND!!!");
        }
        else{
            System.out.println("ELEMENT FOUND AT INDEX "+x);
        }

    }
    public static int Linear_search(int arr[],int num) {
        for (int i = 0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
        
    }
}
