public class Main{
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        System.out.println(containDuplicate(nums));
    }
    public static boolean containDuplicate(int[] nums){
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]) return true;
            }
        }
        return false;
    }
}