package in.co.nmsworks.week3.day4;

import java.io.*;
import java.util.List;

public class TraineeFileWritter implements Writer{
    BufferedWriter bw;
    @Override
    public void open() throws IOException {
        bw = new BufferedWriter(new FileWriter("/tmp/newFile.txt"));

    }

    @Override
    public void write(List<Trainee> trainee) throws IOException {
        String line ;
        System.out.println("TraineeFileWritter :: write :: "+ trainee);
        for (Trainee trainee1 : trainee) {
            line = trainee1.getId()+ ","+ trainee1.getName() + ","+ trainee1.getDept();
            bw.write(line);
            bw.newLine();
            bw.flush();
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
