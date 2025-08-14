package in.co.nmsworks.week2.day2;

public class Car extends Vehicle{
    int noOfDoor=4;

    public int getNoOfDoor() {
        return noOfDoor;
    }

    public void setNoOfDoor(int noOfDoor) {
        this.noOfDoor = noOfDoor;
    }
    public Car(){

    }

    public Car(String model, int year, int noOfDoor) {
        super(model, year);
        this.noOfDoor = noOfDoor;
    }

    public Car(int noOfDoor) {
        this.noOfDoor = noOfDoor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfDoor=" + noOfDoor +
                '}';
    }
}
