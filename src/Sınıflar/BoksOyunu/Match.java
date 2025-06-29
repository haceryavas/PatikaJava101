package Sınıflar.BoksOyunu;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    boolean isMatchStarted = false;
    boolean firstPlayer;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (checkWeight()) {
            firstPlayer = getFirstPlayer();

            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("=============== YENİ ROUND ===============");

                if(firstPlayer){
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }

                } else {
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                }

                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor");
        }
    }

    boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) &&
                (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        }

        if (f2.health == 0) {
            System.out.println("Maçı Kazanan : " + f1.name);
            return true;
        }

        return false;
    }

    public void printScore() {
        System.out.println("---------------------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }

    boolean getFirstPlayer(){
        double randomValue = Math.random();
        return randomValue <= 0.5;
    }
}
