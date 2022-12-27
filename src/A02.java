import java.util.Scanner;

public class A02 {

    /*
        Kullanicidan bir String alin,
        String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin
      */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen String bir ifade giriniz");
        String str = scan.nextLine();

        String strIlkYari = str.substring(0,str.length()/2);
        String strIlkYaridanSonra = str.substring(str.length()/2);

        if (str.length()%2==0) {
            System.out.println(strIlkYari + ":)" + strIlkYaridanSonra);
        } else {
            System.out.println(strIlkYari + ":(" + strIlkYaridanSonra);
        }

    }
}
