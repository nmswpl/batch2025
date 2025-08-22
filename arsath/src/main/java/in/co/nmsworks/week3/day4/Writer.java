package in.co.nmsworks.week3.day4;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;

public interface Writer {
    void open();

    void write(List<Trainee> trainee) throws IOException;

    void close() throws IOException;
}
