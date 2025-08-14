package in.co.nmsworks.week2.day2;

public class Vehicle {
    String model;
    String yearOfManufacture;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String display(){
        return "Model : "+model+", Year : "+yearOfManufacture;
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
        return super.display() + ", No.Of Doors "+noOfDoors;
    }
}

class Bike extends Vehicle{
    public enum HandleBarType {
        RAISED,
        LOWERED;
    }

    private HandleBarType hb;

    public HandleBarType getHb() {
        return hb;
    }

    public void setHb(HandleBarType hb) {
        this.hb = hb;
    }

    @Override
    public String display() {
        return super.display()+", HandleBar Type : "+hb;
    }
}
