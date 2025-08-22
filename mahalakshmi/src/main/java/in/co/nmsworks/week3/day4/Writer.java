package in.co.nmsworks.week3.day4;

import java.util.List;

public interface Writer {
    public void open() throws Exception;
    public void write(List<Trainee> data) throws Exception;
    public void close() throws Exception;
}
