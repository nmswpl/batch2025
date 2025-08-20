package in.co.nmsworks.week3.day3;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class CarPersister
{
    private Set<Car> cars = new HashSet<>();

    public static void main(String[] args)
    {
        CarPersister jdbcCarRunner = new CarPersister();

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            PreparedStatement pstmt = con.prepareStatement("insert into cars values (?, ?, ?, ?)") )
        {
            jdbcCarRunner.createCarObjectsInCarsSet();

            jdbcCarRunner.saveToDb(pstmt, jdbcCarRunner.cars);
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
            Car competition = new Car(6, "BMW", "m3, competition", 2015);
            Car mercedes = new Car(7, "Mercedes", "s3, mercedes", 2018);
            Car dodge = new Car(8, "Dodge", "r9, vampire", 2014);
            Car audi = new Car(9, "Audi", "rw6, audi", 2020);
            Car volvo = new Car(10, "Ford", "vw3, volvo", 2009);

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

    public void saveToDb(PreparedStatement pstmt, Set<Car> cars)
    {
        for (Car car : cars)
        {
            try {
                pstmt.setInt(1, car.getId());
                pstmt.setString(2, car.getManufacturer());
                pstmt.setString(3, car.getModel());
                pstmt.setInt(4, car.getYearOfMake());
                int rowsAffected = pstmt.executeUpdate();
                System.out.println(rowsAffected > 0 ? "Insertion of Car ID : " + car.getId() + " Successfull" : "Insertion of Car ID : " + car.getId() + " Failed" );
            }
            catch (SQLException e)
            {
                throw new RuntimeException(e);
            }
        }
    }

}
