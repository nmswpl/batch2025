package in.co.nmsworks.week3.day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class CarPresistor {
    public static void main(String[] args) {
        Car car1 = new Car(1, "hyundai", "swift", 2015);
        Car car2 = new Car(2, "hyundai", "i20", 2015);
        Car car3 = new Car(3, "hyundai", "swift", 2015);
        Car car4 = new Car(4, "hyundai", "swift", 2015);
        Car car5 = new Car(5, "hyundai", "i20", 2015);
        Car car6 = new Car(6, "hyundai", "swift", 2015);
        Car car7 = new Car(7, "hyundai", "i20", 2015);
        Car car8 = new Car(8, "hyundai", "swift", 2015);
        Car car9 = new Car(9, "hyundai", "i20", 2015);
        Car car10 = new Car(10, "hyundai", "i20", 2015);

        Set<Car> cars = new HashSet<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);

        CarPresistor cp = new CarPresistor();
        int noOfRowsInserted = cp.saveToDb(cars);
        System.out.println("THE NUMBER OF THE ROW INSERTED :" + noOfRowsInserted);

    }

    private int saveToDb(Set<Car> cars) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
             Statement statement = connection.createStatement()) {

            int rowcount = 0;

            for (Car car : cars) {
                int eachRow = statement.executeUpdate("INSERT INTO CAR_DETAILS VALUES("+car.getId()+","+ "'"+ car.getModel() +"'" +","+"'"+car.getManufacturer()+"'"+","+car.getYearOfMake()+")");
                rowcount += eachRow;
                //System.out.println("INSERT INTO CAR_DETAILS VALUES("+car.getId()+","+ "'"+ car.getModel() +"'" +","+"'"+car.getManufacturer()+"'"+","+car.getYearOfMake()+")");
            }
            //System.out.println("id"+);
            return rowcount;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
