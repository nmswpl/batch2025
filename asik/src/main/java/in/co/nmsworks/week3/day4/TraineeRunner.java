package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TraineeRunner
{
    public static void main(String[] args)
    {
        TraineeRunner tr = new TraineeRunner();

        Set<TraineePersister> trainees = tr.getFromFile();
        List<TraineePersister> traineesList = new ArrayList<>(trainees);

        TraineeFileWriter tfw = new TraineeFileWriter();
        tfw.setFileName("/home/nms-training/Downloads/Trainee.txt");
        tr.save(tfw, traineesList);

        /*tr.sortAndSave(traineesList);*/
    }

    private void sortAndSave(List<TraineePersister> traineesList)
    {
        Collections.sort(traineesList);
        List<TraineePersister> odd = new ArrayList<>();
        List<TraineePersister> even = new ArrayList<>();

        for (TraineePersister trainee : traineesList)
        {
            if (trainee.getId() % 2 == 0)
            {
                even.add(trainee);
            }
            else
            {
                odd.add(trainee);
            }
        }

        DbWriter dbw = new DbWriter();
        dbw.open();
        dbw.write(odd);
        dbw.close();

        TraineeFileWriter tfwe = new TraineeFileWriter();
        tfwe.setFileName("/home/nms-training/Downloads/TraineeEven.txt");
        save(tfwe, even);
    }

    private void save(TraineeFileWriter tfw, List<TraineePersister> traineesList)
    {
        tfw.open();
        tfw.write(traineesList);
        tfw.close();
    }

    private Set<TraineePersister> getFromFile()
    {
        Set<TraineePersister> trainees = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/employee(in).csv")))
        {
            String line;
            while((line = br.readLine()) != null)
            {
                String[] strArr = line.split(",");
                TraineePersister trainee = new TraineePersister();
                trainee.setId(Integer.parseInt(strArr[0].replace("\"", "").trim()));
                trainee.setName(strArr[1].replace("\"", "").trim());
                trainee.setDept(strArr[2].replace("\"", "").trim());
                trainees.add(trainee);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return trainees;
    }
}
