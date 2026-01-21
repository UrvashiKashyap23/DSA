public class UNION_OF_ARRAY {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5};
        int b[] ={2,3,3,4,8,10};
        int sol[] = union(a, b);
        for(int i = 0 ; i<sol.length ; i++){
            System.out.print(sol[i]+" ");
        }
    }
    public static int[] union(int a[] , int b[]) {
        int n = a.length ;
        int m = b.length;
        int union[] =new int[n+m];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(a[i]<b[j]){
                if(k==0 || union[k-1]!=a[i])
                    union[k]=a[i];
                 k++;
                 i++;
                
            }
            else if(a[i]>b[j]){
                if(k==0 || union[k-1]!=b[j])
                    union[k++]=b[j];
                j++;
                
            }
            else{
                union[k++]=a[i];
            i++;
            j++;
            }
        }
        while(i<n){
            if(union[k-1]!=a[i]){
                 union[k++]=a[i];

             i++;
            }
        }
        while(j<m){
            if(union[k-1]!=b[j]){
                 union[k++]=b[j];
            j++;
            }
        }
        int result[] = new int[k];
        for (int x =0 ; x<k ; x++){
            result[x]=union[x];
        }
        return result;
    }
}
