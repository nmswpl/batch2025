package in.co.nmsworks.week3.day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class CarPersistor {

    public int saveToDb(Set<Car> cars){

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training"); Statement stmt = con.createStatement())
        {
            for (Car car : cars) {
                int id = car.getId();
                String manufacturer = car.getManufacturer();
                String model = car.getModel();
                int year = car.getYearOfMake();
                stmt.executeUpdate("INSERT INTO CARS VALUES ("+id+",'"+manufacturer+"','"+model+"',"+year+")");
                System.out.println(id+"Save to db");
            }


        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Error");
        }

        return 0;
    }

    private void CarObjectCreation(Set<Car> cars){
        cars.add(new Car(1,"Hyundai","Swift",2015));
        cars.add(new Car(2,"Maruti Suzuki","Alto",2010));
        cars.add(new Car(3,"Mahindra","Thar",2021));
        cars.add(new Car(4,"Maruti Suzuki","Baleno",2008));
        cars.add(new Car(5,"Mahindra","XUV700",2015));
        cars.add(new Car(6,"Hyundai","i20",2016));
        cars.add(new Car(7,"Maruti Suzuki","Ertiga",2011));
        cars.add(new Car(8,"Toyota","Toyota Fortuner",2014));
        cars.add(new Car(9,"Toyota","Toyota Innova Crysta",2000));
        cars.add(new Car(10,"Hyundai","Verna",2019));
    }

    public static void main(String[] args) {

        Set<Car> cars = new HashSet<>();

        new CarPersistor().CarObjectCreation(cars);

        new CarPersistor().saveToDb(cars);

        System.out.println(cars);

    }

}
