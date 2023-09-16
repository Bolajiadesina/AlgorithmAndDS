package ArrayImplementation;

public class FindMissingNumber {

    private static int findNumber(int[] bar) {

        int length = bar.length + 1;
        int sum = length * (length + 1) / 2;

        for (int x : bar) {
            sum = sum - x;

        }

        return sum;

    }

    public static void main(String[] args) {
        int[] bar = { 1, 3, 6, 8, 2, 4, 7 };
        System.out.println(findNumber(bar));
    }

}
