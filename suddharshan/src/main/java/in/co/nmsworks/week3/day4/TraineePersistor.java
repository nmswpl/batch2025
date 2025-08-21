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
        Set <Trainee> trainees = traineePersistor.getFromFile("/home/nms-training/Downloads/employee.csv");
        System.out.println(trainees.size());
        traineePersistor.sortAndSave(trainees);
    }
    public Set<Trainee> getFromFile(String fileName){
       Set <Trainee> trainees = new HashSet<>();
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String str, res = "";
            while((str = br.readLine()) != null){
                res = (res + str + "\n");
            }
            String rowData [] = res.split("\n");
            for (String rowDatum : rowData) {
               String data [] = rowDatum.split(",");
               Trainee t = new Trainee(Integer.parseInt(data[0]),data[1],data[2]);
               trainees.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return trainees;
    }
    
    public void save(Writer wr, List <Trainee> trainees){
        wr.open();
        wr.write(trainees);
        wr.close();
    }
    
    public void sortAndSave(Set <Trainee> trainees){
        List <Trainee> oddList = new ArrayList<>();
        List <Trainee> evenList = new ArrayList<>();
        for (Trainee trainee : trainees) {
            if(trainee.getId() % 2 == 0){
                evenList.add(trainee);
            }
            else{
                oddList.add(trainee);
            }
        }
        TFileWriter tfw = new TFileWriter();
        DBWriter dbw = new DBWriter();
        save(dbw,oddList);
        save(tfw,evenList);
    }
}
