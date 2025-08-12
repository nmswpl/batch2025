package in.co.nmsworks.week2.day2;

public class Vehicle
{
    private String model;
    private int yearMake;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearMake() {
        return yearMake;
    }

    public void setYearMake(int yearMake) {
        this.yearMake = yearMake;
    }

   void display(){
       System.out.println("---------------");

       System.out.println(this.model);
       System.out.println(this.yearMake);
   }
}
