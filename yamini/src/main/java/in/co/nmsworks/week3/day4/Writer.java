package in.co.nmsworks.week3.day4;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

public interface Writer {
    void open() throws IOException, SQLException;
    void write(List<Trainee> trainees) throws IOException, SQLException;
    void close() throws IOException, SQLException;

}
