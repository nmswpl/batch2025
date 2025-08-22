package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class TraineePersistor {

    public static void main(String[] args)
    {
        TraineePersistor tp =new TraineePersistor();

        String filename = "/tmp/employee.txt";

        Set<Trainee> traineeSet= tp.getFromFileAsSet(filename);
        System.out.println();

        try {
            tp.sortAndSave(traineeSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private void sortAndSave(Set<Trainee> traineeSet) throws SQLException {

        List<Trainee> OddTraineeList = new ArrayList<>();

        List<Trainee> evenTraineeList = new ArrayList<>();

        for (Trainee trainee : traineeSet) {

            if(trainee.getId()%2==0)
                evenTraineeList.add(new Trainee(trainee.getId(),trainee.getName(),trainee.getDept()));
            else
                OddTraineeList.add(new Trainee(trainee.getId(),trainee.getName(),trainee.getDept()));

        }

        Writer TFwriter = new TraineeFileWriter("/tmp/employee2.txt");

        Writer DBwriter = new DBWriter();


        try {
            save(TFwriter,OddTraineeList);
            save(DBwriter,evenTraineeList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void save(Writer writer, List<Trainee> traineeList) throws SQLException, IOException {
        writer.open();
        writer.write(traineeList);
        writer.close();

    }

    public Set<Trainee> getFromFileAsSet(String filename)
    {
        Set<Trainee> traineeSet = new HashSet<>();
        try (BufferedReader bf = new BufferedReader(new FileReader(filename))) {

            String res;
            while ((res=bf.readLine())!=null)
            {
                String[] arr = res.split(",");
                traineeSet.add(new Trainee(Integer.parseInt(arr[0]),arr[1],arr[2]));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return traineeSet;
    }

}
