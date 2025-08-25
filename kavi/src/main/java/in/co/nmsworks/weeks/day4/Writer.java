package in.co.nmsworks.weeks.day4;

import java.util.List;

public interface Writer {
    void open();
    void write(List<Trainee> trainees);
    void close();
}
