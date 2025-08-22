package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.Set;

public class TfileWritter implements Writter{
    @Override
    public void open(Set<Trainee> traineeSet) {
        try {
            BufferedReader br= new BufferedReader(new FileReader("filename"));
            String line = "";
            while ((line=br.readLine())!=null){

                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    @Override
    public List<Trainee> write(List<Trainee> trainees) {
        try {
            BufferedWriter bw= new BufferedWriter(new FileWriter("filename"));
            bw.write("filename");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return List.of();
    }

    @Override
    public void close() {


    }
}
