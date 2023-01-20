package it.develhope.vehicle;

public class Boat extends Vehicle {
    @Override
    public void doVehicleSound() {
        System.out.println("sound of a boat: trutrutru");
    }

    double maxKnotSpeed;
    int boatKilosWight;

    public Boat(int maxSpeed, int weight, String type) {
        super(type);
        this.maxKnotSpeed = maxSpeed;
        this.boatKilosWight = weight;
    }

    public String getBoatWeightAndSpeed() {
        String informativeString="total kilos weight: "+boatKilosWight+" maximum knots speed:"+maxKnotSpeed;
        return informativeString;
    }

}
