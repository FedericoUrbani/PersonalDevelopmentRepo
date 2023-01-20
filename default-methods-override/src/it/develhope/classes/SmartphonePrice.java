package it.develhope.classes;

import java.util.Objects;

public class SmartphonePrice implements Cloneable{

    String priceType;
    String priceInEuros;

    @Override
    public String toString() {
        return "SmarthphonePrice{" +
                "priceType='" + priceType + '\'' +
                ", priceInEuros='" + priceInEuros + '\'' +
                '}';
    }

    @Override
    protected SmartphonePrice clone() throws CloneNotSupportedException {
        SmartphonePrice clonedSmartphonePrice= (SmartphonePrice)super.clone();
        return clonedSmartphonePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Objects.equals(priceType, that.priceType) && Objects.equals(priceInEuros, that.priceInEuros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }

    public SmartphonePrice(String priceType, String priceInEuros) {
        this.priceType = priceType;
        this.priceInEuros = priceInEuros;
    }


}
