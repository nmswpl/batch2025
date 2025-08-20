package in.co.nmsworks.week3.day3;

import java.sql.*;

import java.util.HashSet;
import java.util.Set;

public class CarPersistor {

    public static void main(String[] args) {

        Car c1 = new Car(1, "hyundai", "i20", 2015);
        Car c2 = new Car(2, "hyundai", "swift", 2016);
        Car c3 = new Car(3, "hyundai", "i20", 2017);
        Car c4 = new Car(4, "hyundai", "swift", 2018);
        Car c5 = new Car(5, "hyundai", "i20", 2019);
        Car c6 = new Car(6, "hyundai", "swift", 2020);
        Car c7 = new Car(7, "hyundai", "i20", 2021);
        Car c8 = new Car(8, "hyundai", "swift", 2022);
        Car c9 = new Car(9, "hyundai", "i20", 2023);
        Car c10 = new Car(10, "hyundai", "swift", 2024);

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

        CarPersistor cp = new CarPersistor();
        cp.saveToDb(cars);
    }

    public int saveToDb(Set<Car> cars) {

        int count = 0;
        for (Car car : cars) {
            int id = car.getId();
            String manufacturer = car.getManufacturer();
            String model = car.getModel();
            int yearOfModel = car.getYearOfModel();


            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
                 Statement stmt = conn.createStatement()) {
                stmt.executeUpdate("insert into cars(id,manufacturer,model,yearOfModel) values " + "(" + id + ",'" + manufacturer + "','" + model + "','" + yearOfModel + "');");

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return count;
    }
}
