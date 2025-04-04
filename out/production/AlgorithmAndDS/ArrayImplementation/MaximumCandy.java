import java.util.ArrayList;
import java.util.List;

public class MaximumCandy {

    public static  List<Boolean> chectCandy(int[] candies, int noOfCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandy = 0;
        for (int i : candies) {
            maxCandy = Math.max(noOfCandies, maxCandy);
        }

        for (int j : candies) {
            result.add(j + noOfCandies >= maxCandy);
        }

        return result;
    }

    public static void main(String[] args) {
        int [] data={1,3,4,5,0,7};
       List<Boolean> find= chectCandy(data, 3);
       System.out.println(find);
    }
}
