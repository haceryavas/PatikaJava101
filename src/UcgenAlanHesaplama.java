import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 26 Mayıs 2025
 * Bu proje üç kenarı verilen üçgenin alanını hesaplar.
 */
public class UcgenAlanHesaplama {
    public static void main(String[] args) {

        int a, b, c;
        double alan, u;
        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin birinci kenarını giriniz: ");
        a = input.nextInt();

        System.out.print("Üçgenin ikinci kenarını giriniz: ");
        b = input.nextInt();

        System.out.print("Üçgenin üçüncü kenarını giriniz: ");
        c = input.nextInt();

        u = (a + b + c) / 2.0;

        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin alanı: " + alan);
    }
}

