package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class CarPersistor {
    public static void main(String[] args)  {


        Car altroz = new Car(1,"TATA","Altroz",2021);
        Car nano = new Car(2,"TATA","Nano",2001);
        Car swift = new Car(3,"Maruti","Swift",2000);
        Car magnite = new Car(4,"Nission","Magnite",2019);
        Car alto = new Car(5,"Maruti","Alto",2025);
        Car waganr = new Car(6,"Maruti","Waganr",2021);
        Car i20 = new Car(7,"Hyundai","i20",2011);
        Car i10 = new Car(8,"Hyundai","i10",2023);
        Car rapid = new Car(9,"Squoda","Rapid",2026);
        Car thar = new Car(10,"MandM","Thar",2030);

        Set<Car> c = new HashSet<>();

        c.add(altroz);
        c.add(nano);
        c.add(swift);
        c.add(magnite);
        c.add(alto);
        c.add(waganr);
        c.add(i20);
        c.add(i10);
        c.add(rapid);
        c.add(thar);

        saveToDb(c);

//        int rsUp = stm.executeUpdate("insert into Car(id,manufacture,model,yearOfMake) values(1,'TATA','trainee','ram@gmail.com', 'M')");


    }

    public static void saveToDb(Set<Car> cars) {


        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training","nms-training");
                Statement stm = con.createStatement()
        ) {
            for (Car v : cars) {
                String sql = String.format(
                        "INSERT INTO Car (id, manufacturer, model, yearOfMake) VALUES (%d, '%s', '%s', %d)",
                        v.getId(),
                        v.getManufacturer(),
                        v.getModel(),
                        v.getYearOfMake()
                );
                stm.executeUpdate(sql);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
