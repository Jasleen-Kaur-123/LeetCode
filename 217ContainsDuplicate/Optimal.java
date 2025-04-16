import java.util.HashSet;
public class Main{
    public static void main(String[] args){
        int[] nums = {1,4,7,8,8,6,3};
        System.out.println(containDuplicate(nums));
    }
    public static boolean containDuplicate(int[] nums){
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}