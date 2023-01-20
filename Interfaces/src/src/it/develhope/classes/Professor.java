package src.it.develhope.classes;

import src.it.develhope.interfaces.TeachingPerson;

public class Professor extends CollegePerson implements TeachingPerson {

    String teachingObject;

    public Professor(String name, String surname, int id, String subject){
        this.name=name;
        this.surname=surname;
        this.collegeId=id;
        this.teachingObject=subject;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("informative message: teacher can teach");
    }
}
