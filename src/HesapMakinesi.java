import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        int n1, n2, select;
        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        n1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = inp.nextInt();

        System.out.print("Yapmak istediğiniz işlemi seçiniz.\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case 2:
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case 3:
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                break;
            case 4:
                if(n2 != 0)
                    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                else
                    System.out.println("Bir sayı sıfıra bölünemez.");
                break;
            default:
                System.out.println("Yanlış seçim yaptınız:");
                break;
        }

    }
}
