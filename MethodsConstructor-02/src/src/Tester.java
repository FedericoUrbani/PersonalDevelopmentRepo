package src;

public class Tester{
    public static void main(String[] args) {
        Student student1= new Student("Max");
        Student student2= new Student("Jhon");

        Teacher teacher= new Teacher();
        teacher.teacherName="Alfred";

        teacher.assignGrade(student1, 10);
        teacher.assignGrade(student2,6);

        student1.getStudentsDetails();
        student2.getStudentsDetails();
    }
}