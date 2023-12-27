package ArrayImplementation;

import java.util.Arrays;
import java.util.logging.Logger;

public class RotateArray {
    /*
     * This implementation rotates array from a certain position
     * For example given { 1, 2, 3, 4, 5, 6, 7 };
     * and the position given is 3
     * 
     * it then becomes
     * 
     * [5, 6, 7, 1, 2, 3, 4]
     */
    Logger logger = Logger.getLogger(getClass().getName());

    private void rotate(int[] nums, int k) {
        /*
         * we need to check if the position is not greater than the lenght of the array
         * because the position will give ArrayOutOfBoundException
         */
        if (k > nums.length) {
            k = k % nums.length;
        }

        /*
         * we need to create a new array with same lenght as the one we have
         */
        int[] result = new int[nums.length];

        for (int i = 0; i < k; i++) {
            /*
             * copying array element from old(num) starting from index k and putting them
             * into the new array
             * result
             */
            result[i] = nums[nums.length - k + i];

            logger.info(Arrays.toString(result));

        }

        int j = 0;
        for (int i = k; i < nums.length; i++) {
            /*
             * finally the remaining array element from old(num) into the new array
             * result
             */
            result[i] = nums[j];
            j++;

            logger.info(Arrays.toString(result));
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
    }

    // public void check() {
    //     String wrd = "madamsar ";
    //     String nwwrd = "";

    //     for (int i = wrd.length() - 1; i >= 0; i--) {
    //         nwwrd = nwwrd + wrd.charAt(i);
    //         System.out.println(nwwrd);
    //     }

    // }

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int kp = 3;

        rotateArray.rotate(arr, kp);
        //rotateArray.check();

    }
}
