package in.co.nmsworks.week3.day4;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface Writer {
    void open();
    void write(List<Trainee>  listOfTrainee) throws Exception;
    void close();
}
