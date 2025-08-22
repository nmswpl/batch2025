package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TraineeFileWriter implements Writter{
    BufferedWriter bw ;
    @Override
    public void open()
    {
        try
        {
            bw = new BufferedWriter(new FileWriter("/tmp/employee.csv"));
            System.out.println("the is open :");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void write( List<Trainee> trainees)

    {
        try{
            String s;
            for (Trainee trainee : trainees) {
                s = trainee.getId() + "," + trainee.getName() + "," + trainee.getDepartment();
                bw.write(s);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void close() {

        try
        {
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
