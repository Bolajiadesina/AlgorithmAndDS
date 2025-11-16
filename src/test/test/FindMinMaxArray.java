package test.test;

public class FindMinMaxArray {

    public static void find(int[] arr) {

        int maxArry = 0;

        for (int i : arr) {
           // System.out.println(maxArry);

           // System.out.println(i);

            if (i < maxArry) {
                maxArry = i;
            }
        }

        System.out.println(maxArry);
    }

    public static void main(String[] args) {

        int[] arr = { 6, 5, 4, 7, 3, 4, 2 };

        find(arr);

    }
}
