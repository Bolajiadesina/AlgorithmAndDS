package play;

public class WordNodeII {
    String word;
    int numSteps;
    WordNodeII pre;

    public WordNodeII(String word, int numSteps, WordNodeII pre) {
        this.word = word;
        this.numSteps = numSteps; 
        this.pre = pre;
    }
}
