package it.develhope.vehicle;

public abstract class Vehicle {

    public Vehicle(String type, int numberOfWheels){
        this.type=type;
        this.numberOfWheels=numberOfWheels;
    }
    public Vehicle(String type){
        this.type=type;
    }
    String type;
    int numberOfWheels;

    public void showVehicleDetails(){
        System.out.println("car type is:"+this.type+" and has:"+this.numberOfWheels+" wheels. ");
    }
    public abstract void doVehicleSound();

}
