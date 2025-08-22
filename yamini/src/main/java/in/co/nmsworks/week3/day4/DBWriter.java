package in.co.nmsworks.week3.day4;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

public class DBWriter implements Writer {
    Connection con;
    PreparedStatement ps;

    public DBWriter() throws SQLException {

    }

    @Override
    public void open() throws  SQLException {
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
        ps=con.prepareStatement("Insert into trainee values ?,?,? ");

    }

    @Override
    public void write(List<Trainee> trainees) throws SQLException {
        int res = 0;
        for (Trainee trainee : trainees) {
            ps.setInt(1, trainee.getId());
            ps.setString(2, trainee.getName());
            ps.setString(3, trainee.getDept());
            res = ps.executeUpdate();
        }
        System.out.println(res);

    }

    @Override
    public void close() throws IOException, SQLException {
        con.close();
        ps.close();;
    }
}
