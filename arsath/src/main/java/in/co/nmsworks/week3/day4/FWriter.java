package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FWriter implements Writer{

    String filename = "/home/nms-training/Downloads/employee.csv";
    String filename1 = "/home/nms-training/Downloads/employee.txt";

    BufferedReader br;
    BufferedWriter bw = new BufferedWriter(new FileWriter(filename1,false));

    public FWriter() throws IOException {
    }

    @Override
    public void open() {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename1,false));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void write(List<Trainee> trainee) throws IOException {
        for (Trainee t : trainee) {
            bw.write(t.getId()+","+t.getName()+","+t.getDept());
            bw.newLine();
            bw.flush();
        }
    }


    @Override
    public void close() throws IOException {
        bw.close();
    }
}
