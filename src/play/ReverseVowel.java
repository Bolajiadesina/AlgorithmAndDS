package play;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReverseVowel {
    public static String reverseVowels() {
        String s = "IceCreAm";
        String vowels = "aeiouAEIOU";
        String reverseWord = "";

        char[] splitWord = s.toCharArray();
        char[] vowelSplit = vowels.toCharArray();
        
        List<Integer> spl = new ArrayList<>();
        List<Character> vow = new ArrayList<>();
        List<Character> vow2 = new ArrayList<>();

        
        
                for (int i = 0; i < splitWord.length; i++) {
        
                    for (int j = 0; j < vowelSplit.length; j++) {
        
                        if (vowelSplit[j] == splitWord[i]) {    
                            spl.add(i);
                            vow.add(vowelSplit[j]);
                        }
                    }
                }

              
        
                for(int k=splitWord.length-1; k>=0;k-- ){
                    for(int l=spl.size()-1; l>=0;l--){
                        for(int n=vow.size()-1 ;n>=0; n--){}
                        if(spl[l]==splitWord[k]){}
                       vow2.add(splitWord[k]);

                    }
                   
        
                }
        
                return reverseWord;
            }
        
          
        
            public static void main(String[] args) {
        System.out.println(reverseVowels()); ;
    }

}
