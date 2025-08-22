package in.co.nmsworks.week3.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

public class DbWriter implements Writer{

    @Override
    public void open() {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training","nms-training");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void write(List<Trainee> trainee) {
        try( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training","nms-training")){
            String sql = "INSERT INTO Employees VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            for (Trainee t : trainee) {
                ps.setInt(1,t.getId());
                ps.setString(2,t.getName());
                ps.setString(3,t.getDept());
                ps.executeUpdate();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {

    }
}
