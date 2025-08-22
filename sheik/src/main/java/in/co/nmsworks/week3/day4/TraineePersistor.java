package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TraineePersistor
{
    public static void main(String[] args) throws IOException, SQLException {
        TraineePersistor tp = new TraineePersistor();
        Set<Trainee> t = tp.getFromFile("/tmp/employee.csv");
        //System.out.println(t.toString());
        List<Trainee> l = new ArrayList<>();
        l.addAll(t);
        tp.sortAndSave(t);

    }

    public Set<Trainee> getFromFile(String file) throws FileNotFoundException {
        Set<Trainee> train = new HashSet<>();
        //Set<Trainee> newTrainee = new HashSet<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file));)
        {
            String line;
            while((line = br.readLine())!=null){
                String[] str = line.split(",");
                Trainee trainee1 =  new Trainee(Integer.parseInt(str[0]),str[1],str[2]);
                if(train.equals(trainee1)){
                    br.readLine();
                }
                else{
                    train.add(trainee1);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return train;
    }
    public void save(Writer writer , List<Trainee> trainee) throws IOException, SQLException {
        writer.open();
        writer.write(trainee);
        writer.close();
    }

    public void sortAndSave(Set<Trainee> trainees) throws IOException, SQLException {
        List<Trainee> oddList = new ArrayList<>();
        List<Trainee> evenList = new ArrayList<>();
        for (Trainee trainee : trainees) {
            if(trainee.getId()%2==0){
                evenList.add(trainee);
            }
            else{
                oddList.add(trainee);
            }



        }
        TraineeFileWritter tfw = new TraineeFileWritter();
        save(tfw,evenList);

        DbWriter dbw = new DbWriter();
        save(dbw,oddList);

    }
}
