package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TrainingManager {
    public static void main(String[] args) {
        TrainingManager tp = new TrainingManager();
        Set<Trainee> trainees = tp.getFromFile("/home/nms-training/Downloads/employee.csv");
        List<Trainee> trainees1 = new ArrayList<>();
        trainees1.addAll(trainees);
        System.out.println(trainees1);
        tp.sortAndSave(trainees1);

    }

    public Set<Trainee> getFromFile(String filename) {
        Set<Trainee> trainees = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String Line;
            br.readLine();

            while ((Line = br.readLine()) != null) {

                String[] split = Line.split(",");
                Trainee t = new Trainee(Integer.parseInt(split[0]), split[1], split[2]);
                trainees.add(t);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return trainees;
    }

    public void sortAndSave(List<Trainee> trainees) {
        List<Trainee> oddList = new ArrayList<>();
        List<Trainee> evenList = new ArrayList<>();

        for (Trainee trainee : trainees) {
            if (trainee.getId() % 2 == 0) {
                evenList.add(trainee);

            } else {
                oddList.add(trainee);
            }
        }
        System.out.println(evenList);
        TrainingManager tp = new TrainingManager();
        Writter tr = new TraineeFileWriter();
        tp.save(tr,oddList);
        Writter dbw = new DBWritter();
        tp.save(dbw,evenList);



    }
    public void save(Writter writter,List<Trainee> trainees)
    {
        writter.open();
        writter.write(trainees);
        writter.close();
    }
}

