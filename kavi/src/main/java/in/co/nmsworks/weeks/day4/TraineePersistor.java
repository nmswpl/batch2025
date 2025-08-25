package in.co.nmsworks.weeks.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TraineePersistor {

    public static void main(String[] args) {
        TraineePersistor app = new TraineePersistor();


        List<Trainee> trainees = app.getFromFile("/home/nms-training/Downloads/employee.csv");

        System.out.println("All Trainees");
        for (Trainee t : trainees) {
            System.out.println(t);
        }

        app.sortAndSave(trainees);
    }

    public List<Trainee> getFromFile(String filePath) {
        List<Trainee> trainees = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String dept = parts[2];

                    Trainee t = new Trainee(id, name, dept);
                    if (!trainees.contains(t)) {
                        trainees.add(t);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file" + e.getMessage());
        }

        return trainees;
    }

    public void save(Writer writer, List<Trainee> trainees) {
        writer.open();
        writer.write(trainees);
        writer.close();
    }

    public void sortAndSave(List<Trainee> trainees) {
        List<Trainee> oddList = new ArrayList<>();
        List<Trainee> evenList = new ArrayList<>();

        for (Trainee t : trainees) {
            if (t.getId() % 2 == 0) {
                evenList.add(t);
            } else {
                oddList.add(t);
            }
        }

        Writer fileWriter = new TraineeFileWriter();
        Writer dbWriter = new TraineeDBWriter();

        save(fileWriter, oddList);
        save(dbWriter, evenList);
    }
}
