package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("insert person name.");
        String name=reader.readLine();
        System.out.println("insert person surname.");
        String surname=reader.readLine();
        System.out.println("insert person height like (1.80)");
        double height=(Double.parseDouble(reader.readLine()));
        System.out.println("insert person age:");
        int age= Integer.parseInt(reader.readLine());
        Person person= new Person(name,surname,height,age);

        System.out.println(person.toString());
    }
}