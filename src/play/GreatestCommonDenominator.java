package play;

public class GreatestCommonDenominator {

    // public String gcdOfStrings(String str1, String str2) {

    //     StringBuilder commonDivisor = new StringBuilder();

    //     int lenght1 = str1.length();
    //     int length2 = str2.length();

    //     int minlenght = Math.min(lenght1, length2);
    //     for (int i = 0; i < minlenght; i++) {

    //         if (str1.charAt(i) == str2.charAt(i)) {
    //             commonDivisor.append(str1.charAt(i)) ;
    //         }

    //     }

    //     return commonDivisor.toString();

    // }
    public static String gcdOfStrings(String str1, String str2) {
        // If concatenating in different order does not give the same result, there is no common divisor
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        
        // Find the GCD of lengths of the two strings
        int gcdLength = gcd(str1.length(), str2.length());
        
        // Return the substring from 0 to gcdLength
        return str1.substring(0, gcdLength);
    }

    // Helper method to compute GCD of two numbers
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        System.out.println(gcdOfStrings(str1, str2));  // Output: "AB"
    }
}
