package in.co.nmsworks.week2.day2;

class Vehicle1{
   private String model;
   private int yearOfMake;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    public void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }

    public void display() {
        System.out.print("Model: " + getModel() + " " + "Year: " +getYearOfMake() + " ");

    }


}

class Car extends Vehicle1{
    private int noOfDoors;

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }


}

 class Bike extends Vehicle1{

 public enum HandleBar{
     RAISED,LOWER;
 }
  HandleBar hbtType;

     public HandleBar getHbtType() {
         return hbtType;
     }

     public void setHbtType(HandleBar hbtType) {
         this.hbtType = hbtType;
     }
 }
public class Vehicle{
    public static void main(String[] args) {
        Car c = new Car();
        c.setNoOfDoors(5);
        c.setModel("innova");
        c.setYearOfMake(1999);
        c.display();
        System.out.println("No Of Doors: " + c.getNoOfDoors());

        Bike b = new Bike();
        b.setModel("splendid");
        b.setYearOfMake(2000);
        b.setHbtType(Bike.HandleBar.RAISED);
        b.display();
        System.out.println("Handle Bar :" + b.getHbtType());


    }
}
