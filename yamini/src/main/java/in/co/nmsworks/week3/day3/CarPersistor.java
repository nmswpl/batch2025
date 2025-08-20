package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class CarPersistor {

    public static void main(String[] args) throws SQLException {
        Car c1=new Car(1,"Hyundai","swift",2015);
        Car c2=new Car(2,"Mahindra","sumo",2016);
        Car c3=new Car(3,"Ashok leyland","sword",2008);
        Car c4=new Car(4,"Ford","swift",2000);
        Car c5=new Car(5,"Hindustan","suzuki",2012);
        Car c6=new Car(6,"Bajaj","maruti",2011);
        Car c7=new Car(7,"Hradyesh","audi",2005);
        Car c8=new Car(8,"Eicher","kia",2011);
        Car c9=new Car(9,"Thar","Jeep",2019);
        Car c10=new Car(10,"Toyota","honda",2013);
        Set<Car> cars=new HashSet<>();
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

        System.out.println(saveToDb(cars));
    }

    public static int saveToDb(Set<Car> cars) throws SQLException {

        int count = 0;
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             Statement stmt = con.createStatement()) {

            for (Car car : cars) {
               int  result = stmt.executeUpdate("Insert into car values(" + car.getId() + ",'" + car.getManufacturer() + "'" + ",'" + car.getModel() + "'," + "'" + car.getYearOfMake() + "')");
                count += result;

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return count;
    }

}
