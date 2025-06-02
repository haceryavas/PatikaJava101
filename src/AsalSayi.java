/**
 * @author Hacer Nur YAVAŞ - 2 Haziran 2025
 * Bu proje 1 - 100 arasındaki asal sayıları ekrana yazar.
 */
public class AsalSayi {
    public static void main(String[] args) {

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
