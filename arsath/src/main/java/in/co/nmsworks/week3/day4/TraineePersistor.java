package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class TraineePersistor{
    public static void main(String[] args) {
        TraineePersistor tp = new TraineePersistor();
        String filename = "/home/nms-training/Downloads/employee.csv";
        Set<Trainee> trainees = tp.readFromFile(filename);
        System.out.println(trainees);



    }

    public Set<Trainee> readFromFile(String filename){
        Set<Trainee> trainees = new HashSet<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            while((line= br.readLine())!=null){
                String[] arr = line.split(",");
                Trainee t = new Trainee(Integer.parseInt(arr[0]),arr[1],arr[2]);
                trainees.add(t);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return trainees;
    }

//    public void save(Writer w,List<Trainee>)

}
