package Sınıflar.OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Hacer", "555", "FZK");
        Teacher t2 = new Teacher("Murat", "444", "TRH");
        Teacher t3 = new Teacher("Öykü", "777", "MAT");

        Course fizik = new Course("Fizik", "101", "FZK",0.20F);
        Course tarih = new Course("Tarih", "102", "TRH",0.40F);
        Course mat = new Course("Matematik", "103", "MAT",0.30F);

        fizik.addTeacher(t1);
        tarih.addTeacher(t2);
        mat.addTeacher(t3);

        //fizik.printTeacher();
        //tarih.printTeacher();
        //mat.printTeacher();

        Student s1 = new Student("Kağan", "123", 3, fizik, tarih, mat);
        s1.addBulkExamNote(50,30,60);
        s1.addBulkOralNote(60,70,90);
        s1.isPass();

        Student s2 = new Student("Umay", "124", 3, fizik, tarih, mat);
        s2.addBulkExamNote(80,90,60);
        s2.addBulkOralNote(50,65,70);
        s2.isPass();

        Student s3 = new Student("Ata", "125", 3, fizik, tarih, mat);
        s3.addBulkExamNote(70,60,50);
        s3.addBulkOralNote(85,95,30);
        s3.isPass();

    }
}
