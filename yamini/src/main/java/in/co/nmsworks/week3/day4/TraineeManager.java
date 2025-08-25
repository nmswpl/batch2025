package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TraineeManager {
   static List<Trainee> odd=new ArrayList<>();
   static List<Trainee>even =new ArrayList<>();

    public static void main(String[] args) throws SQLException, IOException {

        TraineeManager tp = new TraineeManager();
        Set<Trainee> resultSet=tp.getFromFile();
        tp.sortAndSave(resultSet);
        TFileWriter tf=new TFileWriter();
        DBWriter dw=new DBWriter();
        //tp.save(tf,odd);
        //tp.save(dw,resultSet);
    }
    public void save(Writer writer, List<Trainee> traineesList) throws SQLException, IOException {
        writer.open();
        writer.write(traineesList);
        writer.close();
    }
    public Set<Trainee> getFromFile() {
        Set<Trainee> traineesSet=new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/tmp/employee.csv"))) {
            String result;
            while ((result = br.readLine()) != null) {
                String[] arr = result.split(",");
                Trainee trainee=new Trainee(Integer.parseInt(arr[0]),arr[1],arr[2]);
                traineesSet.add(trainee);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return traineesSet;

    }
    public void sortAndSave(Set<Trainee> trainees){

        for (Trainee trainee : trainees) {
            if(trainee.getId()%2==0){
                  even.add(trainee);
            }
            else{
                odd.add(trainee);
            }
        }
        System.out.println("Odd List \n"+odd);
        System.out.println("Even List \n"+even);

    }
}
