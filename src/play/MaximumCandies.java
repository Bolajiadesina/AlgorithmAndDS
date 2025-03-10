package play;

import java.util.ArrayList;
import java.util.List;

public class MaximumCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        

        int maxCandy=extraCandies;
        Boolean candyStatus=false;
        List<Boolean> candyArray= new ArrayList<>();
            maxCandy= extraCandies;
            for(int i=0; i<candies.length; i++){
                
                if(candies[i]+extraCandies>= maxCandy){
                    candyStatus=true;
                    maxCandy=+candies[i];
                }else{
                    candyStatus=false;
                }
                candyArray.add(candyStatus);
            }

            

            return candyArray;
    }



    public static void main(String[] args) {
       int [] candies = {2,3,5,1,3};
       int  extraCandies = 3;
        kidsWithCandies(candies, extraCandies);
    }
}
