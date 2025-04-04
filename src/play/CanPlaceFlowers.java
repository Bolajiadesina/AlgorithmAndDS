package play;

class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            System.out.println("-----------------");
            System.out.println("          ");
            System.out.println("len== "+len);
            System.out.println("n== "+n);
            System.out.println("i== "+i);

            if (n == 0) {
                return true;

            }

            if ((flowerbed[i] == 0) && (i == 0 && flowerbed[i - 1] == 0) && (i == len - 1 && flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                n--;
                i++;
                System.out.println("-----------------");
                System.out.println("flowerbed[i] "+ flowerbed[i]);
                System.out.println("flowerbed[i - 1] "+ flowerbed[i - 1]);
                System.out.println("i == len - 1"+ (i == len - 1));
                System.out.println("flowerbed[i + 1]"+ flowerbed[i + 1]);

            }

        }

        return n == 0;

    }


    public static void main(String[] args) {
       // int [] flowerbed = {1,0,0,0,1}; int  n = 1;
       int [] flowerbed = {1,0,0,0,1}; int n = 2;
        System.out.println(canPlaceFlowers(flowerbed, n));;

    }

}
