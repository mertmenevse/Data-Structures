//MEHMET MERT MENEVŞE  N0=02205076048
import java.util.Scanner;
/**
 *
 * @author MEHMET MERT MENEVŞE
 */
public class Minheap {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen dizinizi giriniz: (0,1,2...)");
        String dizi = scanner.nextLine();

        //alınan stringi virgüllerden bölüp bir string dizisine atıyor.
        String[] temp = dizi.split(",");
        Integer[] list = new Integer[temp.length];

        //stringteki değerler integere çevriliyor
        for (int i = 0; i < temp.length; i++) {
            list[i] = Integer.valueOf(temp[i]);
        }

        //min heapse doğrulayan bir çıktı değilse bunu belirten bir çıktı verip, min heap değilse min heape çevirip yazdırıyor.
        if (minheap(list)) {
            System.out.println("Üçlü min heaptir.");
        } else {
            System.out.println("Üçlü min heap değildir.");
            list = convertminheap(list);

            System.out.print("Min heap hali: ");
            for (int i = 0; i < list.length - 1; i++) {
                System.out.print(list[i] + ",");
            }
            System.out.print(list[list.length - 1]);
            System.out.println();
        }
    }

    //eğer bir child parentından küçükse false dönüyor.
    private static boolean minheap(Integer[] liste) {

        for (int i = 1; i < liste.length; i++) {

            if (liste[i] < liste[(i - 1) / 3]) {

                return false;
            }
        }
        return true;
    }

    //eğer bir child parentından küçükse yerlerini değiştiriyor.Fonksiyonu tekrar çağırıyor.
    private static Integer[] convertminheap(Integer[] liste) {

        for (int i = 1; i < liste.length; i++) {

            if (liste[i] < liste[(i - 1) / 3]) {
                //swapping
                int temp = liste[(i - 1) / 3];
                liste[(i - 1) / 3] = liste[i];
                liste[i] = temp;

                convertminheap(liste);
            }
        }
        return liste;
    }
}