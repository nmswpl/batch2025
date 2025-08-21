package in.co.nmsworks.week3.day4;



import java.sql.*;
import java.util.List;
import java.util.Set;

public class DbWritter implements Writter{
    @Override
    public void open() {

    }


    @Override
    public void   write(Set<Trainee> traineeList) {

        String sql = "insert into emp values(?,?,?)";

        ResultSet rs;

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training")) {
            PreparedStatement ps = con.prepareStatement(sql);

           for (Trainee t : traineeList) {
               ps.setInt(1,t.getId());
               ps.setString(2,t.getName());
               ps.setString(3,t.getDept());
               ps.executeUpdate();
           }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void close() {

    }
}
