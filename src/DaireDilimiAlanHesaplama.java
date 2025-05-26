import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 26 Mayıs 2025
 * Bu proje daire diliminin alanını hesaplar.
 */
public class DaireDilimiAlanHesaplama {
    public static void main(String[] args) {

        int r, aci;
        double alan, pi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();

        System.out.print("Daire diliminin açısını giriniz: ");
        aci = input.nextInt();

        alan = (pi * r * r * aci) / 360.0;

        System.out.println("Dairenin alanı: " + alan);
    }
}
