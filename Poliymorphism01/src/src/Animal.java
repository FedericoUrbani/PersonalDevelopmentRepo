public class Animal {
    String animalName;

    public Animal() {

    }

    public void animalSound() {
        System.out.println("Roarr!");
    }

    public void animalSound(String intensity) {
        switch (intensity) {

            case "high":
                System.out.println("Roarrrrrrrr!");
                break;
            case "low":
                System.out.println("Roar");
                break;
            default:
                System.out.println("cannot reproduce it properly");
        }
    }
}