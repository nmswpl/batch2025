package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TraineePersistor {

    public static void main(String[] args) throws Exception {
        TraineePersistor tp = new TraineePersistor();
        Set<Trainee> traineeList = tp.getFromFile();
        System.out.println(tp.sortAndSave(traineeList));
    }

    private Set<Trainee> getFromFile() throws IOException {
        Set<Trainee> traineeSet = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/employee.csv"))) {
            String line;
            while((line = br.readLine()) != null) {
                String[] strArr = line.split(",");
                traineeSet.add(new Trainee(Integer.parseInt(strArr[0]),strArr[1],strArr[2]));
            }
        }
        return traineeSet;
    }

    private void save(Writer writer, List<Trainee> traineeList) throws Exception {
        writer.open();
        writer.write(traineeList);
        writer.close();
    }

    private Set<Trainee> sortAndSave(Set<Trainee> traineeList) throws Exception {
        Set<Trainee> trainees = new HashSet<>();
        trainees.addAll(traineeList);
        List<Trainee> oddList = new ArrayList<>();
        List<Trainee> evenList = new ArrayList<>();
        for (Trainee trainee : traineeList) {
            if(trainee.getId() % 2 == 0) {
                evenList.add(trainee);
            }
            else {
                oddList.add(trainee);
            }
        }

        Writer tfw = new TraineeFileWriter("/home/nms-training/Downloads/evenList.txt");
        save(tfw,evenList);
        Writer tdw = new TraineeDbWriter();
        save(tdw,oddList);
        return trainees;
    }
}
