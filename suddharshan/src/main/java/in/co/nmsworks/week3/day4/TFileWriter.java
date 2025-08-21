package in.co.nmsworks.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class TFileWriter implements Writer{
    BufferedWriter bw;
    @Override
    public void open() {

        try{
            bw = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/traineeList.txt",true));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void write(List<Trainee> trainees) {
        String data = "";
        try{
            for (Trainee trainee : trainees) {
                data += trainee.getId() + ", " + trainee.getName() + ", " + trainee.getDept() + "\n";
                bw.flush();
            }
            bw.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() {
        try{
            bw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
