import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 29 Mayıs 2025
 * Bu proje girilen tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
 * girilen değerlerden 4'ün katları olan sayıları toplar.
 */
public class DonguOrnek {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n, total = 0;

        do {
            System.out.print("Bir sayı girin: ");
            n = inp.nextInt();
            if (n % 4 == 0) {
                total += n;
            }
        } while (n % 2 == 0);
        System.out.println("Toplam: " + total);
    }
}
