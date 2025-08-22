package in.co.nmsworks.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.sql.*;
import java.util.List;

public  class DbWriter implements Writer {


    private Connection con;
    private PreparedStatement ps;

    @Override
    public void open() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            ps = con.prepareStatement("Insert into Trainee Values (?,?,?)");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void write(List<Trainee> traineeList) {
        for (Trainee t : traineeList) {
            try {
                ps.setInt(1, t.getId());
                ps.setString(2, t.getName());
                ps.setString(3, t.getDept());
                ps.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public void close() throws SQLException {
        con.close();
        ps.close();
    }
}