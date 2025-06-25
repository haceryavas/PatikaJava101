public class Main {
    public static void main(String[] args) {
        int number = 16;
        recursivePattern(number);
    }

    public static void recursivePattern(int n) {
        System.out.println(n); // Her adımda sayıyı yazdır

        // Negatif veya sıfır olana kadar 5 çıkararak git
        if (n <= 0) {
            return; // Burada dur, sonra geri dönerken ekleme yapacağız
        }

        recursivePattern(n - 5); // Derine git
        System.out.println(n); // Geri dönerken sayıyı tekrar yazdır
    }
}
