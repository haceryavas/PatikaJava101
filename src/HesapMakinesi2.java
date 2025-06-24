import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 24 Haziran 2025
 * Bu proje hesap makinesi görevi görür.
 */
public class HesapMakinesi2 {
    static double plus(int a, int b) {
        return a + b;
    }

    static double minus(int a, int b) {
        return a - b;
    }

    static double times(int a, int b) {
        return a * b;
    }

    static double divided(int a, int b) {
        return a / b;
    }

    static double power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static double factorial(int a) {
        int result = 1;
        for (int i = a; i >= 1; i--)
            result *= i;
        return result;
    }

    static double mod(int a, int b) {
        return a % b;
    }

    static void areaPerimeter(int a, int b) {
        System.out.println("Dikdörtgenin Alanı: " + a * b);
        System.out.println("Dikdörtgenin Çevresi: " + 2 * (a + b));
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int select, a, b = 0;
        double result = 0;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        System.out.println(menu);

        while (true) {
            System.out.print("İşlem seçiniz: ");
            select = scan.nextInt();
            if (select == 0) {
                System.out.println("Güle Güle.");
                break;
            } else if (select > 8) {
                System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            } else {
                System.out.print("Birinci sayı: ");
                a = scan.nextInt();
                if (select != 6) {
                    System.out.print("İkinci sayı: ");
                    b = scan.nextInt();
                }

                result = 0;
                switch (select) {
                    case 1:
                        result = plus(a, b);
                        break;
                    case 2:
                        result = minus(a, b);
                        break;
                    case 3:
                        result = times(a, b);
                        break;
                    case 4:
                        if (b == 0)
                            System.out.println("0'a Bölme Hatası!");
                        else
                            result = divided(a, b);
                        break;
                    case 5:
                        result = power(a, b);
                        break;
                    case 6:
                        result = factorial(a);
                        break;
                    case 7:
                        result = mod(a, b);
                        break;
                    case 8:
                        areaPerimeter(a, b);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
                }
                System.out.println("Sonuç: " + result);
            }


        }

    }
}