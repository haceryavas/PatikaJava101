import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 29 Mayıs 2025
 * Bu proje girilen sayıya göre ekrana elmas basar.
 */
public class ElmasYapimi {
    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        Scanner scan = new Scanner(System.in);
        int n;

        do {
            System.out.print("Lütfen tek sayı giriniz :");
            n = scan.nextInt();
        } while (n % 2 == 0);

        int yarisi = n / 2;

        for (int i = 0; i <= yarisi; i++) {
            for (int j = 1; j <= yarisi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = yarisi-1; i >=0; i--){
            for (int j = 1; j <= yarisi - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



