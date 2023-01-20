package it.develhope.classes;

public class House {

    private int floorNumber;
    private String address;
    private String[] residentNames;

    public int getFloorNumber() {
        return floorNumber;
    }

    public String getAddress() {
        return address;
    }

    public String[] getResidentNames() {
        return residentNames;
    }
    public String getResidentNames(int i) {
        return getResidentNames()[i];
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setResidentNames(String[] residentNames) {
        this.residentNames = residentNames;
    }
    public void setResidentNames(String residentNames, int i) {
        this.residentNames[i] = residentNames;
    }

}
