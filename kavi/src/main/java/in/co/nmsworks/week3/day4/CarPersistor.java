package in.co.nmsworks.week3.day4;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class CarPersistor {
    private final String url = "jdbc:mysql://localhost:3306/training";
    private final String user = "nms-training";
    private final String password = "nms-training";


    public int saveToDb(Set<Car> cars) {
        String query = "INSERT INTO Car (id, manufacturer, model, yearOfMake) VALUES (?, ?, ?, ?)";
        int count = 0;

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            for (Car car : cars) {
                stmt.setInt(1, car.getId());
                stmt.setString(2, car.getManufacturer());
                stmt.setString(3, car.getModel());
                stmt.setInt(4, car.getYearOfMake());
                stmt.addBatch();
            }

            int[] result = stmt.executeBatch();
            count = result.length;

        } catch (SQLException e) {
            System.out.println("Database error " + e.getMessage());
        }

        return count;
    }


    public Set<Car> getAllCars() {
        Set<Car> carsFromDb = new HashSet<>();
        String query = "SELECT * FROM Car";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String manufacturer = rs.getString("manufacturer");
                String model = rs.getString("model");
                int yearOfMake = rs.getInt("yearOfMake");

                Car car = new Car(id, manufacturer, model, yearOfMake);
                carsFromDb.add(car);
            }

        } catch (SQLException e) {
            System.out.println("DB fetch error: " + e.getMessage());
        }

        return carsFromDb;
    }

    public static void main(String[] args) {
        Set<Car> cars = new HashSet<>();

        cars.add(new Car(1, "Hyundai", "i20", 2015));
        cars.add(new Car(2, "BMW", "i30", 2018));
        cars.add(new Car(3, "Safari", "Swift", 2016));
        cars.add(new Car(4, "Maruti", "suzuki", 2019));
        cars.add(new Car(5, "Tata", "Nexon", 2020));
        cars.add(new Car(6, "Ferari", "Seltos", 2021));
        cars.add(new Car(7, "Toyota", "i21", 2022));
        cars.add(new Car(8, "i20", "i22", 2020));
        cars.add(new Car(9, "Honda", "City", 2017));
        cars.add(new Car(10, "Tesla", "Rapid", 2014));

        CarPersistor persistor = new CarPersistor();


        int inserted = persistor.saveToDb(cars);
        System.out.println(inserted + " cars inserted");
        Set<Car> allCarsFromDb = persistor.getAllCars();

        for (Car car : allCarsFromDb) {
            System.out.println("ID: " + car.getId());
            System.out.println("Manufacturer: " + car.getManufacturer());
            System.out.println("Model: " + car.getModel());
            System.out.println("Year Of Make: " + car.getYearOfMake());
            System.out.println(" ");
        }
    }
}
