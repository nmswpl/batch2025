package in.co.nmsworks.week3.day4;

import java.io.FileWriter;
import java.util.List;

public interface Writer
{
    void open();
    void getWrite(List<Trainee> Data);
    void close();

}
