package model;

import java.util.Objects;

public class Farmer extends User{
    // Attributes
    public int farmSize, areaAvailForFarming;

    // Empty constructor
    public Farmer(){}

    // Constructors
    public Farmer(int farmSize, int areaAvailForFarming) {
        this.farmSize = farmSize;
        this.areaAvailForFarming = areaAvailForFarming;
    }
    // Getters
    public int getFarmSize() {
        return farmSize;
    }
    public int getAreaAvailForFarming() {
        return areaAvailForFarming;
    }

    // Setters
    public void setFarmSize(int farmSize) {
        this.farmSize = farmSize;
    }
    public void setAreaAvailForFarming(int areaAvailForFarming) {
        this.areaAvailForFarming = areaAvailForFarming;
    }

    // equals() & hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Farmer)) return false;
        if (!super.equals(o)) return false;
        Farmer farmer = (Farmer) o;
        return getFarmSize() == farmer.getFarmSize() && getAreaAvailForFarming() == farmer.getAreaAvailForFarming();
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFarmSize(), getAreaAvailForFarming());
    }

    // toString()
    @Override
    public String toString() {
        return "Farmer[" +
                "farmSize: " + farmSize +
                ", areaAvailForFarming: " + areaAvailForFarming +
                ']';
    }
}
