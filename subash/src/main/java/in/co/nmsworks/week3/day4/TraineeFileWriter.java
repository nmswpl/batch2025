package in.co.nmsworks.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TraineeFileWriter implements Writer{

    BufferedWriter bw;
    private String filename;

    public TraineeFileWriter(String s) {
        this.filename=s;
    }

    @Override
    public void open()
    {
        try {
            bw=new BufferedWriter(new FileWriter(filename,false));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void write(List<Trainee> Trainee) throws IOException {
        for (Trainee trainee : Trainee) {
            bw.write(trainee.getId()+" "+trainee.getName()+" "+trainee.getDept());
            bw.newLine();
        }
    }

    @Override
    public void close() {
        try {
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
