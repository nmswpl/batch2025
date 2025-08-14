package in.co.nmsworks.week2.day2;
public class Vechicle {
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

    public String display() {
        return "Model: " + getModel() + "\nYear: "  + getYear();
    }

}


class Bike extends Vechicle {
    public enum HandleBarType {
        RAISED,
        LOWERED;
    }

    private  HandleBarType hbType;

    public HandleBarType getHbType() {
        return hbType;
    }

    public void setHbType(HandleBarType hbType) {
        this.hbType = hbType;
    }

    public String display() {
        return super.display()+"Handle Bar: "+getHbType();
    }


}

class Car extends Vechicle {
    private int noOfDoors;

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public Car(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public String display() {
        return super.display()+"Number of Doors:"+getNoOfDoors();
    }
}
