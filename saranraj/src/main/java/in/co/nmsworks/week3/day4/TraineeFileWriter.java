package in.co.nmsworks.week3.day4;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class TraineeFileWriter implements Writer {
    BufferedWriter bf;

    @Override
    public void open() {
       try{
           bf =new BufferedWriter(new FileWriter("/home/nms-training/Downloads/employee.txt"));

       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }

    @Override
    public void write(List<Trainee> listOfTrainee) {
          try{
              for(Trainee value:listOfTrainee){
                  String sentence =value.getId()+","+value.getName()+","+value.getDepartment();
                  bf.write(sentence);
              }

          }catch (Exception e){
              e.printStackTrace();
          }

    }


    @Override
    public void close() {
        try {
            bf.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
