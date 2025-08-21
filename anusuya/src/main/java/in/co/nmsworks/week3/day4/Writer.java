package in.co.nmsworks.week3.day4;

import java.util.List;

public interface Writer {

    public void open();
    public void write(List<Trainee> traineeList);
    public void close();
}
