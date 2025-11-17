package test.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collector;

public class Interview {

    public static List<String> removeAlpha() {

        List<String> employees = new ArrayList<>();
        employees.add("Alice");
        employees.add("Bob");
        employees.add("andrew");
        employees.add("Charlie");
        employees.add("alex");

        // employees =
        // employees.stream().filter(e->e.toLowerCase().startsWith("a")).toList();
        employees.removeIf(e -> e.startsWith("a"));
        return employees;
    }

    public static int reverseDigits() {
        int numb = 89850481;

        String word = String.valueOf(numb);
        String newWord = "";

        newWord = new StringBuilder(word).reverse().toString();

        // alternatively
        for (int i = word.length() - 1; i >= 0; i--) {
            newWord = newWord + word.charAt(i);
        }

        return Integer.parseInt(newWord);

    }

    public static int fibonnacci() {

        int sum = 0;

        for (int i = 0; i <= 10; i++) {

            sum = sum + i;
            System.out.println(i);
            System.out.println(sum);
        }
        return sum;
    }

    public static String capitalizedString() {
        String woString = "string manipulation capitalize every first word in a sentence";

        String[] cheStrings = woString.split("\\s");

        StringBuilder vBuilder = new StringBuilder();
        for (int i = 0; i < cheStrings.length; i++) {
            System.out.println(cheStrings[i]);
            vBuilder.append(Character.toTitleCase(cheStrings[i].charAt(0))).append(cheStrings[i].substring(1))
                    .append(" ");
        }
        return vBuilder.toString().trim();
    }

    public static String capitalizedStringStreams() {
        String woString = "string manipulation capitalize every first word in a sentence";
        String[] cheStrings = woString.split("\\s");
        StringBuilder vBuilder = new StringBuilder();
        // Arrays.stream(woString.split("\\s")).map(word->Character.toTitleCase(0)+word.substring(1)).collect(Collectors.joining("
        // "));
        return vBuilder.toString().trim();
    }

    public static void sortLimitedRange() {
        int[] numbers = new int[] { 4, 101, 3, 0, 4, 99, 1, 3, 101, 2 };
        Arrays.sort(numbers);
        for (int i : numbers) {
            System.out.println(i);
        }

    }

    public static List<Integer> combineTwoLists() {
        int[] numbers = new int[] { 4, 101, 3, 0, 4 };
        int[] numb = new int[] { 99, 1, 3, 101, 2 };

        List<Integer> newArray = new ArrayList<>();
        int track = 0;

        for (int i : numbers) {
            newArray.add(i);
        }

        for (int j : numb) {
            newArray.add(j);
        }
        // sort
        // Collections.sort(newArray);

        // remove duplicate
        // newArray= new ArrayList<>(new LinkedHashSet<>(newArray));

        // stream
        // newArray=newArray.stream().sorted().distinct().toList();

        return newArray;

    }

    public static void reverseStr() {
        String jack = "abcdefghijklmnopqrstuvwxy";
        String beat = "";

        // using Stringbuilder
        String revString = new StringBuilder(jack).reverse().toString();

        System.out.println(revString);
        // using char array
        char[] jackal = jack.toCharArray();

        for (int i = jackal.length - 1; i >= 0; i--) {
            beat += jackal[i];
        }
        System.out.println(beat);
    }

    public static boolean areBracketsProperlyMatched(String code_snippet) {
        // Write your code here

        if (code_snippet == null || code_snippet.isEmpty()) {
            return false;
        }

        Map<Character, Character> newMap = new HashMap<>();
        newMap.put('{', '}');
        newMap.put('(', ')');
        newMap.put('[', ']');

        Stack<Character> stackName = new Stack<>();

        for (Character character : code_snippet.toCharArray()) {
            if (newMap.containsValue(character)) {
                stackName.push(character);
            } else if (newMap.containsKey(character)) {
                if (stackName.isEmpty() || stackName.pop() != newMap.get(character)) {
                    return false;
                }

            }
        }
        return stackName.isEmpty() ? true : false;
    }

    public static void main(String[] args) {
        // System.out.println(removeAlpha());
        // System.out.println(reverseDigits());
        // System.out.println(fibonnacci());
        // System.out.println(capitalizedString());
        // sortLimitedRange();
        // combineTwoLists();
        // reverseStr();
        System.out.println(areBracketsProperlyMatched("if (a[0] > b[1]) {doSomething(); }"));

    }

    public boolean areBracketsProperlyMatched2(String cString) {

        Map<Character, Character> newHasMap = new HashMap<>();
        newHasMap.put('(', ')');
        newHasMap.put('{', '}');
        newHasMap.put('[', ']');

        Stack<Character> stackValue = new Stack<>();

        for (char ch : cString.toCharArray()) {
            if (newHasMap.containsValue(ch)) {
                stackValue.push(ch);
            } else if (stackValue.isEmpty()) {

                if (newHasMap.containsKey(ch) || stackValue.pop() != newHasMap.get(ch)) {
                    return false;
                }

            }

        }
        System.out.println(stackValue);

        return stackValue.isEmpty()? true: false;
    }
}