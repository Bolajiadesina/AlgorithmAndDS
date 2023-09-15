package ArrayImplementation;

import java.util.ArrayList;
import java.util.List;

public class ExecuteArray {

    private static void printArrayElement(int[] arr){
        int result[]= new int [0];
        int oddCount= 0;

        for (int newArray:arr
             ) {
            if(newArray%2!=0) {
                oddCount++;
            }
        }
        System.out.println("oddcount   "+oddCount);
        int ind=0;
        result = new int[oddCount];
        for (int num: arr
             ) {
            if(num%2!=0) {
                result[ind] = num;
                ind++;

            }
        }
        printContent(result);
    }

    public void reverseArray(int [] result){

    }



    private static  void printContent(int [] value){
        for (int x:value
             ) {
            System.out.println(x);
        }
    }


    private static void printArrayList(){
        List<String>  arrayList = new ArrayList<String>();
        arrayList.add("bolaji");
        arrayList.add("jacobus");
        arrayList.add("mensa");
        arrayList.add("jude");
        arrayList.add("sam");
        arrayList.add("olo");
        arrayList.add("baba");



        for (String  words: arrayList
             ) {
            if(words.contains("b")) {
                char [] b;
                b=words.toCharArray();
                int nub=b.length;
                System.out.println(nub);
            }
        }

    }

    public static void main(String[] args) {
        int [] array= new int[6];
        array=new int [] {1,2,3,4,5,6};

        printArrayList();

       // printArrayElement(array);
    }


}
