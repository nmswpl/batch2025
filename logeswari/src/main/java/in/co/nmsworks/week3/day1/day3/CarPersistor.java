package in.co.nmsworks.week3.day1.day3;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.*;

public class CarPersistor {
       static Set<Car> carSet = new HashSet<>();

    public static void main(String[] args) throws SQLException {
        CarPersistor carPersistor=new CarPersistor();
        carPersistor.executeCarQuery();
        carPersistor.insertCarDetails();

    }

    private void insertCarDetails() throws SQLException {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
        Statement statement = connection.createStatement();){
            try {

               int result = statement.executeUpdate("INSERT INTO car VALUES(9,'i29','yyy',2025)");
//               int result = statement.executeUpdate("DELETE FROM car WHERE id=2 ");
//                while (result.next()) {
//                    carSet.add(new Members(result.getInt(1),result.getString(2),result.getString(3),result.getString(4)));
//
//                }
                out.println("insert Successfull*******");

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void executeCarQuery() {
        Statement statement = null;
        Connection connection;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        out.println("finally connection success");

        try {
            ResultSet result = statement.executeQuery("select * from car");
            while (result.next()) {
                carSet.add(new Car(result.getInt(1),result.getString(2), result.getString(3), result.getInt(4)));

            }
            for (Car car : carSet) {
                out.println(car);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
