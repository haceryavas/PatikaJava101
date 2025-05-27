import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 27 Mayıs 2025
 * Bu proje girilen 3 sayıyı küçükten büyüğe sıralar.
 */
public class KucuktenBuyuge {
    public static void main(String[] args) {

        int a, b, c;
        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        a = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b = inp.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        c = inp.nextInt();

        System.out.print("Küçükten büyüğe sıralanmış hali: ");
        if (a < b && a < c) {
            if (b < c)
                System.out.println(a + " < " + b + " < " + c);
            else
                System.out.println(a + " < " + c + " < " + b);

        } else if (b < a && b < c) {
            if (a < c)
                System.out.println(b + " < " + a + " < " + c);
            else
                System.out.println(b + " < " + c + " < " + a);

        } else {
            if (b < a)
                System.out.println(c + " < " + b + " < " + a);
            else
                System.out.println(c + " < " + a + " < " + b);

        }
    }
}
