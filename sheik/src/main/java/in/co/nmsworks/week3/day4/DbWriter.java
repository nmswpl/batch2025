package in.co.nmsworks.week3.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DbWriter implements Writer{
    PreparedStatement ps;
    @Override
    public void open() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training" ,"nms-training","nms-training");
        ps = connection.prepareStatement("insert into trainee values(?,?,?)");
    }

    @Override
    public void write(List<Trainee> trainee) throws SQLException {


        for (Trainee trainee1 : trainee) {

            ps.setInt(1,trainee1.getId());
            ps.setString(2,trainee1.getName());
            ps.setString(3,trainee1.getDept());

            ps.executeUpdate();
        }

    }

    @Override
    public void close() throws SQLException {
        ps.close();

    }
}
