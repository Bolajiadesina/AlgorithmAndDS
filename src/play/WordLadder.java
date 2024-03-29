package play;

import java.util.LinkedList;
import java.util.Set;
import java.util.logging.Logger;

public class WordLadder {
    Logger logger = Logger.getLogger(getClass().getName());

    /*
     * Given two words (start and end),
     * and a dictionary, find the length of shortest transformation sequence from
     * start to end,
     * such that only one letter can be changed at a timeand each intermediate word
     * must exist in the dictionary.
     * For example, given:
     * start = "hit"
     * end = "cog"
     * dict = ["hot","dot","dog","lot","log"]
     * 
     * One shortest transformation is
     * "hit" ->"hot" ->"dot" ->"dog" ->"cog",
     * the program should return its length 5.
     */

    public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {

        LinkedList<WordNode> queue = new LinkedList<WordNode>();
        queue.add(new WordNode(beginWord, 1));
        wordDict.add(endWord);

        while (!queue.isEmpty()) {
            WordNode top = queue.remove();
            String word = top.word;

            if (word.equals(endWord)) {
                return top.numSteps;
            }

            char[] arr = word.toCharArray();
            
            for (int i = 0; i < arr.length; i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    char temp = arr[i];

                    if (arr[i] != c) {
                        arr[i] = c;
                    }

                    String newWord = new String(arr);
                    if (wordDict.contains(newWord)) {
                        queue.add(new WordNode(newWord, top.numSteps + 1));
                        wordDict.remove(newWord);
                    }
                    arr[i] = temp;
                }
            }
        }
        return 0;

    }

    public void mytest() {
        int numb= 0;
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);

            numb++;
        }

        for (char i = 'g'; i >= 't'; i++) {
            System.out.println(i);
            numb++;
        }

        System.out.println(numb);
    }

}
