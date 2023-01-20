package src.it.develhope.classes;

import src.it.develhope.interfaces.LearningPerson;
import src.it.develhope.interfaces.TeachingPerson;

public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson {

    boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int id, boolean willBeAPhD){
        this.name=name;
        this.surname=surname;
        this.collegeId=id;
        this.isGoingToBeAPhD=willBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println("informative message: Assistant can study");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("informtative message: Assistant can teach");
    }
}
