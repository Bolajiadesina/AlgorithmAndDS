package play;

public class RemoveDuplicate {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
    
    public static void main(String[] args) {
       int [] nums = {1, 1, 2};
       System.out.println(removeDuplicates(nums));
    }
    
}
