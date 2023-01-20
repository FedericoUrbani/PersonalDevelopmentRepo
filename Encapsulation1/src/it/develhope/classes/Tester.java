package it.develhope.classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Tester {
    public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    House house=new House();
    house.setFloorNumber(3);

    String [] arrayBase= new String[house.getFloorNumber()];
    house.setResidentNames(arrayBase);

    System.out.println("Write the resident for each floor, press send to write the next one. ");


    String baseString="";
    for(int i=0;i< house.getFloorNumber();i++){
        String input= reader.readLine();

        baseString=baseString.concat(input+",");
        house.setResidentNames(input, i);


    }
    System.out.println(baseString.substring(0, baseString.length() - 1));
    String placeholder1= house.getResidentNames(0);
    String placeholder2=house.getResidentNames(1);
    String placeholder3=house.getResidentNames(2);
    String print=String.format( "Floor 1 is: %s, floor 2 is: %s, floor 3 is: %s.",placeholder1,placeholder2,placeholder3);
    System.out.println(print);

    }
}