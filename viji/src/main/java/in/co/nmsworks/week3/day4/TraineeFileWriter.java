package in.co.nmsworks.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TraineeFileWriter implements Writer{

    private BufferedWriter bw;

    @Override
    public void open() {

        try{
            bw = new BufferedWriter(new FileWriter("/tmp/oddList.txt"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void write(List<Trainee> list) {

        for (Trainee t: list) {
            try {
                bw.write(t.getId()+ "," + t.getName() + "," + t.getDept());
                bw.newLine();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void close() {
        try {
            bw.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}