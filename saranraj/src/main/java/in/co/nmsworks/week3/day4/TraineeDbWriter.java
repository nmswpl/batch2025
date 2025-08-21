package in.co.nmsworks.week3.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TraineeDbWriter implements Writer{
    Connection conn;
    PreparedStatement ps;
    @Override
    public void open() {


        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","nms-training");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void write(List<Trainee> listOfTrainee) {
            String slQuery ="insert into traineeOdd(id,name,department)values(?,?,?)";
            try{
                ps=conn.prepareStatement(slQuery);
                for (int i=0;i<listOfTrainee.size();i++){
                    int id= listOfTrainee.get(i).getId();
                    String name =listOfTrainee.get(i).getName();
                    String department=listOfTrainee.get(i).getDepartment();
                    ps.setInt(i,id);
                    ps.setString(i,name);
                    ps.setString(i,department);
                    ps.executeUpdate();
                }


            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }

    @Override
    public void close() {

        try {
            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
