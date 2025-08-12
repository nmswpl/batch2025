package in.co.nmsworks.week2.day2;

public class Vehicle {
    private String model;
    private int yearOfMake;

    public Vehicle() {

    }

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

    public String display(){
        return "Model: " + model + " " + "Year: " + yearOfMake + " ";
    }
}

class Car extends Vehicle{
    private int noOfDoors=4;

    public int getNoOfDoors() {
        return noOfDoors;
    }


    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public String display() {
        return super.display() +  "No Of Doors: " + noOfDoors;
    }


}

class Bike extends Vehicle {
    public enum handleBar {
        RAISED,
        LOWERED
    }

    @Override
    public String display() {
        handleBar handle = handleBar.LOWERED;
        return super.display() + "Handle bar: " + handle;
    }
}

class Main{
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.setModel("i20");
        car.setYearOfMake(2021);

        Vehicle bike = new Bike();
        bike.setModel("Splendor");
        bike.setYearOfMake(2015);

        System.out.println(car.display());
        System.out.println(bike.display());
    }
}
