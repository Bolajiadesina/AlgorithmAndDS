package play;


public class Palindrome {

	/*
	 * Question: Given a string, determine if it is a palindrome, considering only
	 * alphanumeric characters and ignoring cases. For example,
	 * "A man, a plan, a canal: Panama" is a palindrome. "race a car" is not a
	 * palindrome. Example Questions Candidate Might Ask: Q: What about an empty
	 * string? Is it a valid palindrome? A: For the purpose of this problem, we
	 * define empty string as valid palindrome.
	 * 
	 * Solution: O(n) runtime, O(1) space: The idea is simple, have two pointers –
	 * one at the head while the other one at the tail. Move them towards each other
	 * until they meet while skipping non-alphanumeric characters. Consider the case
	 * where given string contains only non-alphanumeric characters. This is a valid
	 * palindrome because the empty string is also a valid palindrome.
	 */

	public static boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			while (i < j && !Character.isLetterOrDigit(s.charAt(i)))
				i++;
			while (i < j && !Character.isLetterOrDigit(s.charAt(j)))
				j--;
			if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		boolean result;
		result = isPalindrome("raceecar");
		System.out.println((result));

	}
}
