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


    public String display()
    {
        return "Model: "+getModel()+"Year: "+getYear();
    }

}

class Car extends Vehicle
{
    int noOfDoors;



    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public String display()
    {
        return super.display()+"No of doors: "+getNoOfDoors();
    }


}

class Bike extends Vehicle
{

    public enum handleBarType{
        RAISED,LOWERED;
    }
    private handleBarType hbtype;
    public handleBarType getHbtype() {
        return hbtype;
    }

    public void setHbtype(handleBarType hbtype) {
        this.hbtype = hbtype;
    }



    @Override
    public String display() {
        return super.display()+"hbtype: "+hbtype;
    }
}
