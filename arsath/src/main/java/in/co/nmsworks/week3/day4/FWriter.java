package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class FWriter implements Writer{

    String filename = "/home/nms-training/Downloads/employee.csv";
    @Override
    public void open() {
       try(BufferedReader br = new BufferedReader(new FileReader(filename))){
           String line;
           while((line= br.readLine())!=null){
               System.out.println(line);
           }
       } catch (Exception e) {
           throw new RuntimeException(e);
       }

    }

    @Override
    public void write(List<Trainee> trainee) {

    }

    @Override
    public void close() {

    }
}
