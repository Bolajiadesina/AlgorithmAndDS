package ArrayImplementation;

public class ReverseArray {
    private static  void printContent(int [] value){
        for (int x:value
        ) {
            System.out.println(x);
        }
    }
    public static void reverseArray(int [] numbers,int start, int end){

      while (start<end){

          int temp = numbers[start];
          numbers[start]= numbers[end];
          numbers[end]= temp;
          start++;
          end--;
      }
        System.out.println("--------------------------------");
        printContent(numbers);
    }
    public static void main(String[] args) {

      int [] numbers=new int [] {1,2,3,4,5,6};
        printContent(numbers);
        reverseArray(numbers,0,numbers.length-1);

    }



}
