package in.co.nmsworks.week2.day2;

public class Vehicle {
    public String model;
    public int yearOfMake;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    public void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }
}

class Car extends Vehicle{
    public int noOfDoors;

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public void display(){
        System.out.println("Model: " + model);
        System.out.println("Year of Make: " + yearOfMake);
        System.out.println("No of doors: " + noOfDoors);
    }
}

class Bike extends Vehicle{
    public enum Handlebar{
        RAISET, LOWER
    }

    public Handlebar h;

    public Handlebar getH() {
        return h;
    }

    public void setH(Handlebar h) {
        this.h = h;
    }

    public void display(){
        System.out.println("Model: " + model);
        System.out.println("Year of Make: " + yearOfMake);
        System.out.println("No of doors: " + h.name());
    }
}


