package in.co.nmsworks.week3.day4;

import java.io.*;
import java.util.List;

public class TFileWriter implements WriterInterface{
    @Override
    public void open() throws Exception {

        BufferedWriter br = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/EvenTrainee"));
    }

    @Override
    public void write(List<Trainee> trainees) {

    }

    @Override
    public void close() {

    }
}
