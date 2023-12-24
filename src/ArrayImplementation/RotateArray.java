package ArrayImplementation;

import java.util.Arrays;
import java.util.logging.Logger;

public class RotateArray {
    Logger logger = Logger.getLogger(getClass().getName());

    private  void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        
            logger.info(Arrays.deepToString(result) );
            
        }

        int j = 0;
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j];
            j++;
          
            logger.info(result.toString());
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
    }

    public static void main(String[] args) {
        RotateArray rotateArray= new RotateArray();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int kp = 3;

        rotateArray.rotate(arr, kp);

    }
}
