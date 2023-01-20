package it.develhope.vehicle;

public class Car extends Vehicle{

    int numberOfDoors;
    double carPrice;

    @Override
    public void doVehicleSound() {
    System.out.println("car sounds like: brum brum");
    }

    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("the car has "+this.numberOfDoors+" doors");
    }

    public Car (int wheels, int doors, int price,String type){
        super(type,wheels);
        this.numberOfDoors=doors;
        this.carPrice=price;
    }

}
