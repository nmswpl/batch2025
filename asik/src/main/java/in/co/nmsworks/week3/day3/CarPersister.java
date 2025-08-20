package in.co.nmsworks.week3.day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class CarPersister
{
    private Set<Car> cars = new HashSet<>();

    public static void main(String[] args)
    {
        CarPersister jdbcCarRunner = new CarPersister();

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            Statement stmt = con.createStatement() )
        {
            jdbcCarRunner.createCarObjectsInCarsSet();

            jdbcCarRunner.saveToDb(stmt, jdbcCarRunner.cars);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }

    private void createCarObjectsInCarsSet()
    {

            Car swift = new Car(1, "Hyundai", "i20, swift", 1995);
            Car innova = new Car(2, "Maruti", "x9, innova", 2010);
            Car thar = new Car(3, "Mahindra", "xi9, thar", 2018);
            Car maruti = new Car(4, "Maruti", "i20, maruti", 2013);
            Car aventador = new Car(5, "Lamborghini", "wx7, aventador", 2023);
            Car competition = new Car(6, "i9", "m3, competition", 2015);
            Car mercedes = new Car(7, "S-Class", "s3, mercedes", 2018);
            Car dodge = new Car(8, "Red Vampire", "r9, vampire", 2014);
            Car audi = new Car(9, "XW9", "rw6, audi", 2020);
            Car volvo = new Car(10, "Volvo", "vw3, ford", 2009);

            cars.add(swift);
            cars.add(innova);
            cars.add(thar);
            cars.add(maruti);
            cars.add(aventador);
            cars.add(competition);
            cars.add(mercedes);
            cars.add(dodge);
            cars.add(audi);
            cars.add(volvo);

    }

    public void saveToDb(Statement stmt, Set<Car> cars)
    {
        for (Car car : cars)
        {
            try {
                int rowsAffected = stmt.executeUpdate("insert into cars values (" + car.getId() + ", '" + car.getManufacturer() +
                        "', '" + car.getModel() + "', " + car.getYearOfMake() + ")");
                System.out.println(rowsAffected > 0 ? "Insertion of Car ID : " + car.getId() + " Successfull" : "Insertion of Car ID : " + car.getId() + " Failed" );
            }
            catch (SQLException e)
            {
                throw new RuntimeException(e);
            }
        }
    }

}
