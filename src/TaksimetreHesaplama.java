import java.util.Scanner;
/**
 * @author Hacer Nur YAVAŞ - 26 Mayıs 2025
 * Bu proje girilen km ye göre taksimetre hesaplar.
 */
public class TaksimetreHesaplama {
    public static void main(String[] args) {

        int km;
        double KM_BASINA_UCRET = 2.20, MIN_ODENECEK = 20, ACILIS_UCRETI = 10, tutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilecek mesafeyi KM cinsinden giriniz: ");
        km = input.nextInt();

        tutar = KM_BASINA_UCRET * km;
        tutar += ACILIS_UCRETI;
        tutar = (tutar < MIN_ODENECEK) ? MIN_ODENECEK : tutar;

        System.out.println("Ödenecek tutar: " + tutar);


    }
}
