import java.util.Scanner;

public class A01 {

    // Kullanicidan alinan String'i tersten yazdiran bir method yaziniz

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen tersten yazdirmak istediginiz kelimeyi yaziniz");
        String str = scan.next();

        tersineCevir(str);

    }
    private static void tersineCevir(String str) {

        String tersStr = "";

        for (int i = str.length()-1; i >= 0; i--) {

            tersStr += str.substring(i,i+1);

            //   System.out.println(str.charAt(i));

        }

        System.out.println(tersStr);

    }
}
