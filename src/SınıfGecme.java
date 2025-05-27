import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 27 Mayıs 2025
 * Bu proje sınıf geçme durumunu kontrol eder.
 */
public class SınıfGecme {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik, total = 0, sayac = 0;
        double average;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        mat = inp.nextInt();
        System.out.print("Fizik notunu giriniz: ");
        fizik = inp.nextInt();
        System.out.print("Türkçe notunu giriniz: ");
        turkce = inp.nextInt();
        System.out.print("Kimya notunu giriniz: ");
        kimya = inp.nextInt();
        System.out.print("Müzik notunu giriniz: ");
        muzik = inp.nextInt();

        if (mat >= 0 && mat <= 100) {
            total += mat;
            sayac++;
        } else
            System.out.println("Matematik notu ortalamaya katılmadı.");

        if (fizik >= 0 && fizik <= 100) {
            total += fizik;
            sayac++;
        } else
            System.out.println("Fizik notu ortalamaya katılmadı.");

        if (turkce >= 0 && turkce <= 100) {
            total += turkce;
            sayac++;
        } else
            System.out.println("Türkçe notu ortalamaya katılmadı.");

        if (kimya >= 0 && kimya <= 100) {
            total += kimya;
            sayac++;
        } else
            System.out.println("Kimya notu ortalamaya katılmadı.");

        if (muzik >= 0 && muzik <= 100) {
            total += muzik;
            sayac++;
        } else
            System.out.println("Müzik notu ortalamaya katılmadı.");

        average = (double) total / sayac;

        if (average > 55.0)
            System.out.println("Tebrikler sınıfı geçtiniz!");
        else
            System.out.println("Sınıfta kaldınız.");
        System.out.println("Ortalama: " + average);

    }
}
