import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 27 Mayıs 2025
 * Bu proje hava sıcaklığına göre etkinlik önerir.
 */
public class EtkinlikOnerme {
    public static void main(String[] args) {

        int sicaklik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sıcaklık değerini giriniz: ");
        sicaklik = inp.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (sicaklik <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (sicaklik <= 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirisiniz.");
        }

    }
}
