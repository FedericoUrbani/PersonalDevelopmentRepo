package src.it.develhope.classes;

public class Tester{
    public static void main(String[] args) {

        Student student=new Student("Max","Maxwell",97468,2022);
        Professor professor=new Professor("Micheal","Sunder",33455,"History");
        Assistant assistant=new Assistant("Rosa","Bloom", 82388,true);

        student.gotToCollege();
        professor.gotToCollege();
        assistant.gotToCollege();

        student.studyAtHome();
        assistant.studyAtHome();
        professor.teachToOtherPeople();

    }
}