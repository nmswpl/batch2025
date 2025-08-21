package in.co.nmsworks.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.List;

public class DbWriter implements Writer{

    Connection con;
    PreparedStatement ps;
    @Override
    public void open() {
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            ps = con.prepareStatement("INSERT INTO Trainee VALUES (?,?,?)");
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void write(List<Trainee> traineeList) {
        for (Trainee trainee : traineeList) {
            try {
                ps.setInt(1,trainee.getId());
                ps.setString(2,trainee.getName());
                ps.setString(3,trainee.getDept());
                ps.executeUpdate();
            }
            catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void close() {
        try {
            con.close();
            ps.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
