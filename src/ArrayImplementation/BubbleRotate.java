package ArrayImplementation;

public class BubbleRotate {

    public static void bubbleRotate(int[] arr, int order) {
        for (int i = 0; i < order; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                System.out.println(temp);
            }
        }
        
    }

    public static void main(String[] args) {
        int [] arri= {1,2,3,4,5,6};
        bubbleRotate(arri, 2);
        System.out.println();
    }
}
