package in.co.nmsworks.week3.day4;

import javax.sql.RowSet;
import java.sql.*;
import java.util.List;

public class DbWriter implements Writer{
    Connection connection;
    PreparedStatement preparedStatement;

    @Override
    public void close(){
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void write(List<Trainee> trainees) {
        for (Trainee trainee : trainees) {
            try {
                preparedStatement.setInt(1,trainee.getId());
                preparedStatement.setString(2,trainee.getName());
                preparedStatement.setString(3,trainee.getDepartment());
                int row = preparedStatement.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


        }
    }

    @Override
    public void open()  {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            preparedStatement = connection.prepareStatement("Insert into trainee values(?,?,?)");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
