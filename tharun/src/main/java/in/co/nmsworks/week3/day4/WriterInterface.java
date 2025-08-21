package in.co.nmsworks.week3.day4;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface WriterInterface {
    void open() throws Exception;
    void write(List<Trainee> trainees) throws Exception;
    void close() throws Exception;
}
