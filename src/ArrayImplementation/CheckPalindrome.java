package ArrayImplementation;

public class CheckPalindrome {
    
    private static Boolean check(){
            String word="madam";//#endregion

            String rev="";

            for(int i=word.length()-1; i>=0; i--){

               rev= rev+word.charAt(i);
               System.out.println(rev);
               
            }

            if(word.equals(rev)){
                return true;
            }


        return false;
    }



    public static void main(String[] args) {
        System.out.println(check());
    }



}
  