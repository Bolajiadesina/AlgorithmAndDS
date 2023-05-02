package ArrayImplementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveArray {
    
    public static void useIteratorInsteadOfFor(List<Integer> a){
            
       Iterator<Integer> iterator =a.iterator();

       while(iterator.hasNext()){
        int numb= iterator.next();
            if (numb==2){
                iterator.remove();
            }
            System.out.println("iterator"+ iterator.toString());

       }

       
    }

    public static void main(String[] args) {
       

        List<Integer> bx= new ArrayList<>();

        bx.add(1);
        bx.add(2);
        bx.add(3);
        bx.add(4);
        bx.add(5);
        bx.add(6);
        bx.add(2);
        bx.add(2);
        bx.add(2);
        bx.add(2);

        useIteratorInsteadOfFor(bx);

       // printArrayElement(array);
    }


}
