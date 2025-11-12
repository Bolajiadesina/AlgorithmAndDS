package play;

public class ProductOfNumArray {
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        int product = 1;
        int zeroCount = 0;
        int zeroIndex = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                zeroCount++;
                zeroIndex = i;
            } else {
                product *= nums[i];
            }

        }

        if (zeroCount > 1) {
            // If there are more than one zeros, all answers are zero
            return answer;
        } else if (zeroCount == 1) {
            // If there is exactly one zero, set answer[zeroIndex] to product and others to
            // zero
            answer[zeroIndex] = product;
            return answer;
        } else {
            // If no zeros, use the division method
            for (int i = 0; i < nums.length; i++) {
                answer[i] = product / nums[i];
            }
            return answer;
        }

    }

    public static void main(String[] args) {
        int[] nums = { -1, 1, 0, -3, 3 };// { 1, 2, 3, 4 };
        productExceptSelf(nums);
    }
    // 07961635893- faz
}
