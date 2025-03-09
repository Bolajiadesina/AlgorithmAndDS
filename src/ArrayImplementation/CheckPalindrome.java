package ArrayImplementation;

public class CheckPalindrome {
    
    private static Boolean check(){
            String word="madam";//#endregion

            String rev="";

            for(int i=word.length()-1; i>=0; i--){

               rev= rev+word.charAt(i);
              
               
            }

            if(word.equals(rev)){
                return true;
            }


        return false;
    }

    private static void test(){
        String map_t= "romeo";

        String reva="";
        for(int i= map_t.length()-1; i>=0; i--){
            reva=reva+ map_t.charAt(i) ;

        }
        System.out.println(reva);
    }



    public static void main(String[] args) {
       // System.out.println(check());
        //test();

        testPal();
    }


    public static void testPal(){
            String word="madam";
            boolean status=false;

            String newWString="";

            //char [] splitWord= word.toCharArray();


            for(int i=word.length()-1; i>=0 ; i--){
                

                newWString = newWString+ word.charAt(i);
            }

            if(word.equals(newWString)){
                status=true;
            }

            System.out.println(status);

    }



}
  