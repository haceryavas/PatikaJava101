import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 30 Mayıs 2025
 * Bu proje iki sayının EBOB ve EKOK değerlerini bulur.
 */
public class EbobEkok {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n1, n2, ebob = 1, ekok, i;

        System.out.print("Birinici sayıyı girin: ");
        n1 = scan.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        n2 = scan.nextInt();

        i = n1;
        while (i >= 1) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                ebob = i;
                break;
            }
            i--;
        }

        i = 1;
        ekok = n1 * n2;
        while (i <= n1 * n2) {
            if ((i % n1 == 0) && (i % n2 == 0)) {
                ekok = i;
                break;
            }
            i++;
        }
        //ekok = (n1 * n2) / ebob;

        System.out.println(n1 + " ve " + n2 + " sayısının EBOB'u: " + ebob);
        System.out.println(n1 + " ve " + n2 + " sayısının EKOK'u: " + ekok);
    }
}
