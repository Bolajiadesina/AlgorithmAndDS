package play;

import java.util.logging.Logger;

public class ClosestPositiveNumber {
    Logger logger = Logger.getLogger(getClass().getName());

    /*
     * Given an array {1, 2,-1,9,30,40,-0.5}
     * 
     * the algorithm should return closes positive number to Zero
     * if there is a negative number the algorithm should return the positive number
     * e.g logic should return 1, it is assumed that 1 is closer to zero than -0.5
     * 
     * 
     * 
     */

    public  Double findClosest(Double[] a) {
        double result = 0;

        double latest = 0;

        for (int i = 0; i <a.length; i++) {
            logger.info("i== "+a[i]);
            if (Math.abs(a[i]) > Math.abs(0.0)) {

                if (Math.abs(a[i]) > Math.abs(0.0)) {
                

                result = a[i];
            }
                result = a[i];
            }

            logger.info("result "+result);
        }

         
        return result;
    }

    public static void main(String[] args) {
        ClosestPositiveNumber cl = new ClosestPositiveNumber();

        Double[] a = { 1.0, 2.1, -1.5, 9.2, 30.4, 40.3, -0.5 };

         cl.findClosest(a);
       
    }

}
