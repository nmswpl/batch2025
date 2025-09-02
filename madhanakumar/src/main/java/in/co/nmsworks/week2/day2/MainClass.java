package in.co.nmsworks.week2.day2;

public class MainClass {
    public static void main(String[] args) {
        Car ford = new Car();
        ford.setModel("Mustang");
        ford.setYearOfManufacture("1969");
        ford.setNoOfDoors(2);

        System.out.println(ford.display());

        Bike honda = new Bike();
        honda.setModel("Hayabusa");
        honda.setYearOfManufacture("2019");
        honda.setHb(Bike.HandleBarType.valueOf("LOWERED"));

        System.out.println(honda.display());
    }
}
