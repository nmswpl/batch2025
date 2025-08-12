package in.co.nmsworks.week2.day2;

public class Vehicles {
    private String model;
    private  int year;



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

    public Vehicles() {
    }

    public Vehicles(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void display() {
        System.out.println("Model : " +getModel());
        System.out.println("Year : "+getYear());

    }
}

class Bike extends Vehicles{



    enum HandleBarType{
        RAISED,
        LOWERED;
    }
    private HandleBarType handle ;

    public HandleBarType getHandle() {
        return handle;
    }

    public void setHandle(HandleBarType handle) {
        this.handle = handle;
    }

    public Bike() {
    }



    @Override
    public void display() {
        System.out.println("Bike Details");
        System.out.println("Model : " + this.getModel());
        System.out.println("Year : " + this.getYear());
        System.out.println("HandleBarType : " + handle);
    }
}

class Car extends Vehicles {

    private int noOfDoors;

    public Car(String inova, int i) {
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public Car(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public Car(String model, int year, int noOfDoors) {
        super(model, year);
        this.noOfDoors = noOfDoors;
    }

    @Override
    public void display() {
        System.out.println("Car Details");
        System.out.println("Model : " + this.getModel());
        System.out.println("Year : " + this.getYear());
        System.out.println("No Of Doors : " + this.noOfDoors);
    }
}



