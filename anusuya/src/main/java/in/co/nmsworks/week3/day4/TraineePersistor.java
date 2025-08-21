package in.co.nmsworks.week3.day4;

import java.io.*;
import java.util.*;

import static java.util.Collections.*;

public class TraineePersistor {

    public static void main(String[] args) {

        TraineePersistor tp = new TraineePersistor();

        Set<Trainee> traineeList = tp.getFromFile();

        List<Trainee> data = new ArrayList<>();
        data.addAll(traineeList);

        TraineeFileWriter tfw = new TraineeFileWriter();
        tp.sortAndSave(tfw,data);

        DbWriter db = new DbWriter();
        tp.sortAndSave(db,data);
    }

    private Set<Trainee> getFromFile() {

        try(BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/employee.txt"))) {

            Set<Trainee> tempTraineeList = new HashSet<>();

            String line;
            while((line = br.readLine()) != null){
                String[] splittedLine = line.split(",");
                if(tempTraineeList.contains(new Trainee(Integer.parseInt(splittedLine[0]),splittedLine[1],splittedLine[2]))){
                    continue;
                }
                else{
                    tempTraineeList.add(new Trainee(Integer.parseInt(splittedLine[0]),splittedLine[1],splittedLine[2]));
                }
            }
            return tempTraineeList;
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void save(Writer writer, List<Trainee> data){
        writer.open();
        writer.write(data);
        writer.close();
    }

    private void sortAndSave(Writer writer,List<Trainee> data){
        List<Trainee> oddList = new ArrayList<>();
        List<Trainee> evenList = new ArrayList<>();
        for (Trainee trainee : data) {
            if(trainee.getId() % 2 == 0){
                evenList.add(trainee);
            }
            else{
                oddList.add(trainee);
            }
        }
        if(writer instanceof TraineeFileWriter){
            save(writer,evenList);
        }
        else{
            save(writer,oddList);
        }
    }
}
