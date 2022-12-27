import java.util.Scanner;

public class A03 {

     /*
      Kullanicidan alinan bir sayinin Armstrong sayi olup, olmadigini kontrol edin. Sonucu console yazdirin
      Armstrong sayi : Bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa Armstrong sayidir.

      153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
      370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
      */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");

        int sayi = scan.nextInt();

        int toplam = 0;

        for (int i=1; i <= Integer.toString(sayi).length(); i++) {


            int birlerBasamagi = sayi%10;
            toplam += (birlerBasamagi * birlerBasamagi * birlerBasamagi);
            sayi = sayi/10;

        }

        if (toplam == sayi) {
            System.out.println("Sayi bir armstrong sayidir");
        } else {
            System.out.println("Sayi armstrong sayi degildir");
        }

    }
}
