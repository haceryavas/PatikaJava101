import java.util.Scanner;

/**
 * @author Hacer Nur YAVAŞ - 24 Haziran 2025
 * Bu proje kullancıdan aldığı sayının palindrom bir sayı olup olmadığını kontrol eder.
 */
public class Palindrom {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastDigit;

        while (temp != 0) {
            lastDigit = temp % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            temp /= 10;
        }

        if (number == reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scan.nextInt();
        if (isPalindrom(number))
            System.out.println(number + " sayısı bir palindrom sayıdır.");
        else
            System.out.println(number + " sayısı bir palindrom sayı değildir.");
    }
}
