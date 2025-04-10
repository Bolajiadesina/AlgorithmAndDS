package play;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReverseVowel {
    public static String reverseVowels() {
        String s = "IceCreAm";
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        String vowels = "aeiouAEIOU";
        
        while (left < right) {
            // Find the next vowel from the left
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            
            // Find the next vowel from the right
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }
            
            // Swap the vowels
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(chars);

    }

    public static void main(String[] args) {
        System.out.println(reverseVowels());
        ;
    }

}
