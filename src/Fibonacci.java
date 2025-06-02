import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 2 Haziran 2025
 * Bu proje kullancıdan aldığı eleman sayısına göre Fibonacci serisini yazar.
 */
public class Fibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n, el1 = 0, el2 = 1, el3;

        System.out.print("Eleman sayısını giriniz: ");
        n = scan.nextInt();

        for (int i = 1; i < n; i++) {
            el3 = el1 + el2;
            System.out.println(el1 + " + " + el2 + " = " + el3);
            el1 = el2;
            el2 = el3;
        }
    }
}
