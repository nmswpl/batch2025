package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class TraineePersistor {
    public static void main(String[] args) throws SQLException, IOException {
        
        TraineePersistor tp = new TraineePersistor();
        Set<Trainee> traineeSet= tp.getFromFile("/home/nms-training/Downloads/employee.csv");


       List<Trainee> traineeList = new ArrayList<>();
       traineeList.addAll(traineeSet);

       tp.sortAndSave(traineeList);


    }

    private Set<Trainee> getFromFile(String fileName) {
        Set<Trainee> set = new LinkedHashSet<>();
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line ;
            while((line = br.readLine() ) != null){
                String[] line1 = line.split(",");
                Trainee t = new Trainee(Integer.parseInt(line1[0]),line1[1],line1[2]);
                set.add(t);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return set;
    }

    public  static void save(Writer writer ,  List<Trainee> list) throws IOException, SQLException {
        writer.open();
        writer.write(list);
        writer.close();
    }

    public void sortAndSave(List<Trainee> traineeList) throws SQLException, IOException {
        List<Trainee> oddList = new ArrayList<>();
        List<Trainee> evenList = new ArrayList<>();

        for(Trainee t : traineeList){
            if(t.getId() % 2 != 0){
                oddList.add(t);
            }
            else{
               evenList.add(t);
            }

        }
        TraineeFileWriter tfw = new TraineeFileWriter();
        save(tfw , oddList);

        DbWriter dw = new DbWriter();
        save(dw , evenList);

    }


}



