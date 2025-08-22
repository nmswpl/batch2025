package in.co.nmsworks.week3.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TraineeDBWriter implements Writer{
    Connection con;
    PreparedStatement stmt;
    @Override
    public void open() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");
            stmt = con.prepareStatement("INSERT INTO Trainee values (?,?,?)");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void write(List<Trainee> writeTrainee) {
        for (Trainee trainee : writeTrainee) {
            try{
                stmt.setInt(1,trainee.getId());
                stmt.setString(2,trainee.getName());
                stmt.setString(3,trainee.getDept());
                int add = stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public void close() {
        try {
            stmt.close();
            con.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
