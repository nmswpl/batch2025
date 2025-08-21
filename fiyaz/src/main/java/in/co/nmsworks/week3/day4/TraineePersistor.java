package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TraineePersistor {
    public static void main(String[] args) {

        TraineePersistor tp = new TraineePersistor();
        Set<Trainee> traineeSet = tp.getFromFile("/home/nms-training/Downloads/employee.csv");


        tp.sortAndSave(traineeSet);

    }

    private void sortAndSave(Set<Trainee> traineeSet) {
        Set<Trainee> lEven = new HashSet<>();
        Set<Trainee> lOdd = new HashSet<>();

        for (Trainee t : traineeSet) {
            if (t.getId()%2 == 0) {
                lEven.add(t);
            }
            else {
                lOdd.add(t);
            }
        }

        TraineeFileWritter traineeFileWritter = new TraineeFileWritter();
        traineeFileWritter.write(lEven);

        DbWritter db = new DbWritter();
        db.write(lOdd);
    }

    private void save(Writter writter, List<Trainee> traineeList) {

    }

    private Set<Trainee> getFromFile(String fileName) {


        Set<Trainee> traineeSet = new HashSet<>();


        try (BufferedReader br = new BufferedReader((new FileReader(fileName)))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] s = line.split(",");
                Trainee trainee = new Trainee();
                trainee.setId(Integer.parseInt(s[0]));
                trainee.setName(s[1]);
                trainee.setDept(s[2]);

                traineeSet.add(trainee);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return traineeSet;
    }
}
