package in.co.nmsworks.week3.day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class CarPersistor {
    public static void main(String[] args) {

        Set <Car> cars = new HashSet <> ();

        Car car1 = new Car(1,"Hyundai","i20",2015);
        cars.add(car1);
        Car car2 = new Car(2,"Ford","i30",2017);
        cars.add(car2);
        Car car3 = new Car(3,"Maruti","i50",2013);
        cars.add(car3);
        Car car4 = new Car(4,"Ford","f30",2014);
        cars.add(car4);
        Car car5 = new Car(5,"Hyundai","a40",2019);
        cars.add(car5);
        Car car6 = new Car(6,"Ford","b30",2020);
        cars.add(car6);
        Car car7 = new Car(7,"Maruti","f30",2019);
        cars.add(car7);
        Car car8 = new Car(8,"Hyundai","e30",2017);
        cars.add(car8);
        Car car9 = new Car(9,"Maruti","s7730",2021);
        cars.add(car9);
        Car car10 = new Car(10,"Ford","h30",2023);
        cars.add(car10);

        CarPersistor cp = new CarPersistor();
        int x = cp.saveToDb(cars);
        System.out.println(x);
    }

    public int saveToDb(Set<Car> cars){
        int rowCount = 0;
        try (Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
             Statement stmt = con.createStatement()){
            for (Car car : cars) {
                int x = stmt.executeUpdate("insert into car values ( "+ car.getId() + " , '" + car.getManufacturer() + "' , '" + car.getModel() + "' , " + car.getYearOfMake() + ")");
                rowCount += x;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowCount;
    }
}
