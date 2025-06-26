package Sınıflar.OgrenciBilgiSistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    int classes;
    double avarage;
    boolean isPass;

    public Student(String name, String stuNo, int classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0;
        this.isPass = false;
    }

    public void addBulkExamNote(int fizik, int tarih, int mat) {
        if (fizik >= 0 && fizik <= 100) {
            this.c1.note = fizik;
        }
        if (tarih >= 0 && tarih <= 100) {
            this.c2.note = tarih;
        }
        if (mat >= 0 && mat <= 100) {
            this.c3.note = mat;
        }

    }

    public void addBulkOralNote(int fizik, int tarih, int mat) {
        if (fizik >= 0 && fizik <= 100) {
            this.c1.oralNote = fizik;
        }
        if (tarih >= 0 && tarih <= 100) {
            this.c2.oralNote = tarih;
        }
        if (mat >= 0 && mat <= 100) {
            this.c3.oralNote = mat;
        }

    }


    public void isPass() {
        calcAvarage();
        printNote();
        if(this.isPass){
            System.out.println("Tebrikler geçtiniz!\nOrtalamanız: " + this.avarage);
        } else {
            System.out.println("Kaldınız! Sınıf tekrarı!\nOrtalamanız: " + this.avarage);
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.c1.note * this.c1.examWeight + this.c1.oralNote * this.c1.oralWeight)
                      + (this.c2.note * this.c2.examWeight + this.c2.oralNote * this.c2.oralWeight)
                      + (this.c3.note * this.c3.examWeight + this.c3.oralNote * this.c3.oralWeight)) / 3.0;

        if(this.avarage >= 55.0){
            this.isPass = true;
        } else{
            this.isPass = false;
        }
    }

    public void printNote() {
        System.out.println("=======================================================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println(this.c1.name + ": " + this.c1.note);
        System.out.println(this.c2.name + ": " + this.c2.note);
        System.out.println(this.c3.name + ": " + this.c3.note);
        System.out.println(this.c1.name + " Sözlü Notu: " + this.c1.oralNote);
        System.out.println(this.c2.name + " Sözlü Notu: " + this.c2.oralNote);
        System.out.println(this.c3.name + " Sözlü Notu: " + this.c3.oralNote);
    }
}
