package in.co.nmsworks.week3.day4;


import java.io.*;
import java.util.List;

public class TFileWriter implements WriterInterface{
    BufferedWriter bw;
    @Override
    public void open() throws Exception {

        bw = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/EvenEmployee.txt"));
    }

    @Override
    public void write(List<Trainee> trainees) throws Exception {
        for (Trainee trainee : trainees) {
            String row = trainee.getId()+","+trainee.getName()+","+trainee.getDept();
            bw.write(row);
            bw.newLine();
            bw.flush();
        }

    }

    @Override
    public void close() throws Exception {
        bw.close();
    }
}
