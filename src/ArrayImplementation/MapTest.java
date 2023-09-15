package ArrayImplementation;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        String [] array= new String [6];
        array=new String[] {"Lagos","Ibadan","Kano","Jos","Maiduguri","Sokoto"};

      //  printArrayList(array);
        printArraySet(array);
        // printArrayElement(array);
    }




    public static void  printArrayList(String [] word){
        Map<String, String>  newMap=new HashMap<String, String>();
        for (String  arr: word
             ) {
          //System.out.println(arr);
          //System.out.println( Arrays.deepToString(word))
            newMap.put(arr,arr);
        }

        System.out.println(newMap);
}


    public static void  printArraySet (String [] word){
        Set<String> newMap=new HashSet<String>();
        System.out.println(Arrays.stream(word).sorted());
        for (String  arr: word
        ) {

            newMap.add(arr);

            if(arr.contains("e") ){
                System.out.println(newMap);
            }
        }



        }


       

}