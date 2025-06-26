package Sınıflar.OgrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int oralNote;
    float oralWeight;
    float examWeight;


    public Course(String name, String code, String prefix, float oralWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.oralWeight = oralWeight;
        this.examWeight = 1 - oralWeight;
        this.note = 0;
        this.oralNote = 0;
    }

    public void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
            System.out.println(teacher.name + " " + this.name + " dersine öğretmen olarak eklendi.");
        } else {
            System.out.println(teacher.name + " " + this.name + " dersine öğretmen olarak eklenemez.");
        }
    }

    public void printTeacher() {
        if (this.teacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + teacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

}
