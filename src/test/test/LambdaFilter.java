package test.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class LambdaFilter {

    public static void lambdaFilters(List<Integer> numbers) {
        // Use a lambda with Stream API to filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 > 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);
    }

    public static void reverseArrayDesc(int[] arr) {

        int tracker = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    tracker = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tracker;
                }

            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static boolean checkPali() {
        String word = "madam";

        String tracker = "";

        char[] newWString = word.toCharArray();

        for (int i = newWString.length - 1; i >= 0; i--) {
            tracker = tracker + newWString[i];
        }

        if (word.equals(tracker)) {
            return true;
        }

        return false;

    }

    public static String reverseString() {
        String input = "candies";

        char[] newWord = input.toCharArray();

        String revInput = new StringBuilder(input).reverse().toString();

        // for (int i = newWord.length - 1; i >= 0; i--) {
        // revInput = revInput + newWord[i];
        // }

        return revInput;

    }

    public static void findClosestPositiveNumber(double[] arr) {

        /*
         * diff== check the difference tracker and [i]
         * if diff
         * old>diff
         * returner==[i]
         * oldDiff==diff;
         * 
         */

        double tracker = 4;

        double returner = 0;
        double oldDiff = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            double diff = 0;
            System.out.println(diff);
            System.out.println(tracker);
            System.out.println(arr[i]);
            diff = tracker - arr[i];

            System.out.println(diff);

            if (diff < oldDiff) {
                returner = arr[i];
            }
            oldDiff = diff;
        }

        System.out.println("Returner ==" + returner);

    }

    public static boolean checkAlpha() {
        if (Character.isAlphabetic('1')) {
            return true;

        }

        return false;
    }

    public static boolean isAlphabeticPalindrome(String code) {
        // Write your code here

        if (code == null) {
            return false;
        }

        StringBuilder filtered = new StringBuilder();

        for (char c : code.toCharArray()) {
            if (Character.isLetter(c)) {
                filtered = filtered.append(Character.toLowerCase(c));
            }
        }
        String forward = filtered.toString();
        String reverse = filtered.reverse().toString();

        return forward.equals(reverse);

    }

    public static void checkDuplicate() {
        int[] nums = new int[] { 1, 3, 2, 4, 2, 5 };

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {

                    count++;

                }
            }
            if (count == 1) {
                System.out.println(nums[i]);
                break;
            }
        }
    }

    public static void overlapping() {
        List<List<Integer>> meetings = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(2, 3),
                Arrays.asList(3, 4),
                Arrays.asList(1, 3));
        List<Integer> tracIntegers = new ArrayList<>();

        int count = 1;
        int lastEnd = meetings.get(0).get(1);

        meetings.sort(Comparator.comparingInt(m -> m.get(1)));

        for (int i = 1; i < meetings.size(); i++) {
            int start = meetings.get(i).get(0);
            int end = meetings.get(i).get(1);

            if (lastEnd >= start) {
                count++;
                lastEnd = end;
            }

        }

        System.out.println(count);

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

        for (char ch : code_snippet.toCharArray()) {
            if (newMap.containsValue(ch)) {
                stackName.push(ch);
            } else if (newMap.containsValue(ch)) {
                if (stackName.isEmpty() || stackName.pop() != newMap.get(ch)) {
                    return false;
                }
            }
        }
        return stackName.isEmpty() ? true : false;

    }

    // public static SinglyLinkedListNode deleteDuplicates(SinglyLinkedListNode
    // head) {

    // if(head.isEmpty){
    // return null;
    // }

    // SinglyLinkedListNode current=head;

    // while (current !=null && current.next.next !=null) {
    // if(current.data==current.next.data){
    // current.next= current.next.next;
    // }else{
    // current=current.next;
    // }
    // }

    // return head;

    // }

    public static List<String> generateAngleBracketSequences(int n) {
        // Write your code here
        List<String> result = new ArrayList<>();
        if (n == 0) {
            return result;
        }
        if (n % 2 != 0) {
            n = n - 1;
        }
        String[] symbol = { "<", ">" };

        for (int i = 0; i < n; i++) {
            result.add(symbol[i]);
        }
        return result;
    }

    public static void bizzBuzz() {
        for (int i = 1; i <= 15; i++) {

            if (i % 3 == 0) {
                System.out.println("Bizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("BizzBuzz");
            } else {
                System.out.println(i);
            }

        }

    }

    public static void sortPositive() {
        int[] sorta = { 1, 5, 7, 4, 3, 6, 2, 8, 9 };

        Arrays.sort(sorta);
        for ( Integer i : sorta) {
        System.out.println(i);
        }


        //get odd numbers
        int[] newArray = Arrays.stream(sorta).filter(m -> m % 2 != 0).toArray();
        for (Integer i : newArray) {
            System.out.println(i);
        }

    }
    //Targeted, personalized email-based attack.

   public static void fibonnacci(int n){
        if(n<=1){
            System.out.println(n); 
        }

        long previous=0;
        long current=1;

       for (int i = 2; i < n; i++) {
            long next= previous+current;
            previous= current;
            current=next;

       }
            System.out.println(current); 


   }

      

    public static void main(String[] args) {
        // List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // lambdaFilters(numbers);

        // int [] number1 = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // reverseArrayDesc(number1);

        // System.out.println(checkPali());
        // System.out.println(reverseString());

        // double[] number1 = new double[] { 1, 2, -1, 9, 30, 40, -0.5 };
        // findClosestPositiveNumber(number1);

        // System.out.println(checkAlpha());
        // checkDuplicate();
        // overlapping();

        // System.out.println(areBracketsProperlyMatched("if (a[0] > b[1]) {
        // doSomething(); }"));

        // System.out.println(generateAngleBracketSequences(3));
        // bizzBuzz();
        sortPositive();
        //fibonnacci(20);
    }

}
