import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 29 Mayıs 2025
 * Bu proje 0'dan girilen sayıya kadar 3 ve 4'e tam bölünen sayıların ortalamasını hesaplar..
 */
public class OnikiyeTamBolunen {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int sayi, toplam = 0, sayac = 0;
        double ort = 0;

        System.out.print("Bir sayı giriniz: ");
        sayi = inp.nextInt();

        for (int i = 0; i <= sayi; i++)
        {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam += i;
                sayac++;
            }
        }
        ort = (double) toplam / sayac;
        System.out.println("Ortalama: " + ort);
    }
}
