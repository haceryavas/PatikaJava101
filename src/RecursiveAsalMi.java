import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 24 Haziran 2025
 * Bu proje kullanıcıdan aldığı sayının asal olup olmadığını "Recursive" metot kullanarak kontrol eder.
 */
public class RecursiveAsalMi {

    static boolean isPrime(int number, int divisor) {

//        if (number <= 2)
//            return number == 2;
//        if (number != divisor){
//            if (number % divisor == 0)
//                return false;
//            else
//                return isPrime(number, divisor + 1);
//        }
//        else
//            return true;

        if (number <= 2)
            return number == 2;
        if (number % divisor == 0)
            return false;
        if (divisor * divisor > number)
            return true;
        return isPrime(number, divisor + 1);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = scan.nextInt();

        if (isPrime(number, 2))
            System.out.println(number + " sayısı bir asal sayıdır.");
        else
            System.out.println(number + " sayısı bir asal sayı değildir.");

    }
}
