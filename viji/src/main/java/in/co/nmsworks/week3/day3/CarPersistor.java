package in.co.nmsworks.week3.day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class CarPersistor {

    public static void main(String[] args) {

        Car c1 = new Car(1,"Hyundai" , "i20" , 2015);
        Car c2 = new Car(2,"Hyundai" , "swift" , 2015);
        Car c3 = new Car(3,"Hyundai" , "i20" , 2015);
        Car c4 = new Car(4,"Hyundai" , "swift" , 2015);
        Car c5 = new Car(5,"Hyundai" , "i20" , 2015);
        Car c6 = new Car(6,"Hyundai" , "swift" , 2015);
        Car c7 = new Car(7,"Hyundai" , "i20" , 2015);
        Car c8 = new Car(8,"Hyundai" , "swift" , 2015);
        Car c9 = new Car(9,"Hyundai" , "i20" , 2015);
        Car c10 = new Car(10,"Hyundai" , "swift" , 2015);

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
        saveToDb(cars);
    }

    public  static int saveToDb(Set<Car> cars){
        int res = 0 ;
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
               Statement stmt = con.createStatement()){

            for(Car car : cars){
                 res = stmt.executeUpdate("Insert into Car(id,manufacturer,model,yearOfMake) values (" + car.getId() + ",'" + car.getManufacturer() + "'" + ",'" + car.getModel() + "'," +  + car.getYearOfMake() + ")");
            }

            System.out.println("Successfully inserted ");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return res ;

    }
}