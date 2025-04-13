package play;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordInAString {
    public static String reverseWords(String s) {
        String[] splited = s.split("\\s+"); 

      
        List<String> strList= new ArrayList<>();
        for (int i= splited.length-1; i>=0;i--) {
            strList.add(splited[i]);
           
        }

        

        String reverseWord=String.join(" ", strList);

        System.out.println(reverseWord);

        return reverseWord.trim();
        
    }

    public static void main(String[] args) {
      // String input = "the sky is blue";
       String input ="Hello world";
        reverseWords(input);
    }
    
}
