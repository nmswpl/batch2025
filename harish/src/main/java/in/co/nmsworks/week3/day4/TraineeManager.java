package in.co.nmsworks.week3.day4;

import java.io.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TraineeManager {
    public static void main(String[] args) {
         TraineeManager traineeManager = new TraineeManager();
         Set<Trainee> trainees = traineeManager.getListFromFiles("/home/nms-training/Downloads/employee.csv");
         List<Trainee> trainees1 = new ArrayList<>();
         trainees1.addAll(trainees);
        traineeManager.sortAndSave(trainees1);
    }

    private void sortAndSave(List<Trainee> trainees1) {
        List<Trainee> ordIdTrainee = new ArrayList<>();
        List<Trainee> evenIdTrainee = new ArrayList<>();

        TraineeManager traineeManager = new TraineeManager();
        TraineeFileWriter fr = new TraineeFileWriter();
        DbWriter db = new DbWriter();

        for (Trainee trainee : trainees1) {
            if(trainee.getId() % 2 == 0){
                ordIdTrainee.add(trainee);
            }
            else{
               evenIdTrainee.add(trainee);
            }
        }
        traineeManager.save(db,ordIdTrainee);
        //traineeManager.save(fr,evenIdTrainee);

    }

    private void save(Writer writer, List<Trainee> trainees1) {
        writer.open();
        writer.write(trainees1);
        writer.close();

    }

    private Set<Trainee> getListFromFiles(String fileName) {
        Set<Trainee> traineees = new HashSet<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String statement;
            String[] rows;
            while (!((statement = bufferedReader.readLine()) == null)){
                rows = statement.split(",");
                Trainee trainee = new Trainee(Integer.parseInt(rows[0]),rows[1],rows[2]);
                traineees.add(trainee);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return traineees;
    }
}
