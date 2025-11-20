package test.test;

public class ReverseAddPalindrome {

    // A simple record to hold the result
    public record Result(int palindrome, int iterations) {}

    public static Result reverseAndAddUntilPalindrome(int number) {
        int iterations = 0;

        while (!isPalindrome(number)) {
            int reversed = reverse(number);
            number = number + reversed;
            iterations++;
        }

        return new Result(number, iterations);
    }

    // Reverse the digits of the number
    private static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }

    // Check if the number is a palindrome
    private static boolean isPalindrome(int num) {
        return num == reverse(num);
    }

    // Test it
    public static void main(String[] args) {
        int input = 87;
        Result result = reverseAndAddUntilPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Palindrome: " + result.palindrome());
        System.out.println("Iterations: " + result.iterations());
    }
}
