package in.co.nmsworks.week3.day4;

import javax.security.auth.login.AccountLockedException;
import java.sql.SQLException;
import java.util.List;

public interface Writer {

    public void open();
    public void write(List<Trainee> trainees);
    public void close();

}
