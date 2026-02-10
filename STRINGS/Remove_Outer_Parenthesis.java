public class Remove_Outer_Parenthesis {
    public static void main(String[] args) {
        String str =  "()(()())(())";
        int depth = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
           char  ch = str.charAt(i);
           if(ch == '('){
              if(depth>0){
                res.append(ch);
              }
              depth++;
           }
           else{
            depth--;
            if(depth>0){
                res.append(ch);
              }
           }
           
        }
        System.out.println(res.toString());   }

}
