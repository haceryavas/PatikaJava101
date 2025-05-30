import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 29 Mayıs 2025
 * Bu proje girilen sayılar ile üslü sayı hesaplar.
 */
public class UsluSayi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n1, n2, total = 1;

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n1 = scan.nextInt();
        System.out.print("Üssü giriniz: ");
        n2 = scan.nextInt();

        for (int i = 1; i <= n2; i++) {
            total*=n1;
        }
        System.out.println(total);
    }
}
