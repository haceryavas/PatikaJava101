import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 29 Mayıs 2025
 * Bu proje girilen sayının basamaklarının toplamını bulur.
 */
public class BasamakSayiToplam {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n, temp, nCounter = 0, total = 0;

        System.out.print("Bir sayı giriniz: ");
        n = scan.nextInt();
        temp = n;

        while (temp != 0) {
            temp /= 10;
            nCounter++;
        }
        temp = n;
        for (int i = 1; i <= nCounter; i++) {
            total += temp % 10;
            temp /= 10;
        }
        System.out.println(n + " sayısının basamaklarının toplamı = " + total);

        /*int n, temp, nCounter = 0, bas, basCarp, total = 0;
        System.out.print("Bir sayı giriniz: ");
        n = scan.nextInt();
        temp = n;

        while (temp != 0) {
            temp /= 10;
            nCounter++;
        }
        temp = n;

        for (int i = 1; i <= nCounter; i++) {
            bas = temp % 10;
            basCarp = 1;
            for (int j = 1; j <= nCounter; j++) {
                basCarp *= bas;
            }
            total += basCarp;
            temp /= 10;
        }
        if (n == total) System.out.println(n + " sayısı bir Armstrong sayıdır");
        else System.out.println(n + " sayısı bir Armstrong sayı değildir.");*/
    }
}
