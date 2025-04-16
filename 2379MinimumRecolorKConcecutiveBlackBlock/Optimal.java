import java.lang.Math;
public class Main{
    public static void main(String[] args){
        String set = "WBBWWBBWBW";
        int k = 7;
        System.out.println(blackBlock(set,k));
    }
    public static int blackBlock(String set,int k){
            int count = 0;
            int min = Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            if(set.charAt(i)=='W'){
                count++;
            }
        }
        min = count;
        for(int i=k;i<set.length();i++){
            if(set.charAt(i-k)=='W'){
                count--;
            }
            if(set.charAt(i)=='W'){
                count++;
            }
            min = Math.min(min,count);
        }
        return min;
    }
}