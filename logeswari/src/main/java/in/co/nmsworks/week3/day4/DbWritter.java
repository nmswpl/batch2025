package in.co.nmsworks.week3.day4;

import in.co.nmsworks.week2.day4.Movie;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DbWritter implements Writter{
    private Trainee[] Trainee;


    @Override
    public void open(Set<Trainee> traineeSet) {
        String sql="INSERT INTO Trainee values(?,?,?)";
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            PreparedStatement ps= connection.prepareStatement(sql)){

            for(Trainee trainee:traineeSet) {
                ps.setInt(1,1);
                ps.setString(2,trainee.toString());
                ps.setString(3,trainee.toString());
                ps.executeUpdate();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Trainee> write(List<Trainee> trainees) throws SQLException {
        List<Trainee> traineeList=new ArrayList<>();

        String sql="select * from Trainee";
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            PreparedStatement ps= connection.prepareStatement(sql)) {


                try(ResultSet resultSet= ps.executeQuery()){
                    while (resultSet.next()){

                        traineeList.add((Trainee) trainees);
                    }
                }
        }
        catch (Exception e){
            e.printStackTrace();
        }


        return List.of();
    }

    @Override
    public void close() {

    }
}
