package MapImplementation;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumSwaps {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
      
      
      //get the size of the input array
        int n = arr.length;
        int s = 0;
        
        //initalize the a map 
        Map<Integer,Integer> m = new HashMap<>();
        
        // store each element of array as the key and the index as its value
        for(int i = 0; i < n;i++){
            m.put(arr[i],i);
        }
        
        
        for(int i = 0; i < n;i++){//loop
            //look for min
            int min = i + 1;
            
            if(min != arr[i]){
                int minIndex = m.get(min);
                //update map
                m.put(arr[i],minIndex);
                //swap
                arr[minIndex] = arr[i];
                s++;
            }
            
        }
        return s;

    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //int[] arr = new int[n];

        int[] arr = {7,1,2,3,4,5,6};

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
