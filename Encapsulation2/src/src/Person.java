package src;

public class Person {

    String name;
    String surname;
    double height;
    int age;

    public Person(String name, String surname, double height, int age) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
