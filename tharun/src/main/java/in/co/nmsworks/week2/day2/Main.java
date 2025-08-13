package in.co.nmsworks.week2.day2;

public class Main {
    public static void main(String[] args) {
        Car innova = new Car("Innova",2004,4);
        innova.display();

        Bike honda = new Bike("Honda",2008, Bike.HandlebarType.LOWER);
        honda.display();
    }
}
