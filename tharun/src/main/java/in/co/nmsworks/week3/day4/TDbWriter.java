package in.co.nmsworks.week3.day4;

import java.sql.*;
import java.util.List;

public class TDbWriter implements WriterInterface{

    String query = "INSERT INTO TRAINEES VALUES (?,?,?)";
    Connection con = null;
    PreparedStatement ps =null;
    ResultSet rs = null;
    @Override
    public void open() throws Exception {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
        ps = con.prepareStatement(query);
    }

    @Override
    public void write(List<Trainee> trainees) throws SQLException {

        for (Trainee trainee : trainees) {
            ps.setInt(1,trainee.getId());
            ps.setString(2,trainee.getName());
            ps.setString(3,trainee.getDept());
            ps.executeUpdate();
        }

    }

    @Override
    public void close() throws SQLException {

        ps.close();
        con.close();

    }
}
