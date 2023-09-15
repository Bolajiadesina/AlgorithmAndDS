package ArrayImplementation;

public class MaximumArray {
    private static  void printContent(int [] value){
        for (int x:value
        ) {
            System.out.println(x);
        }
    }
    public static void minimumArray(int [] numbers){
        int initial=numbers[0];
        for (int number:numbers
        ) {
            if(number>initial){
                initial=number;

            }
        }
        System.out.println("-----------------------");
        System.out.println(initial);


    }
    public static void main(String[] args) {

        int [] numbers=new int [] {1,22,36,0,5,6};
        printContent(numbers);
        minimumArray(numbers);

    }

}
