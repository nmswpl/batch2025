package in.co.nmsworks.week3.day4;

import java.sql.*;
import java.util.List;

public class TraineeDbWriter implements Writer{

    Connection con;
    PreparedStatement ps;


    @Override
    public void open() throws Exception {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
    }

    @Override
    public void write(List<Trainee> data) throws Exception {
        ps = con.prepareStatement("insert into Trainee value (?,?,?)");
        for (Trainee trainee : data) {
            ps.setInt(1,trainee.getId());
            ps.setString(2,trainee.getName());
            ps.setString(3,trainee.getDept());
            ps.executeUpdate();
        }
    }

    @Override
    public void close() throws Exception {
        ps.close();
        con.close();
    }
}
