import java.util.Arrays;

public class A05 {

    /*
       Verilen bir arrayin elemanlarinin ardisik artan toplamini hesaplayan
       yeni bir array'e atayan bir kod yaziniz

       input : {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};

       output : [3, 5+1, 2+7+9, 2+3+5+7]
                [3, 6, 18, 17]
     */

    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        int[] yeniArr = new int[4];

        int sayac = 0;
        int indexBul = 1;

        do {

            int toplam = 0;

            for (int i = 0; i <= sayac ; i++) {

                toplam += arr[indexBul - 1 + i];

            }

            yeniArr[sayac] = toplam;
            sayac++;
            indexBul += sayac;


        } while (sayac < yeniArr.length);

        System.out.println(Arrays.toString(yeniArr));

    }
}
