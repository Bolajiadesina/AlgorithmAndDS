package play;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {

    // public static int compress(char[] chars) {
    //     if (chars == null || chars.length < 1) {
    //         return 0;
    //     }
    //     int count = 0;
    //     int newCount = 0;
    //     String word="";
    //     Map<Character, Integer> newMap = new HashMap<>();

    //     for (int i = 0; i < chars.length; i++) {

    //         count++;

    //         if (i > 0 && chars[i] != chars[i - 1]) {
    //             newCount = count - 1;
    //             newMap.put(chars[i - 1], newCount);
    //             count = 1;
    //         }
    //     }

    //     // Store the last character's count after the loop
    //     newMap.put(chars[chars.length - 1], count);

    //     for (var entry : newMap.entrySet()) {
    //         word=word+entry.getKey()+entry.getValue();
    //     }
    //     word.toCharArray();

    //     System.out.println(word);
    //     return word.length();
    // }

    public static int compress(char[] chars) {
        int write = 0; // Position to write the compressed characters
        int read = 0;  // Position to read the original characters
        
        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;
            
            // Count the number of consecutive currentChar
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }
            
            // Write the character
            chars[write++] = currentChar;
            
            // Write the count if it's greater than 1
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        
        return write;
    }

    public static void main(String[] args) {

        // char[] input = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        // System.out.println(compress(input));

        char[] input2 = { 'a', 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b',
        'b', 'b' };
        System.out.println(compress(input2));

    }

    
}
