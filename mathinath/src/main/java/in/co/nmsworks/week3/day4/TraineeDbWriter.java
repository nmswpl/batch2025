package in.co.nmsworks.week3.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

public class TraineeDbWriter implements Writer{
    Connection con;
    PreparedStatement ps;

    @Override
    public void open() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            ps = con.prepareStatement("insert into Trainee values(?,?,?)");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void write(List<Trainee> trainee) {
        for (Trainee trainee1 : trainee) {
            try {
                ps.setInt(1,trainee1.getId());
                ps.setString(2,trainee1.getName());
                ps.setString(3,trainee1.getDept());
                ps.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void close() {
        try {
            con.close();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
