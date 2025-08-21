package in.co.nmsworks.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TraineeFileWriter implements Writer{

    BufferedWriter bw;
    @Override
    public void open() {
        try{
            bw = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/EvenIdEmployee.txt"));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void write(List<Trainee> traineeList) {
        for (Trainee trainee : traineeList) {
            try {
                bw.write(trainee.getId()+","+trainee.getName()+","+trainee.getDept());
                bw.newLine();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void close() {
        try {
            bw.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
