import java.util.Scanner;
/**
 * @author Hacer Nur YAVAŞ - 24 Haziran 2025
 * Bu proje kullanıcıdan aldığı sayının asal olup olmadığını "Recursive" metot kullanarak kontrol eder.
 */
public class RecursiveAsalMi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = scan.nextInt();

        boolean isAsal;

        for (int i = 1; i <= 100; i++) {
            isAsal = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isAsal = true;
                }
            }
            if (!isAsal && i != 1)
                System.out.print(i + " ");
        }
    }
}
