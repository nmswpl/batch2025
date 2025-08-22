package in.co.nmsworks.week3.day4;

import java.util.List;
import java.util.Set;

public interface Writer {
    public void open();
    public void write(List<Trainee> trainee);
    public void close();

}
