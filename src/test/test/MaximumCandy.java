package test.test;

public class MaximumCandy {
    public static boolean [] maximumCandy(int[] candies, int num) {
        int n = candies.length;
        //if (n == 0) return false;

        int value= 0;
        int additionKey=4;
        boolean [] boolArray= new boolean [candies.length+1];

        int maxCandy = candies[0];
        for (int i : candies) {
            System.out.println("i==="+i);
            System.out.println("max candy"+maxCandy);
            
            value=(i+ additionKey);

            if(value>num){
                boolArray[i]=true;
            }else{
                boolArray[i]=false;
            }

        }

       for (boolean b : boolArray) {
            System.out.println(b);
       }
        return boolArray;
    }

    public static void main(String[] args) {
        int num=7;
        int[] candies = {1, 3, 2, 5, 4};
        System.out.println("Maximum candy: " + maximumCandy(candies, num));
    }
}
