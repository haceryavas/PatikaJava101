import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 24 Haziran 2025
 * Bu proje kullanıcıdan alınan n değerine göre aşağıdaki kurala göre ekrana çıktı verir.
 * Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
 * Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
 * Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
 * Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
 */
public class RecursiveDesenOlusturma {

    static void metot(int n, int n2, int eksilenOrArtan, boolean sifirinAltinaIndiMi) {
        System.out.print(n2 + " ");

        if (n2 <= 0) {
            eksilenOrArtan = 5;
            sifirinAltinaIndiMi = true;
        }
        if (!sifirinAltinaIndiMi)
            eksilenOrArtan = -5;

        n2 += eksilenOrArtan;

        if (n2 > n) {
            return;
        }

        metot(n, n2, eksilenOrArtan, sifirinAltinaIndiMi);
    }

//    public static void recursivePattern(int n) { //Çok daha kolay bir yolu
//        System.out.println(n); // Her adımda sayıyı yazdır
//
//        // Negatif veya sıfır olana kadar 5 çıkararak git
//        if (n <= 0) {
//            return; // Burada dur, sonra geri dönerken ekleme yapacağız
//        }
//
//        recursivePattern(n - 5); // Derine git
//        System.out.println(n); // Geri dönerken sayıyı tekrar yazdır
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n = scan.nextInt();
        System.out.print("Çıktısı: ");
        metot(n, n, 5, false);
    }


}

