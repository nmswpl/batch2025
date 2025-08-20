package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;
import java.util.SimpleTimeZone;

public class CarPersistor {

    public static Set<Car> cars = new HashSet<>();

    public static void main(String[] args) {

        CarPersistor cp = new CarPersistor();
        Car Hyundai = new Car(1, "Hyundai", "i20",2010);
        Car Swift = new Car(2,"Swift", "i30", 2009);
        Car RR = new Car(3,"RR","i40",2015);
        Car Audi = new Car(4,"Audi", "i20",2004);
        Car Nexa = new Car(5,"Nexa","i80",2023);
        Car Maruti = new Car(6,"Maruti","swift",2002);
        Car Kia = new Car(7,"Kia","i20",2021);
        Car Innova = new Car(8,"Innova","i20",2016);
        Car Tata = new Car(9,"Tata","i30",1997);
        Car Safari = new Car(10,"Safari","i60",2007);

        cars.add(Hyundai);
        cars.add(Swift);
        cars.add(RR);
        cars.add(Audi);
        cars.add(Nexa);
        cars.add(Maruti);
        cars.add(Kia);
        cars.add(Innova);
        cars.add(Tata);
        cars.add(Safari);

      //  int rowCount = cp.saveToDb(cars);
    }

    public int saveToDb(Set<Car> cars) {

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            Statement stmt = con.createStatement()) {

            int rs = 0;
            for (Car car : cars) {
                rs = stmt.executeUpdate("INSERT INTO Cars VALUES (" + car.getId() + "," + "'" + car.getManufacturer() + "'" + "," + "'" + car.getModel() + "'" + "," + car.getYearOfMake() + ")");
            }
            return rs;
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return 0;
    }
}
