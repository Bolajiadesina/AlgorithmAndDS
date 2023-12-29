package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.logging.Logger;

public class SortLikeTermsTest {

    Logger logger = Logger.getLogger(getClass().getName());

    public void rttt() {
        int[] numb = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 4;
        int[] res = new int[numb.length];

        if (k > numb.length) {
            k = k % numb.length;

        }

        for (int i = 0; i < k; i++) {
            res[i] = numb[numb.length -k + i];

        }
        logger.info(Arrays.toString(res));


        int j=0;
            for(int i=k; i<numb.length; i++){
                res[i]= numb[j];
                j++;
                logger.info(Arrays.toString(res));
            }



    }

    public static void main(String[] args) {
        SortLikeTermsTest vt = new SortLikeTermsTest();
        vt.rttt();    
    }
}
