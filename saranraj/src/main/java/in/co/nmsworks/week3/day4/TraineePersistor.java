package in.co.nmsworks.week3.day4;


import java.io.*;
import java.util.*;

    public class TraineePersistor {

        private Writer TraineeFileWriter;
        private Writer TraineeDbWriter;


        public TraineePersistor() {
        }

        public static void main(String[] args) throws Exception {


            TraineePersistor tp = new TraineePersistor();
            Set<Trainee> setOfTrainee = tp.getFromFile();
            List<Trainee> listOfTrainee = new ArrayList<>(setOfTrainee);
            System.out.println(listOfTrainee);
            listOfTrainee.sort((a, b) -> a.getId() - b.getId());
            tp.sortAndSave(listOfTrainee);

        }

        private void sortAndSave(List<Trainee> listOfTrainee) throws Exception {
            List<Trainee> listOfOddTrainee = new ArrayList<>();
            List<Trainee> listOfEvenTrainee = new ArrayList<>();
            System.out.println(listOfTrainee);

            TraineeFileWriter traineeFileWriter = new TraineeFileWriter();
            TraineeDbWriter traineeDbWriter = new TraineeDbWriter();
            for (Trainee trainee : listOfTrainee) {
                if ((trainee.getId() % 2) == 0) {
                    listOfEvenTrainee.add(trainee);
                    save(traineeFileWriter, listOfEvenTrainee);
                } else {
                    listOfOddTrainee.add(trainee);
                    save(traineeDbWriter, listOfOddTrainee);
                }
            }
        }

        private static void save(Writer writer, List<Trainee> listOfTrainee) throws Exception {
            writer.open();
            writer.write(listOfTrainee);
            writer.close();
        }

        private Set<Trainee> getFromFile() {
            Set<Trainee> listOfMovie = new HashSet<>();

            try (BufferedReader bf = new BufferedReader(new FileReader("/home/nms-training/Downloads/employee.csv"))) {
                String fileDate;
                while ((fileDate = bf.readLine()) != null) {
                    String[] sentence = fileDate.replace("\"", "").split(",");
                    Trainee trainee = new Trainee(Integer.parseInt(sentence[0].trim()), sentence[1].trim(), sentence[2].trim());
                    listOfMovie.add(trainee);
                }

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            return listOfMovie;
        }
    }