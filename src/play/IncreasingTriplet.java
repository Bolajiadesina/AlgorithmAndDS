package play;

public class IncreasingTriplet {
    public static boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        System.out.println(first);
        System.out.println(second);
        System.out.println("=================");
        
        for (int num : nums) {
            System.out.println("num=="+num);
            if (num <= first) {
                first = num;  
                System.out.println("first=="+first);       // update the smallest element
            } else if (num <= second) {
                second = num;  
                System.out.println("second=="+second);      // update the second smallest element
            } else {
                return true;         // found a number larger than both
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        // int[] input = { 1, 2, 3, 4, 5 };
        // System.out.println(increasingTriplet(input));

        // int[] input2 = {5, 4, 3, 2, 1};
        // System.out.println(increasingTriplet(input2));  // false
        
        int[] input3 = {2, 1, 5, 0, 4, 6};
        System.out.println(increasingTriplet(input3)); 
    }

}
