package Sınıflar.BoksOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Mike Tyson", 20, 90, 90, 30);
        Fighter f2 = new Fighter("Logan Paul", 10, 100, 95, 40);

        Match m1 = new Match(f1, f2, 90, 100);

        m1.run();
    }

}
