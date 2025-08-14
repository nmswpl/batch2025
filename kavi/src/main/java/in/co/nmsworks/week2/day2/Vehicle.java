package in.co.nmsworks.week2.day2;

public class Vehicle {
    private String model;
    private int year;
    private int noOfDoor;

    public int getNoOfDoor() {
        return noOfDoor;
    }

    public void setNoOfDoor(int noOfDoor) {
        this.noOfDoor = noOfDoor;
    }

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

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public Vehicle(){

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
