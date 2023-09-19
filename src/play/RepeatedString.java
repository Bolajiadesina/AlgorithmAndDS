package play;

public class RepeatedString {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     * 1. STRING s
     * 2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        // Write your code here

        long countofA = 0_0;
        for (char c : s.toCharArray()) {
            if (c == 'a')
                countofA++;
        }
        long stringRepeated = n / s.length();
        

        countofA = countofA * stringRepeated;
      

        long remainingChars = n % s.length();
       

        for (int i = 0; i < remainingChars; i++) {
            if (s.charAt(i) == 'a')
                countofA++;
        }
        return countofA;
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));

    }
}
