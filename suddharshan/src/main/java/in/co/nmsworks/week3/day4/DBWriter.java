package in.co.nmsworks.week3.day4;

import in.co.nmsworks.week2.day4.Movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DBWriter implements Writer{
    Connection con;
    PreparedStatement ps;
    @Override
    public void open() {
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void write(List<Trainee> trainees) {
        try{
            ps = con.prepareStatement("insert into trainee values (?,?,?)");
            for (Trainee trainee : trainees) {
                ps.setInt(1, trainee.getId());
                ps.setString(2,trainee.getName());
                ps.setString(3,trainee.getDept());
                ps.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() {
        try{
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
