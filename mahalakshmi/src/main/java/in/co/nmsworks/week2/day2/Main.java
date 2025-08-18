package in.co.nmsworks.week2.day2;

public class Main {
    public static void main(String[] args) {
        Car ford = new Car(4);
        ford.setModel("ic2");
        ford.setYear(1989);
        ford.display();

        Bike honda = new Bike();
        honda.setModel("Ri5");
        honda.setYear(1999);
        honda.setHbType(Bike.HandleBarType.LOWERED);
        honda.display();
    }
}
