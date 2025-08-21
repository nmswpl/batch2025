package in.co.nmsworks.week3.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DbWriter implements Writer
{
    private Connection con;
    PreparedStatement pstmt;
    @Override
    public void open()
    {
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
            pstmt = con.prepareStatement("insert into trainee values(?, ?, ?)");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void write(List<TraineePersister> trainees)
    {
        for (TraineePersister trainee : trainees)
        {
            try
            {
                pstmt.setInt(1, trainee.getId());
                pstmt.setString(2, trainee.getName());
                pstmt.setString(2, trainee.getDept());
                pstmt.executeUpdate();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void close()
    {
        try
        {
            pstmt.close();
            con.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
