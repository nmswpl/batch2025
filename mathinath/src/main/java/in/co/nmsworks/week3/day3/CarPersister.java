package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class CarPersister {
    public static void main(String[] args) throws SQLException {
        Car c1 = new Car(1,"Hyundai","i20,swift",2015);
        Car c2 = new Car(2,"Hyundai","i5 swift",2013);
        Car c3 = new Car(3,"Honda","i2Swift",2013);
        Car c4 = new Car(4,"Honda","creta",2011);
        Car c5 = new Car(5,"Honda","creata1",2028);
        Car c6 = new Car(6,"Hyundai","i20Swift",2030);
        Car c7 = new Car(7,"Hyundai","i5Swift",2000);
        Car c8 = new Car(8,"Honda","creta",2010);
        Car c9 = new Car(9,"Honda","creta1",2000);
        Car c10 = new Car(10,"Honda","creata3",2000);
        Set<Car> car = new LinkedHashSet<>();
        car.add(c1);
        car.add(c2);
        car.add(c3);
        car.add(c4);
        car.add(c5);
        car.add(c6);
        car.add(c7);
        car.add(c8);
        car.add(c9);
        car.add(c10);
        saveToDb(car);

    }

    private static int  saveToDb(Set<Car> car) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
        Statement stmt = con.createStatement();

        for (Car car1 : car) {
            int id = car1.getId();
            String maufacturer = car1.getManufacturer();
            String model = car1.getModel();
            int yearOfMake = car1.getYearOfMake();
            int res = stmt.executeUpdate("insert into Car values ("+id+",'"+maufacturer+"','"+model+"',"+yearOfMake+")");

        }
        return 1;
    }


}
