package play;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

public class WordLadderII {
    Logger logger = Logger.getLogger(getClass().getName());

    /*
     * Given two words (start and end), and a dictionary, find all shortest
     * transformation
     * sequence(s) from start to end, such that: 1) Only one letter can be changed
     * at a time,
     * 2) Each intermediate word must exist in the dictionary.
     * For example, given: start = "hit", end = "cog", and dict =
     * ["hot","dot","dog","lot","log"],
     * return:
     * [
     * ["hit","hot","dot","dog","cog"],
     * ["hit","hot","lot","log","cog"]
     * ]
     * 
     * 
     * 
     */

    public List<List<String>> findLadders(String start, String end,
            Set<String> dict) {
        List<List<String>> result = new ArrayList<List<String>>();
        LinkedList<WordNodeII> queue = new LinkedList<WordNodeII>();
        queue.add(new WordNodeII(start, 1, null));
        dict.add(end);
        int minStep = 0;
        HashSet<String> visited = new HashSet<String>();
        HashSet<String> unvisited = new HashSet<String>();
        unvisited.addAll(dict);
        int preNumSteps = 0;
        while (!queue.isEmpty()) {
            WordNodeII top = queue.remove();
            String word = top.word;
            int currNumSteps = top.numSteps;
            if (word.equals(end)) {
                if (minStep == 0) {
                    minStep = top.numSteps;
                }
                if (top.numSteps == minStep && minStep != 0) {
                    // nothing
                    ArrayList<String> t = new ArrayList<String>();
                    t.add(top.word);
                    while (top.pre != null) {
                        t.add(0, top.pre.word);
                        top = top.pre;
                    }
                    result.add(t);
                    continue;
                }
            }
            if (preNumSteps < currNumSteps) {
                unvisited.removeAll(visited);
            }
            preNumSteps = currNumSteps;
            char[] arr = word.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    char temp = arr[i];
                    if (arr[i] != c) {
                        arr[i] = c;

                    }
                    String newWord = new String(arr);
                    if (unvisited.contains(newWord)) {
                        queue.add(new WordNodeII(newWord, top.numSteps + 1, top));
                        visited.add(newWord);
                    }
                    arr[i] = temp;
                }
            }
        }
        return result;
    }

}