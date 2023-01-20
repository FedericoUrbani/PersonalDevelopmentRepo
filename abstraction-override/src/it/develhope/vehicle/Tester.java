package it.develhope.vehicle;

public class Tester {
    public static void main(String[] args) {

        Car Maserati=new Car(4,4,1000000,"Levante Hybrid");
        Boat Gobbi=new Boat(70,1000,"Gobbi 23 Sport");

        Gobbi.doVehicleSound();
        Maserati.doVehicleSound();
        System.out.println(Gobbi.getBoatWeightAndSpeed());
    }
}