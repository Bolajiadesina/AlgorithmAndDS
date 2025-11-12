package play;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWord {

    


    public static boolean checkWord(String inpuString, String testWord){


        Pattern pattern = Pattern.compile(testWord);
        Matcher matcher = pattern.matcher(inpuString);

           return matcher.find();

    }


    public static void main(String[] args) {

       
         String word ="jsdnfsdlkfjsdkfmskeBolajifghfuyghigb";

        checkWord(word, "Bolaji");
        System.out.println(checkWord(word, "Bolaji"));
        System.out.println(checkWord(word, "Bolaji1"));
        System.out.println(checkWord(word, "Bolaji2"));
        
    }



}
