package in.co.nmsworks.week3.day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CarPersistor {

    public static void main(String[] args) {


        Car car1 = new Car(1, "Hundai", "i20", 2000);
        Car car2 = new Car(2, "Suzuki", "i21", 2001);
        Car car3 = new Car(3, "Bmw", "i22", 2002);
        Car car4 = new Car(4, "Audi", "i23", 2003);
        Car car5 = new Car(5, "Benz", "i24", 2004);
        Car car6 = new Car(6, "Maruthi", "i25", 2005);
        Car car7 = new Car(7, "Nano", "i26", 2006);
        Car car8 = new Car(8, "Thar", "i27", 2007);
        Car car9 = new Car(9, "Toyota", "i28", 2008);
        Car car10 = new Car(10, "Skoda", "i29", 2009);

        Set<Car> cars = new LinkedHashSet<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);

        System.out.println(saveToDb(cars));
    }

    public static int saveToDb(Set<Car> cars) {
        int update = 0;
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             Statement stmt = con.createStatement()) {

            for (Car car : cars) {

                int id = car.getId();
                String manufacturer = car.getManufacturer();
                String model = car.getModel();
                int yearOfMake = car.getYearOfMake();
                update = stmt.executeUpdate("INSERT INTO Car VALUES (" + id  + "," + "'" + manufacturer+"'" + "," + "'" +model +"'"+ "," + yearOfMake + ")");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return update;
    }
}
