import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 29 Mayıs 2025
 * Bu proje girilen sayının harmonik serisini bulur.
 */
public class HarmonikSeri {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n;
        double total = 0;

        System.out.print("Bir sayı giriniz: ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            total += 1.0 / i;
        }
        System.out.println(n + " sayısının harmonik serisi toplamı: " + total);
    }
}
