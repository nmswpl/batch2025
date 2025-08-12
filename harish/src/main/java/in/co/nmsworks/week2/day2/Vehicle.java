package in.co.nmsworks.week2.day2;

public class Vehicle {

    String model;

    int year;

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

class Car extends Vehicle{

    int numberOfSeats;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public void display(){

        System.out.println("the model :" + model + "\tyaer :" + year +"\tNo of seats:" + numberOfSeats );
    }
}

class Bike extends Vehicle{

    public enum HandleBar{UPPER,LOWER}

    public void display(HandleBar handletype){
        System.out.println("the model :" + model + "\tyear :" + year + "\t Handlebar type :" + handletype);
    }

}