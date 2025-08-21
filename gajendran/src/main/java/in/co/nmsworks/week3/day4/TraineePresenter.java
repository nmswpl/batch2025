package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TraineePresenter
{

    private void save(Writer writer, List<Trainee> traineeList)
    {

        writer.getWrite(traineeList);

    }

    private void sortAndSave(Set<Trainee> traineeSet)
    {
        List<List<Trainee>> oddEvenSplitTrainee = new ArrayList<>();
        List<Trainee> oddList = new ArrayList<>();
        List<Trainee> evenList = new ArrayList<>();

        TraineePresenter traineePresenter = new TraineePresenter();
        for (Trainee trainee : traineeSet)
        {
            if ((trainee.getId() % 2) == 0 )
            {
                evenList.add(trainee);
            }else {
                oddList.add(trainee);
            }
        }


        Writer tFileWriter = new TFileWriter();
        traineePresenter.save(tFileWriter, evenList);
        traineePresenter.save(tFileWriter, oddList);

        Writer tdbWriter = new TDBWriter();
        traineePresenter.save(tdbWriter,oddList);


    }

    private Set<Trainee> getFromFile(String fileName)
    {
        Set<Trainee> traineeSet = new HashSet<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {

            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                String[] tempArray = temp.split(",");
                traineeSet.add(new Trainee(Integer.parseInt(tempArray[0]),tempArray[1],tempArray[2]));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return traineeSet;
    }


    public static void main(String[] args)
    {

        String fileName = "/home/nms-training/Downloads/employee.csv";
        TraineePresenter traineePresenter = new TraineePresenter();

        Set<Trainee> traineeSet = traineePresenter.getFromFile(fileName);


        traineePresenter.sortAndSave(traineeSet);


    }
}
