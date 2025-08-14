package in.co.nmsworks.week2.day1.day2;

public class RunnerMain
{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setNoOfDoors(5);

        Bike b1 = new Bike();
        b1.setModel("houndoi");
        b1.setYear(2020);

        Bike.HandleBar type = Bike.HandleBar.lower;
        b1.display(type);


    }

}
