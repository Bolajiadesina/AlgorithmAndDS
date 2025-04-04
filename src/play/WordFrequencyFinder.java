package play;

import java.util.*;
import java.util.regex.*;

public class WordFrequencyFinder {
    private Map<String, Integer> wordFrequency;

    public WordFrequencyFinder(String[] book) {
        this.wordFrequency = new HashMap<>();
        preprocessBook(book);
    }

    private void preprocessBook(String[] book) {
        Pattern pattern = Pattern.compile("\\b[\\w-]+\\b");
        
        for (String sentence : book) {
            Matcher matcher = pattern.matcher(sentence.toLowerCase());
            while (matcher.find()) {
                String word = matcher.group();
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }
    }

    public int getWordFrequency(String word) {
        return wordFrequency.getOrDefault(word.toLowerCase(), 0);
    }

    public static void main(String[] args) {
        String[] book = {
            "Once upon a time, in a small village nestled between rolling hills, there lived a young girl named Elara. Elara was known for her curiosity.",
            "Elara loved to explore the forest, the forest that bordered the village. The forest was her favorite place in the world.",
            "One bright morning, as the sun painted the sky in hues of pink and orange, Elara ventured deeper into the forest than she ever had before.",
            "As she wandered, she came across an old oak tree with a hollow at its base. Inside, she saw something glimmering—a glimmering light from the forest itself.",
            "'What could it be?' Elara wondered, crouching down to investigate. To her astonishment, it was a small, silver key.",
            "The key shimmered in the sunlight. 'I wonder what this key unlocks,' Elara thought, tucking it into her pocket.",
            "Then, one evening, as she sat by the fire in the village, an old woman came to her with a knowing smile. 'The key you found,' she said, 'belongs to the door beneath the great oak tree in the heart of the forest.'"
        };

        WordFrequencyFinder finder = new WordFrequencyFinder(book);

        // Example queries
        System.out.println(finder.getWordFrequency("elara"));     // 6
        System.out.println(finder.getWordFrequency("forest"));    // 5
        System.out.println(finder.getWordFrequency("key"));       // 3
        System.out.println(finder.getWordFrequency("village"));   // 2
        System.out.println(finder.getWordFrequency("nonexistent")); // 0
        System.out.println(finder.getWordFrequency("THE"));       // 3 (matches 'the')
    }
}