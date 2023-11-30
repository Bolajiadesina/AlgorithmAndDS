package play;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {

	/*
	 * Question: Given an array of integers, find two numbers such that they add up
	 * to a specific target number. The function twoSum should return indices of the
	 * two numbers such that they add up to the target, where index1 must be less
	 * than index2. Please note that your returned answers (both index1 and index2)
	 * are not zero-based. You may assume that each input would have exactly one
	 * solution.
	 * 
	 * Solution: O(n2) runtime, O(1) space – Brute force: The brute force approach
	 * is simple. Loop through each element x and find if there is another value
	 * that equals to target – x. As finding another value requires looping through
	 * the rest of array, its runtime complexity is O(n2). O(n) runtime, O(n) space
	 * – Hash table: We could reduce the runtime complexity of looking up a value to
	 * O(1) using a hash map that maps a value to its index.
	 */

	private static int[] twoSums(int[] numbers, int target) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			int x = numbers[i];
			if (map.containsKey(target - x)) {
				return new int[] { map.get(target - x) + 1, i + 1 };
			}
			map.put(x, i);
		}
		throw new IllegalArgumentException("No two sum solution");

	}

	public static void main(String[] args) {
		int[] newArr = new int[6];
		newArr[0] = 1;
		newArr[1] = 2;
		newArr[2] = 3;
		newArr[3] = 2;
		newArr[4] = 5;
		newArr[5] = 2;

		int[] result;

		result = twoSums(newArr, 6);
		System.out.println(Arrays.toString(result));

	}

}
