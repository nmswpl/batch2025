package in.co.nmsworks.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

public  class TraineeFileWriter implements Writer{
   BufferedWriter bw;
    @Override
    public void open() {
        try {
            bw = new BufferedWriter(new FileWriter("/tmp/employee1.txt"));
        }
         catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void write(List<Trainee> trainee) {
        for (Trainee trainee1 : trainee) {
            try {
                bw.write(trainee1.getId()+" , "+trainee1.getName()+" , "+trainee1.getDept());
                bw.newLine();
                bw.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
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


