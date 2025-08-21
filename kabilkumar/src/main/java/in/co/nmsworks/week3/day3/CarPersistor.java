package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarPersistor {
    public static void main(String[] args) {
        CarPersistor dbConnection = new CarPersistor();

        Car c1 = new Car(1, "Hyundai", "i20,swift", 2021);
        Car c2 = new Car(2, "Hyundai", "i20,swift", 2000);
        Car c3 = new Car(3, "Hyundai", "i20,swift", 2001);
        Car c4 = new Car(4, "Hyundai", "i20,swift", 2002);
        Car c5 = new Car(5, "Hyundai", "i30,swift", 2023);
        Car c6 = new Car(6, "Hyundai", "i50,swift", 1999);
        Car c7 = new Car(7, "Hyundai", "i80,swift", 2023);
        Car c8 = new Car(8, "Hyundai", "i20,swift", 2021);
        Car c9 = new Car(9, "Hyundai", "i280,swift", 2021);
        Car c10 = new Car(10, "Hyundai", "i20,swift", 2021);

        Set<Car> cars = new HashSet<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        cars.add(c6);
        cars.add(c7);
        cars.add(c8);
        cars.add(c9);
        cars.add(c10);

        dbConnection.saveToDb(cars);

    }


    public static int saveToDb(Set<Car> cars) {

        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
                Statement stmt = con.createStatement()) {


            for (Car car : cars)
            {
                 int up1 = stmt.executeUpdate("insert into Car values (" + car.getId() + "," + "'" + car.getManufacturer() + "'" + "," + "'" + car.getModel() + "'" + "," + car.getYear() + ")");
                 //System.out.println("insert into Car values (" + car.getId() + "," + "'" + car.getManufacturer() + "'" + "," + "'" + car.getModel() + "'" + "," + car.getYear() + ")");
                System.out.println(up1);
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return 0;
    }
}
