package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TraineePersister {
    public static void main(String[] args) throws IOException {
        TraineePersister tp = new TraineePersister();
        TraineeDbWriter tbw = new TraineeDbWriter();
        Set<Trainee> setOfTrainees = tp.getFromFile();
        for (Trainee trainee : setOfTrainees) {
            System.out.println(trainee);
        }
        tp.sortAndSave(setOfTrainees);
    }

    private void sortAndSave(Set<Trainee> setOfTrainnes) {
        List<Trainee> evenList = new ArrayList<>();
        List<Trainee> oddlist = new ArrayList<>();

        for (Trainee i : setOfTrainnes) {
            if(i.getId()%2 == 0)
            {
                evenList.add(i);
            }
            else
            {
                oddlist.add(i);
            }
        }
        Writer w = new TraineeDbWriter();
        Writer fw = new TraineeFileWriter();
        save(w,oddlist);
        save(fw,evenList);
    }

    private void save(Writer w, List<Trainee> list) {
        w.open();
        w.write(list);
        w.close();
    }


    private Set<Trainee> getFromFile() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("/home/nms-training/Downloads/employee.csv"));
        String line;
        Set<Trainee> listTrainee = new HashSet<>();
        while ((line = bf.readLine()) != null)
        {
            String[] arr = line.split(",");
            Trainee trainee = new Trainee(Integer.parseInt(arr[0]),arr[1],arr[2]);
            listTrainee.add(trainee);
        }
        return listTrainee;
    }
}
