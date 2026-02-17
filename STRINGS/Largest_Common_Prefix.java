public class Largest_Common_Prefix {
    public static void main(String[] args) {
        String str[] = {"flower","flow,","fly"};
        System.out.println(ans(str));
    }
    public static String ans(String str[]){
        if(str.length==0||str==null){
            return " ";
        }
        String first = str[0];
        for(int i = 0 ; i<first.length() ; i++){
            char curr = first.charAt(i);
            for(int j = 1 ; j<str.length ; j++){
                if(i>=str[j].length() || str[j].charAt(i)!=curr){
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }
}
