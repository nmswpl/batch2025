package in.co.nmsworks.week2.day2;

public class Vehicle {

    private String model;
    private int yearOfmake;



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfmake() {
        return yearOfmake;
    }

    public void setYearOfmake(int yearOfmake) {
        this.yearOfmake = yearOfmake;
    }

}






  class Car extends Vehicle {

    private int noOfdoor;

      public int getNoOfdoor() {
          return noOfdoor;
      }

      public void setNoOfdoor(int noOfdoor) {
          this.noOfdoor = noOfdoor;
      }

      public void display(Vehicle v) {
          System.out.println("Model : " + super.getModel());
          System.out.println("Year : " + super.getYearOfmake());
          System.out.println("No of Door : " + noOfdoor);
          System.out.println();
      }



  }




  class Bike extends Vehicle {

    public enum handleBar {
        RAISED, LOWWER;
    }
    private handleBar hand ;

      public handleBar getHand() {
          return hand;
      }

      public void setHand(handleBar hand) {
          this.hand = hand;
      }

      public void display(Vehicle v) {
          System.out.println("Model : " + super.getModel());
          System.out.println("Year : " + super.getYearOfmake());
          System.out.println("Handle Bar : " + getHand());
          System.out.println();
      }

  }