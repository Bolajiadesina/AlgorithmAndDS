package test.test;

public class Palindrome {

    public static Boolean check(String input) {

        String newWString = "";

        char[] bn = input.toCharArray();

        for (int i = input.length() - 1; i >= 0; i--) {

            newWString = newWString + input.charAt(i);

        }

        if (newWString.equals(input) ) {
            return true;

        }
        return false;
    }

    public static void main(String[] args) {

        String word = "madam";
        System.out.println(check(word));

    }

}
