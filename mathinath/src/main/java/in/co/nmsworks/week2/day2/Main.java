package in.co.nmsworks.week2.day2;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setModel("BMW");
        c1.setYear(2025);
        c1.setNoOfDoors(4);
        System.out.println(c1.display());


        Bike b1 = new Bike();
        b1.setModel("BMW");
        b1.setYear(2025);
        b1.setHbtype(Bike.handleBarType.valueOf("RAISED"));
        System.out.println(b1.display());
    }
}
