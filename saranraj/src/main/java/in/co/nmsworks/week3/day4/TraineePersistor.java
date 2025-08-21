package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TraineePersistor {




    public static void main(String[] args) {
        TraineePersistor trainee = new TraineePersistor();
        List<Trainee> listOfTrainee = trainee.getFromFile();
        System.out.println(listOfTrainee.toString());
//        trainee.save(Writer,listOfTrainee);


    }


    private List<Trainee> getFromFile() {

      List<Trainee> listOfTrainnes = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/employee.csv"))
        ){
           String word ="";

           while((word=br.readLine())!=null){
               String[] wordSplit=word.split(",");
               int id=Integer.parseInt(wordSplit[0]);
               String name =wordSplit[1];
               String department=wordSplit[2];
               Trainee tp= new Trainee(id,name,department);
               listOfTrainnes.add(tp);
           }

        }catch (Exception e) {
            e.printStackTrace();
        }
        return listOfTrainnes;
    }
}

