package src;

public class Teacher {
    String teacherName;

    public Teacher (){
        System.out.println("Teacher obj has been created");
    }
    public void assignGrade(Student alumn, int finalGrade){
        alumn.grade=finalGrade;
    }
}
