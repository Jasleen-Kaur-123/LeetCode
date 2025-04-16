import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        int[] nums = {1,2,30};
        System.out.println(containDuplicate(nums));
    }
    public static boolean containDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) return true;
        }
        return false;
    }
}