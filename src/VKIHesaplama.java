import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 26 Mayıs 2025
 * Bu proje Vücut Kitle İndeksi hesaplar.
 */
public class VKIHesaplama {
    public static void main(String[] args) {

        int kilo;
        double boy, VKI;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = inp.nextInt();

        VKI = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksi: " + VKI);
    }
}
