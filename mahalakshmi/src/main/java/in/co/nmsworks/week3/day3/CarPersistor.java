package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarPersistor {
    public int saveToDb(Set<Car> cars) throws SQLException {
        int rows = 0;
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
        try (Statement stat = con.createStatement()) {
            for (Car car : cars) {
                String query = "INSERT INTO Car (id,manufacturer,model,yearOfMake) VALUES ("+ car.getId()+",'"+car.getManufacturer()+"','"+car.getModel()+"',"+car.getYearOfMake()+")";
                rows += stat.executeUpdate(query);
            }
        }
        return rows;
    }
// suzuki,tata, machindra,toyota,maruthi
    public static void main(String[] args) throws SQLException {
        Set<Car> cars = new HashSet<>();
        cars.add(new Car(1,"Hyundai","i20",2015));
        cars.add(new Car(2,"Hyundai","i21",2017));
        cars.add(new Car(3,"Suzuki","s25",2018));
        cars.add(new Car(4,"Suzuki","s56",2019));
        cars.add(new Car(5,"Tata Mortors","venza",2020));
        cars.add(new Car(6,"Tata Mortors","venza 2.0",2023));
        cars.add(new Car(7,"Maruthi","mi7",2020));
        cars.add(new Car(8,"Maruthi","mi9",2025));
        cars.add(new Car(9,"Machindra","mach9",2016));
        cars.add(new Car(10,"Machindra","mach 2.0",2025));
        CarPersistor cp = new CarPersistor();
        System.out.println(cp.saveToDb(cars) + " rows are inserted.");
    }
}
