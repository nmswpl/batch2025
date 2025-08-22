package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TraineePersistor {
    public static void main(String[] args) {
        TraineePersistor traineePersistor = new TraineePersistor();
        Set<Trainee> setTrainee = traineePersistor.getFromFile("/home/nms-training/Downloads/employee.csv");
        List<Trainee> traineeList = new ArrayList<>();
        traineeList.addAll(setTrainee);
        traineePersistor.sortAndSave(traineeList);
    }

    private void sortAndSave(List<Trainee> trainees){
        TraineeFileWriter traineeFileWriter = new TraineeFileWriter();
        TraineeDBWriter traineeDBWriter = new TraineeDBWriter();
        TraineePersistor traineePersistor = new TraineePersistor();
        List<Trainee> oddId = new ArrayList<>();
        List<Trainee> evenId = new ArrayList<>();
        for (Trainee trainee : trainees) {
            if(trainee.getId() % 2 == 0){
                oddId.add(trainee);
            } else {
                evenId.add(trainee);
            }
        }
        traineePersistor.save(traineeFileWriter,evenId);
        traineePersistor.save(traineeDBWriter,oddId);
    }

    private void save(Writer writer, List<Trainee> traineeList) {
        writer.open();
        writer.write(traineeList);
        writer.close();
    }

    private Set<Trainee> getFromFile(String filename) {
        Set<Trainee> traineeSet = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            while ((line = br.readLine()) != null){
                String[] traineeString = line.split(",");
                if (traineeString.length >= 3){
                    int id = Integer.parseInt(traineeString[0]);
                    String name = traineeString[1];
                    String dept = traineeString[2];
                    traineeSet.add(new Trainee(id,name,dept));
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return traineeSet;
    }
    
    


}
