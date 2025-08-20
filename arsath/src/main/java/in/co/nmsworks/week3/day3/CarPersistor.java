package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarPersistor {

    public static void main(String[] args) {
        Car cp1 = new Car(1,"Hyundai","i20",2021);
        Car cp2 = new Car(2,"Tata","Tiago",2023);
        Car cp3 = new Car(3,"Toyota","Innova",2019);
        Car cp4 = new Car(4,"Maruthi","Ertiga",2017);
        Car cp5 = new Car(5,"Suzuki","Swift",2020);
        Car cp6 = new Car(6,"Mahindra","Xylo",2015);
        Car cp7 = new Car(7,"Audi","Q5",2021);
        Car cp8 = new Car(8,"Volkswagen","Polo",2010);
        Car cp9 = new Car(9,"Toyota","Qualis",2010);
        Car cp10 = new Car(10,"Honda","Cty",2012);

        Set<Car> cars = new HashSet<>();

        cars.add(cp1);
        cars.add(cp2);
        cars.add(cp3);
        cars.add(cp4);
        cars.add(cp5);
        cars.add(cp6);
        cars.add(cp7);
        cars.add(cp8);
        cars.add(cp9);
        cars.add(cp10);

        saveToDb(cars);



    }
    public static int saveToDb(Set<Car> cars){
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training"); Statement stmt = con.createStatement()) {
            for (Car car : cars) {
                int id = car.getId();
                String manufacturer = car.getManufacturer();
                String model = car.getModel();
                int yearOfMake = car.getYearOfMake();
                String sql = "INSERT INTO Cars VALUES (" + id  + "," + "'" + manufacturer+"'" + "," + "'" +model +"'"+ "," + yearOfMake + ")";
                System.out.println(stmt.executeUpdate(sql));
            }
            ResultSet rs = stmt.executeQuery("SELECT * FROM Cars");

            rs.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

       return 0;
    }
}
