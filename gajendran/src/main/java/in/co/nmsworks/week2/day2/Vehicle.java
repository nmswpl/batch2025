package in.co.nmsworks.week2.day2;

public class Vehicle {

    private String model;
    private int year;

    @Override
    public String toString() {
        return
                "model='" + model  +
                ", year=" + year + ", ";
    }

    public void setModelAndYear(String model, int year) {
        this.model = model;
        this.year = year;
    }


}


class Bike extends Vehicle{

    public enum HandelBarType{
        RISER, LOWER;
    }

    HandelBarType type;

    public void setData(HandelBarType type, int year, String model){
        this.type = type;
        super.setModelAndYear(model,year);
    }



    public void display() {
       System.out.println( super.toString() +
                "type=" + type );
    }
}


class Car extends Vehicle{

    private int numberOfDoor;



    public void setData(int numberOfDoor, int year, String model){
        this.numberOfDoor = numberOfDoor;
        super.setModelAndYear(model,year);
    }


    public void display() {
        System.out.println(super.toString() +
                "Number Of Door=" + numberOfDoor );
    }
}





