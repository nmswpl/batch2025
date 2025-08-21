package in.co.nmsworks.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TraineeFileWriter implements Writer{
   BufferedWriter bufferedWriter ;
    @Override
    public void write(List<Trainee> trainees) {
        for (Trainee trainee : trainees) {
            String row = trainee.getId() + " , " + trainee.getName() + " , " + trainee.getDepartment();
            try {
                bufferedWriter.write(row);
                bufferedWriter.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public void open()  {

        try {
            bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/TraineeDetails.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close(){
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
