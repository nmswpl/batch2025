package in.co.nmsworks.week2.day2;

public class Car extends Vehicle
{
    private int noOfDoors;

    public Car() {
    }

    public Car(String model , int yearMake ,int noOfDoors) {
        super.setModel(model);
        super.setYearMake(yearMake);
        this.noOfDoors = noOfDoors;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    @Override
    void display() {
        super.display();
        System.out.println(this.noOfDoors);
    }
}
