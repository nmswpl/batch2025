package in.co.nmsworks.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

public class TraineeFileWriter implements Writer {
    BufferedWriter bw;
    @Override
    public void open() {
        try {
            bw = new BufferedWriter(new FileWriter("/tmp/trainee.txt"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void write(List<Trainee> writer) {
        try {
            for (Trainee trainee : writer) {
                bw.write(trainee.getId()+", "+trainee.getName()+", "+trainee.getDept());
                bw.newLine();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void close() {
        try {
            bw.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
