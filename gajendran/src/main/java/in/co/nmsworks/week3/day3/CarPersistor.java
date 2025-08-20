package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarPersistor {



    public int saveToDb(Set<Car> cars)
    {

        int row = 0;

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training")) {
            Statement statement = con.createStatement();

            int i = 1;
            for (Car car : cars)
            {
                statement.executeUpdate("insert into Car values("+i+",'"+car.getManufacturer()+"','"+car.getModel()+"',"+car.getYearOfMake()+");");
                row++;
                i++;
            }




            return row;

        } catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

    }


    public static void main(String[] args)
    {
        Set<Car> cars = new HashSet<>();
        cars.add(new Car("Hyundai","i20", 2019));
        cars.add(new Car("Toyota","swift", 2020));
        cars.add(new Car("Hyundai","i20", 2011));
        cars.add(new Car("Toyota","swift", 2012));
        cars.add(new Car("Hyundai","i20", 2013));
        cars.add(new Car("Tata","swift", 2014));
        cars.add(new Car("Hyundai","i20", 2015));
        cars.add(new Car("Toyota","swift", 2016));
        cars.add(new Car("Tata","i20", 2017));
        cars.add(new Car("Hyundai","swift", 2018));


        //CarPersistor carPersistor = new CarPersistor();
        //int isSuccess = carPersistor.saveToDb(cars);
    }

}
