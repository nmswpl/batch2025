package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class TraineeFileWritter implements Writter{
    @Override
    public void open() {
    }

    @Override
    public void write(Set<Trainee> traineeList) {
        try (BufferedWriter bw = new BufferedWriter((new FileWriter("/home/nms-training/Downloads/Trainee.txt")))) {
            for (Trainee t : traineeList) {
                bw.write(traineeList.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {

    }
}
