package in.co.nmsworks.week2.day2;

public class Vehicle {

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

    public void display(){
        System.out.println("Model : " + getModel());
        System.out.println("Year : " + getYear());
    }

}

class Car extends Vehicle{

    private int noOfDoors;
    Car(int noOfDoors){
        this.noOfDoors = noOfDoors;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    public void display(){
        super.display();
        System.out.println("No of Doors :" + getNoOfDoors());
    }
}

class Bike extends Vehicle{

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    public enum HandleBarType {
        RAISED, LOWERED
    }
    private HandleBarType hbtype;

    public HandleBarType getHbtype() {
        return hbtype;
    }

    public void setHbtype(HandleBarType hbtype) {
        this.hbtype = hbtype;
    }

    public void display(){
        super.display();
        System.out.println("Handle Bar Type :" + getHbtype());
    }
}
