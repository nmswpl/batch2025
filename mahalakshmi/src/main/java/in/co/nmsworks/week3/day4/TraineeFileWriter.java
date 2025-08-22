package in.co.nmsworks.week3.day4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TraineeFileWriter implements Writer{

    String fileName;
    BufferedWriter bw;

    public TraineeFileWriter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void open() throws IOException {
        bw = new BufferedWriter(new FileWriter(fileName));
    }


    @Override
    public void write(List<Trainee> data) {
        try {

            for (Trainee trainee : data) {
                bw.write(trainee.getId()+","+trainee.getName()+","+trainee.getDept());
                bw.newLine();
                bw.flush();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() throws IOException {
        bw.close();
    }
}



