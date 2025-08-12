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

    public String display() {
        return "Vehicle: " +
                "model=" + model  +
                ", year=" + year ;
    }
}

class Bike extends Vehicle{

    public enum HandleBarType{
        RAISED,LOWERED
    }

    private HandleBarType hbType;

    public HandleBarType getHbType() {
        return hbType;
    }

    public void setHbType(HandleBarType hbType) {
        this.hbType = hbType;
    }

    @Override
    public String display() {
        return super.display()+" HandleBar Type: "+getHbType();
    }
}

class Car extends Vehicle{
    int noOfDoors;

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
}
    @Override
    public String display() {
        return super.display()+" No of Doors: "+getNoOfDoors();
    }
}
