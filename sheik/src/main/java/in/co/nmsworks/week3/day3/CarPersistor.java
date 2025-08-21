package in.co.nmsworks.week3.day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class CarPersistor
{
    public static void main(String[] args) {

        Set<Car> cars = new HashSet<>();
        CarPersistor obj = new CarPersistor();

        Car car1 = new Car(20, "Hyundai", "i20", 2000);
        Car car2 = new Car(21, "Toyota", "i21", 1900);
        Car car3 = new Car(22, "Hyundai", "i22", 1909);
        Car car4 = new Car(23, "Toyota", "i23", 1950);
        Car car5 = new Car(24, "Tata", "i24", 1980);
        Car car6 = new Car(25, "Hyundai", "i25", 1999);
        Car car7 = new Car(26, "Tata", "i26", 2010);
        Car car8 = new Car(27, "Toyota", "i27", 2001);
        Car car9 = new Car(28, "Hyundai", "i28", 2000);
        Car car10 = new Car(29, "Tata", "i29", 2020);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);


        System.out.println(obj.saveToDb(cars));
    }

    public int saveToDb(Set<Car> cars) {
        int count = 0;
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             Statement stmt = con.createStatement()) {

            for (Car car : cars) {
                int i = stmt.executeUpdate("insert into car values(" + car.getId() + ",'" + car.getManufacturer() + "','" + car.getModel() + "'," + car.getYearOfMake() + ");");
                //System.out.println("insert into car values(" + car.getId() + ",'" + car.getManufacturer() + "','" + car.getModel() + "'," + car.getYearOfMake() + ");");
                count = count + i;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return count;
    }
}
