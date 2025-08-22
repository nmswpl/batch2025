package in.co.nmsworks.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            ps = con.prepareStatement("Insert into Trainee values(?,?,?)");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void write(List<Trainee> Trainee) throws SQLException
    {
        for (Trainee trainee : Trainee) {
            ps.setInt(1,trainee.getId());
            ps.setString(2,trainee.getName());
            ps.setString(3,trainee.getDept());
            ps.executeUpdate();
        }
    }

    @Override
    public void close()
    {
        try {
            con.close();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
