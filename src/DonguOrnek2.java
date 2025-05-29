import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 29 Mayıs 2025
 * Bu proje girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazar.
 */
public class DonguOrnek2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("Bir sayı giriniz: ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i*=4) {
            System.out.print(i + ", " );
        }
        System.out.println();
        for (int i = 1; i <= n; i*=5) {
            System.out.print(i + ", " );
        }
    }
}
