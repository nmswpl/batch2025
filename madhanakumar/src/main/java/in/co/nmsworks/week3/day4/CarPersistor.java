package in.co.nmsworks.week3.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashSet;
import java.util.Set;

public class CarPersistor {
    public static void main(String[] args) {
//        Car car1 = new Car(1 , "Hyundai" , "i20" ,2015);
        Car car2 = new Car(2 , "Ford" , "Mustang" , 1967);
        Car car3 = new Car(3 , "Porsche" , "911" , 2018);
        Car car4 = new Car(4 , "Ford" , "Mustang" , 1969);
        Car car5 = new Car(5 , "Mahindra" , "Thar" , 2024);
        Car car6 = new Car(6 , "Lamborgini" , "350GT" , 2007);
        Car car7 = new Car(7 , "Pagani" , "Hyuara" , 2024);
        Car car8 = new Car(8 , "Bugatti" , "Aero" ,2018);
        Car car9 = new Car(9 , "BMW" , "Z4" ,2015);
        Car car10 = new Car(10 , "Mclaren" , "P1" , 2013);

        Set<Car> cars = new LinkedHashSet<>();
//        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);
        try {
            saveToDB(cars);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static int saveToDB(Set<Car> cars) throws SQLException {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training" , "nms-training");
            Statement stmt = con.createStatement()){

            for (Car car : cars) {
                int update = stmt.executeUpdate("INSERT INTO Car VALUES ("+car.getId()+",'"+car.getManufacturer()+"','"+car.getModel()+"',"+car.getYearOfMake()+")");

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return 1;
    }
}
