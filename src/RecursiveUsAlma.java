import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 24 Haziran 2025
 * Bu proje taban ve üs değerleri kullanıcıdan alır ve üs alma işlemini "Recursive" metot kullanarak yapar.
 */
public class RecursiveUsAlma {

    static int pow(int a, int b) {

        if (a == 0 && b == 0) {
            System.out.println("O üzeri 0 belirsizdir.");
            return 0;
        } else if (a == 0) {
            return 0;
        } else if (b == 0) {
            return 1;
        } else {
            return a * pow(a, b - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.print("Taban değeri giriniz: ");
        a = scan.nextInt();
        System.out.print("Üs değerini giriniz: ");
        b = scan.nextInt();
        System.out.println("Sonuç: " + pow(a, b));
    }
}
