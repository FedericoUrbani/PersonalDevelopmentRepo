package src.it.develhope.classes;

public class Tester {
    public static void main(String[] args) {

        Animal animal=new Animal();
        Lion lion=new Lion();
        Cow cow=new Cow();

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }
}