package in.co.nmsworks.week3.day4;

import java.sql.*;
import java.util.List;

public class DBWritter implements Writter{
    Connection connection;
    PreparedStatement preparedStatement;
    @Override
    public void open() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            preparedStatement = connection.prepareStatement("insert into trainee values(?,?,?)");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void write(List<Trainee> trainees)
    {
        String s;
        for (Trainee trainee : trainees) {
          try {
              preparedStatement.setInt(1,trainee.getId());
              preparedStatement.setString(2,trainee.getName());
              preparedStatement.setString(3,trainee.getDepartment());
              preparedStatement.executeUpdate();
          } catch (SQLException e) {
              throw new RuntimeException(e);
          }

        }

    }

    @Override
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
