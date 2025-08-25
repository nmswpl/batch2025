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

    public String display(){
        return "model: " + getModel() + " year: " + getYear();
    }

}

class Car extends Vehicle{

    private int noOfDoors;

    public Car() {
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    @Override
    public String display(){
        return super.display() +" no of door: "+ getNoOfDoors();
    }
}

class Bike extends Vehicle{
    public enum HandleBarType{
        RAISED,LOWER
    }
    private HandleBarType hBT;

    public HandleBarType gethBT() {
        return hBT;
    }

    public void sethBT(HandleBarType hBT) {
        this.hBT = hBT;
    }

    @Override
    public String display(){
        return super.display() +" handle bar type: "+ gethBT();
    }

}

