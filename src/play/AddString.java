
package play;

public class AddString {

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder mergedWord = new StringBuilder();

        int length1 = word1.length();
        int length2 = word2.length();
        int minLength = Math.min(length1, length2);


        // Interleave characters from both words
        for (int i = 0; i < minLength; i++) {
            mergedWord.append(word1.charAt(i)).append(word2.charAt(i));
        }

        // Append the remaining characters, if any
        if (length1 > length2) {
            mergedWord.append(word1.substring(minLength));
        } else if (length2 > length1) {
            mergedWord.append(word2.substring(minLength));
        }
        return mergedWord.toString();

    }


    



    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
        
        

    }

}