package Sınıflar.MaasHesaplayici;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        } else {
            return 0;
        }
    }

    public int bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int workYears = 2021 - this.hireYear;
        if (workYears < 10) {
            return this.salary * 0.05;
        } else if (workYears < 20) {
            return this.salary * 0.1;
        } else {
            return this.salary * 0.15;
        }
    }

    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryAfterTaxAndBonus = this.salary - tax + bonus;
        double totalSalary = salaryAfterTaxAndBonus + raise;

        return "Adı: " + this.name + "\n" +
                "Maaşı: " + this.salary + "\n" +
                "Çalışma Saati: " + this.workHours + "\n" +
                "Başlangıç Yılı: " + this.hireYear + "\n" +
                "Vergi: " + tax + "\n" +
                "Bonus: " + bonus + "\n" +
                "Maaş Artışı: " + raise + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş: " + salaryAfterTaxAndBonus + "\n" +
                "Toplam Maaş: " + totalSalary;
    }
}
