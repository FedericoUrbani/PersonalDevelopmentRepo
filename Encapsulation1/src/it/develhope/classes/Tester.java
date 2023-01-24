package it.develhope.classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Tester {
    public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    House house=new House();
    String [] arrayStrings= new String[3];

    System.out.println("Write the resident , press send to write the next one. ");


    for(int i=0;i<arrayStrings.length;i++){
        String input= reader.readLine();
        arrayStrings[i]=input;


    }
        house.setResidentNames(arrayStrings);
        String print=String.format( "%s,%s,%s",house.getResidentNames(0),house.getResidentNames(1),house.getResidentNames(2));
        System.out.print(print);

    }
}