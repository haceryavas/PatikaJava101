import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 29 Mayıs 2025
 * Bu proje girilen sayıların kombinasyonunu hesaplar.
 */
public class Kombinasyon {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n, r;
        long nFac = 1, rFac = 1, nrFAc = 1;

        System.out.print("N değerini giriniz: ");
        n = scan.nextInt();
        System.out.print("R değerini giriniz: ");
        r = scan.nextInt();

        for (int i = 1; i <= n; i++)
            nFac *= i;

        for (int i = 1; i <= r; i++)
            rFac *= i;

        for (int i = 1; i <= n - r; i++)
            nrFAc *= i;

        System.out.println("C(" + n + "," + r + ") " + nFac / (rFac * nrFAc));
    }
}
