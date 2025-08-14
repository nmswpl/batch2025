package in.co.nmsworks.week2.day1.day2;

public class Vechile {

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

    public void display()
    {
        System.out.println( "model :" + getModel() + "year  :" +getYear());
    }
}
class Car extends Vechile {

    private int NoOfDoors;

    public Car() {
    }

    public int getNoOfDoors() {
        return NoOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        NoOfDoors = noOfDoors;
    }

    public void display() {
        super.display();
        System.out.println("noOfDo : " + getNoOfDoors());
    }
}
class Bike extends Vechile {

            public enum HandleBar {raised, lower}

            private HandleBar HBTS;

            public HandleBar getHBTS() {
                return HBTS;
            }

          public void display(HandleBar bike)
          {
              super.display();
              System.out.println("type : "+bike);
          }


    }

