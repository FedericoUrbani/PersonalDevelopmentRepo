package src;

public class Student {

    String name;
    int grade;

    public Student(String studentName){
        this.name=studentName;
    }

    public void getStudentsDetails(){
        System.out.println("student name: "+name+" Student grade "+grade );
    }

}
