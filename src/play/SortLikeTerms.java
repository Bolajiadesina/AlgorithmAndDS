package play;

import java.util.ArrayList;
import java.util.List;

public class SortLikeTerms {

    public  void sortArray(){
        int [] st= new int [] {0,1,0,1,0,0,0,1,1,0,1};
        List<Integer> ab= new ArrayList<>();
         List<Integer> ba= new ArrayList<>();

        for(int i = 0; i< st.length; i++ ){
            if(st[i]==0){
                ab.add(st[i]);
            }else{
                ba.add(st[i]);
            }

        }

           for (Integer iterable_element : ba) {
                    ab.add(iterable_element);
            
           }
           System.out.println("xxxxxxxx"+ab);

    }


    public static void main(String[] args) {
        SortLikeTerms sort = new SortLikeTerms();

        sort.sortArray();
        
    }
}



