package in.co.nmsworks.week3.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TDBWriter implements Writer{
    @Override
    public void open()
    {
        System.out.println("Open function Called in T DB Writer");
    }

    @Override
    public void getWrite(List<Trainee> data)
    {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training")) {
            PreparedStatement ps = connection.prepareStatement("Insert into Trainee values(?,?,?);");

                for (Trainee tempOfData : data) {
                    ps.setInt(1,tempOfData.getId());
                    ps.setString(2,tempOfData.getName());
                    ps.setString(3,tempOfData.getDept());
                    ps.executeUpdate();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close()
    {
        System.out.println("close function Called in T DB Writer");
    }
}
