package in.co.nmsworks.week3.day4;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface Writer
{
     public void open() throws IOException, SQLException;
     public void write(List<Trainee> trainee) throws IOException, SQLException;
     public void close() throws SQLException;
}
