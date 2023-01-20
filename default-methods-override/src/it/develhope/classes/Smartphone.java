package it.develhope.classes;


import java.lang.Cloneable;
import java.util.Objects;

public class Smartphone implements Cloneable{

     String brandName;
     String modelName;
     int batterymaAh;
     SmartphonePrice producerPrice;
     SmartphonePrice retailPrice;

    @Override
    public String toString() {
        return "Smartphone{" +
                "brandName='" + this.brandName + '\'' +
                ", modelName='" + this.modelName + '\'' +
                ", batterymaAh=" + this.batterymaAh +
                ", producerPrice=" + this.producerPrice +
                ", retailPrice=" + this.retailPrice +
                '}';

    }

    public Smartphone(String brandName,
                      String modelName,
                      int batterymaAh,
                      SmartphonePrice producerPrice,
                      SmartphonePrice retailPrice) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.batterymaAh = batterymaAh;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone that)) return false;
        return batterymaAh == that.batterymaAh &&
                Objects.equals(brandName, that.brandName) &&
                Objects.equals(modelName, that.modelName) &&
                Objects.equals(producerPrice, that.producerPrice) &&
                Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymaAh, producerPrice, retailPrice);
    }

    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone= (Smartphone) super.clone();
        clonedSmartphone.producerPrice=this.producerPrice;
        clonedSmartphone.retailPrice=this.retailPrice;

        return clonedSmartphone;
    }

    public Smartphone(){

    }
}
