public class Rotate_String {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
       System.out.println(solution(s, goal)); 
    }
    public static boolean solution(String s , String goal){
        if(s.length()!=goal.length()){
            return false;
        }
        String doubleS = s+s;
        return doubleS.contains(goal);
    }
}
