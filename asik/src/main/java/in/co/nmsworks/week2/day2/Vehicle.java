package in.co.nmsworks.week2.day2;

public class Vehicle
{
    private String model;
    private int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

class Car extends Vehicle
{
    private int noOfDoors;

    public Car()
    {}

    public Car(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    @Override
    public String toString() {
        return "Model = " + getModel() + " Year = " + getYear() + " No Of Doors = " + getNoOfDoors();
    }
}

class Bike extends Vehicle
{
    
    public enum HandleBarType
    {
        RAISED, LOWERED;
    }

    HandleBarType hbType;

    public HandleBarType getHbType() {
        return hbType;
    }

    public void setHbType(HandleBarType hbType) {
        this.hbType = hbType;
    }

    public Bike()
    {}

    @Override
    public String toString() {
        return "Model = "+ getModel() + " Year = " + getYear() + " HandleBarType = " + getHbType();
    }
}