package in.co.nmsworks.week3.day4;

import java.util.List;

public interface Writer {
    void open();
    void write(List<Trainee> trainee);
    void close();
}
