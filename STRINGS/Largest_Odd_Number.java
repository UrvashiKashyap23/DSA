public class Largest_Odd_Number {
    public static void main(String[] args) {
        String str = "27198";
        String ans = Sol(str);
        System.out.println(ans);
    }
     static String Sol(String str){
        for(int i = str.length()-1 ; i>=0 ; i--){
            if(str.charAt(i)%2!=0){
                String str2 = str.substring(0,i+1);
                return str2;
            }
        }
        return " ";

    }
}
