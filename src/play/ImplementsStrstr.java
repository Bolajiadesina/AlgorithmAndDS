package play;

public class ImplementsStrstr {

	/*
	 * Question: Implement strstr().
	 * 
	 * Returns the index of the first occurrence of needle in haystack, or –1 if
	 * needle is not part of haystack
	 * 
	 * Solution: O(nm) runtime, O(1) space – Brute force: Difficulty: Easy,
	 * Frequency: High
	 * 
	 * Returns the index of the first occurrence of needle in haystack, or –1 if
	 * needle is not part of haystack.
	 * 
	 * There are known efficient algorithms such as Rabin-Karp algorithm, KMP
	 * algorithm, or the Boyer-Moore algorithm. Since these algorithms are usually
	 * studied in an advanced algorithms class, it is sufficient to solve it using
	 * the most direct method in an interview – The brute force method. The brute
	 * force method is straightforward to implement. We scan the needle with the
	 * haystack from its first position and start matching all subsequent letters
	 * one by one. If one of the letters does not match, we start over again with
	 * the next position in the haystack.
	 * 
	 * Assume that n = length of haystack and m = length of needle, then the runtime
	 * complexity is O(nm). Have you considered these scenarios? i. needle or
	 * haystack is empty. If needle is empty, always return 0. If haystack is empty,
	 * then there will always be no match (return –1) unless needle is also empty
	 * which 0 is returned.
	 * 
	 * ii. needle’s length is greater than haystack’s length. Should always return
	 * –1.
	 * 
	 * iii. needle is located at the end of haystack. For example, “aaaba” and “ba”.
	 * Catch possible off-by-one errors.
	 * 
	 * 
	 * iv. needle occur multiple times in haystack. For example, “mississippi” and
	 * “issi”. It should return index 2 as the first match of “issi”.
	 * 
	 * v. Imagine two very long strings of equal lengths = n, haystack = “aaa...aa”
	 * and needle = “aaa...ab”. You should not do more than n character comparisons,
	 * or else your code will get Time Limit Exceeded in OJ.
	 */

	public static int strStr(String haystack, String needle) {
		for (int i = 0;; i++) {
			for (int j = 0;; j++) {
				if (j == needle.length())
					return i;
				if (i + j == haystack.length())
					return -1;
				if (needle.charAt(j) != haystack.charAt(i + j))
					break;
			}
		}
	}

	public static void main(String[] args) {
		int result;
		result = strStr("raceecar", "raceecar");
		System.out.println((result));

	}

}
