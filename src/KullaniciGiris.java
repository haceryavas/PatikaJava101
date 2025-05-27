import java.util.Scanner;
/**
 * @author Hacer Nur YAVAŞ - 27 Mayıs 2025
 * Bu kullanıcı girişi yapar.
 */
public class KullaniciGiris {
    public static void main(String[] args) {

        String userName, password, newPassword;
        int select;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz: ");
        userName = inp.nextLine();
        System.out.print("Şifreyi giriniz: ");
        password = inp.nextLine();

        if(userName.equals("hacer") && password.equals("12345")){
            System.out.println("Giriş başarılı.");

        } else if (!userName.equals("hacer") && password.equals("12345")) {
            System.out.println("Kullanıcı adını yanlış girdiniz!");

        } else if (userName.equals("hacer") && !password.equals("12345")) {
            System.out.print("Şifre yanlış! Sıfırlamak ister misiniz?\n1-Evet\n2-Hayır\n");
            select = inp.nextInt();
            inp.nextLine();

            switch (select){
                case 1:
                    System.out.print("Yeni şifreyi girin: ");
                    newPassword = inp.nextLine();

                    if (newPassword.equals("12345")){
                        System.out.println("Hata! Yeni şifreniz eski şifre ile aynı olamaz!");
                    } else {
                        password = newPassword;
                        System.out.println("Şifre oluşturuldu. Yeni şifre: " + password);

                    }
                    break;
                case 2:
                    System.out.println("Tekrar deneyin.");
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız! Tekrar deneyin.");
                    break;
            }

        } else {
            System.out.println("Giriş başarısız. Tekrar deneyin.");
        }
    }
}
