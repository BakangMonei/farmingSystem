package model;

import java.util.Objects;

public class Administrator extends User{
    // Attributes
    private int workID;

    // Empty Constructors
    public Administrator(){
    }

    // Constructors
    public Administrator(int workID) {
        this.workID = workID;
    }

    // Getters
    public int getWorkID() {
        return workID;
    }

    // equals() & hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Administrator)) return false;
        if (!super.equals(o)) return false;
        Administrator that = (Administrator) o;
        return getWorkID() == that.getWorkID();
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getWorkID());
    }

    // toStrings()
    @Override
    public String toString() {
        return "Administrator[" +
                "workID: " + workID +
                ']';
    }
}
