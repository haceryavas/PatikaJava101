import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 30 Mayıs 2025
 * Bu proje atm işlemlerini yapar.
 */
public class Atm {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userName, password;
        int select, price, right = 3, balance = 1500;

        while (right > 0) {

            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = scan.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = scan.nextLine();

            if (userName.equals("hacer") && password.equals("12345")) {
                System.out.println("Kodluyoruz Bankasına Hoşgeldiniz!");

                do {
                    System.out.println("------------------------------------\n" +
                            "1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap\n" +
                            "------------------------------------");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    select = scan.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            price = scan.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            price = scan.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                        default:
                            System.out.println("Yanlış değer girdiniz! Tekrar deneyin.");
                            break;
                    }
                } while (select != 4);
                break;
            } else {
                right--;

                if (right == 0)
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçin.");
                else{
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyin.");
                    System.out.println("Kalan hakkınız: " + right);
                }

            }
        }
    }
}
