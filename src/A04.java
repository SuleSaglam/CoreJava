import java.util.ArrayList;
import java.util.List;

public class A04 {

    /*
      Girilen bir String'deki kelimeleri tek saydiran ve
      daha sonra console ornekte oldugu gibi yazdiran java code create ediniz

      For Example : Input : String is "Ali came to school and Ayse came to school"
                    Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1
     */

    public static void main(String[] args) {

        String str = "Ali came to school and Ayse came to school";

        String[] arr = str.split(" ");
        List<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            int sayac = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i].equals(arr[j])) {
                    sayac++;
                }

            }

            if (!list.contains(arr[i] + "=" + sayac)) {
                list.add(arr[i] + "=" + sayac);
            }

        }

        for (int i = 0; i < list.size(); i++) {

            if (i < list.size()-1) {
                System.out.print(list.get(i) + ", ");
            } else {
                System.out.print(list.get(i));
            }

        }

    }
}
