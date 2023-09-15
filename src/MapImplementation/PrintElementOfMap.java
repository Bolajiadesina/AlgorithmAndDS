package MapImplementation;


import java.util.*;

/*
            *

            * */


public class PrintElementOfMap {

    public static void main(String[] args) {
        List<String> arr= new ArrayList();
                arr.add("Abuja");
                 arr.add("Lagos");
                arr.add("PortHarcourt");
                arr.add("Warri");
                arr.add("Warri");
                arr.add("Warri");
          //  printMap(arr);
        sortMap();
    }

        public static Map<String, String> printMap(List<String> e){

            Set<String> arrSet1= new TreeSet<>();
            for (String nw:e
                 ) {
                arrSet1.add(nw);
            }
            System.out.println(arrSet1);

            Map<String,String>  nextMap= new HashMap<String,String>();
            
            for (String word:e
                 ) {
                nextMap.put(word,word);
            }
            System.out.println(nextMap);

            return nextMap;
        }


        public static  void sortMap(){
            String worder = "Abuja-Lagos,Kano-Calabar,Calabar-PortHarcourt,Lagos-Kano,PortHarcourt-Abuja";

            String [] newComer= worder.split(",");

            System.out.println("newComer"+ Arrays.deepToString(newComer) );

            Set<String>  orderSet= new LinkedHashSet<>();
            Map<String,String>  assure= new HashMap<String,String>();
            String keeyz="";
            String valuez="";
            String oldkeeyz="";
            String oldvaluez="";
            for (String fixer:newComer
                 ) {

                    String [] mapArr= fixer.split("-");

                for(int i=0; i<mapArr.length; i++){
                    keeyz=mapArr[0];
                    valuez=mapArr[1];
                    if(keeyz.equals(oldvaluez)){
                        assure.put(keeyz,valuez);
                        orderSet.add(valuez);
                    }else{
                        assure.put(keeyz,valuez);
                        orderSet.add(keeyz);
                    }


                    System.out.println(orderSet+ "orderSet");
                    System.out.println(assure+ "assure");
                }
                for(int i=0; i< orderSet.size(); i++){

                    System.out.println();

                }
            }
        }
}
