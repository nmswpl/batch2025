package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TraineePersistor {
    public static void main(String[] args) {

        TraineePersistor tp = new TraineePersistor();
        Set<Trainee> trainees = tp.getFromFile();
        for (Trainee trainee : trainees) {
            System.out.println(trainee);
        }
        tp.sortAndSave(trainees);
    }

    private void sortAndSave(Set<Trainee> trainees) {

        List<Trainee> fileTrainees = new ArrayList<>();
        List<Trainee> dbTrainees = new ArrayList<>();

        for (Trainee trainee : trainees) {
            if (trainee.getId() % 2 ==0){
                fileTrainees.add(trainee);
            }
            else {
                dbTrainees.add(trainee);
            }
        }

        try{
            WriterInterface fWriter = new TFileWriter();
            save(fWriter,fileTrainees);

            WriterInterface dbWriter = new TDbWriter();
            save(dbWriter,dbTrainees);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private void save(WriterInterface writer, List<Trainee> trainees) throws Exception {
        writer.open();
        writer.write(trainees);
        writer.close();
    }

    private Set<Trainee> getFromFile() {
        Set<Trainee> trainees = new HashSet<>();
        try(BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/employee.csv"))) {

            String line;
            while ((line = br.readLine()) != null){
                String [] wordSplit = line.split(",");
                int id = Integer.parseInt(wordSplit[0]);
                Trainee trainee = new Trainee(id,wordSplit[1],wordSplit[2]);
                trainees.add(trainee);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return trainees;
    }
}
