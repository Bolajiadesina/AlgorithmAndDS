package test.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

    public int[] sortLimitedRange(int[] numbers) {

        

        return null;
    }

    public static void main(String[] args) {
        // System.out.println(removeAlpha());
        // System.out.println(reverseDigits());
        // System.out.println(fibonnacci());
        System.out.println(capitalizedString());
    }
}
