package in.co.nmsworks.runner;

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

    public String printDetails()
    {
            return "MODEL : "+model+" "+"YEAR : "+year;
    }



}
class Car extends Vehicle{

    private int noofdoors;


    public int getNoofdoors() {
        return noofdoors;
    }

    public void setNoofdoors(int noofdoors) {
        this.noofdoors = noofdoors;
    }

    public Car() {
        this.noofdoors = noofdoors;
    }

    @Override
    public String printDetails() {
       return super.printDetails()+" NO OF DOORS : "+noofdoors;
    }
}

class Bike extends Vehicle
{

    public enum HANDLEBAR
    {
        RISED,LOWERED

    }
    private HANDLEBAR hbtype;

    public HANDLEBAR getHbtype()
    {
        return hbtype;
    }

    public void setHbtype(HANDLEBAR hbtype)
    {
        this.hbtype = hbtype;
    }



    @Override
    public String printDetails() {
        return super.printDetails() + " HANDLE BAR : " + hbtype;
    }
}
