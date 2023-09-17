package ArrayImplementation;

import java.lang.reflect.Array;

public class IncreaseArraySize {


        private static int[] reSizeArray(int arr[], int capacity){

            int [] temp= new int[capacity] ;

            for(int i=0; i<arr.length; i++){

                temp[i]=arr[i];


            }

            // for(int j=0; j<temp.length;j++){
            //     System.out.println(temp[j]);
            // }
            System.out.println(arr);
                return temp;

        }

        public static void main(String[] args) {
            int [] array= new int [] {0,1,2,3,4,5};
           int res[]= reSizeArray(array, 10);

            System.out.println(res.length);
        }


    
}



