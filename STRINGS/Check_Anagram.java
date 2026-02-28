import java.util.HashMap;
public class Check_Anagram{
    public static void main(String[] args) {
        String s1 = "abb";
        String s2 = "bab";
        System.out.println(solution(s1,s2));
    }
    public static boolean solution(String s1,String s2){
          if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0 ; i<s1.length() ; i++){
            char ch = s1.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                int count = map.get(ch);
                count=count+1;
                map.put(ch,count);
            }
        }
        for(int i=0 ; i<s2.length() ; i++){
            char ch = s1.charAt(i);
            if(!map.containsKey(ch)){
               return false;
            }
            int currentcount=map.get(ch);
            currentcount=currentcount-1;
            if(currentcount<0){
                return false;
            }
            map.put(ch,currentcount);
        }
        return true;
    }
}