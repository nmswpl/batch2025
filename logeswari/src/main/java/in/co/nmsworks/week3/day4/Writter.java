package in.co.nmsworks.week3.day4;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

public interface Writter {
    public void open(Set<Trainee> traineeSet);
    public List<Trainee> write(List<Trainee> trainees) throws SQLException;
    public void close();
}
