import java.util.Stack;
public class Main{
    public static void main(String[] args){
        String stat = "([])";
        System.out.println(valid(stat));
    }
    public static boolean valid(String stat){
        Stack<Character> set = new Stack<>();
        for(int i=0;i<stat.length();i++){
        char el = stat.charAt(i);
            if(el == '[' || el == '{' || el == '('){
                set.push(el);
            }
            else{
                if(set.isEmpty()) return false;
                char top = set.pop();
                    if( (el == '[' && top != ']') ||
                        (el == '{' && top != '}') ||
                        (el == '(' && top != ')'))
                        {
                            return false;
                        }
                }
           }
        return set.isEmpty();
    }
}