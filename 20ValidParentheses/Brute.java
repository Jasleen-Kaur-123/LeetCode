public class Main{
    public static void main(String[] args){
        String s = "()]";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        int len = -1;
        while (len != s.length()) {
            len = s.length();
            s = s.replace("()", "")
                .replace("{}", "")
                .replace("[]", "");
        }
        return s.isEmpty();
    } 
}