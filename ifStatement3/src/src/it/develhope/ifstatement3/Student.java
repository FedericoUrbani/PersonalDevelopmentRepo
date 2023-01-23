package src.it.develhope.ifstatement3;

import java.util.Random;

public class Student {

    String name;
    Integer age;

    public Student (String studentname, Integer studentAge){
        this.age=studentAge;
        this.name=studentname;
    }

    public void guessingAge(){
        Random gen = new Random();
        int guess = 1+ gen.nextInt(35);

        if (guess>this.age){
            System.out.println("your guess is higer to the student age");
        }else if(guess<this.age){
            System.out.println("your guess is lower to the student age");
        }else{
            System.out.println("U GOT THAT! LOL");
        }
    }

}
