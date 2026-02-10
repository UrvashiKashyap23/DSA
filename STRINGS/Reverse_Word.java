

public class Reverse_Word {
    public static void main(String[] args) {
        String str = "Hello World";
        String[]res = str.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i = res.length-1; i>=0 ; i-- ){
            ans.append(res[i]);
            if(i!=0){
            ans.append(" ");
        }
        }
        System.out.println(ans.toString());
    }
}
