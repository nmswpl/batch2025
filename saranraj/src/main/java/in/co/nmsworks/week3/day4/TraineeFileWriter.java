package in.co.nmsworks.week3.day4;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

    public class TraineeFileWriter implements Writer {

        private BufferedWriter bufferedWriter;
        private FileWriter fileWriter;


        @Override
        public void open() {
            try {
                fileWriter = new FileWriter("/home/nms-training/Downloads/NewEmployees.csv");
                bufferedWriter = new BufferedWriter(fileWriter);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void write(List<Trainee> listOfTrainee) throws IOException {

            for (Trainee trainee : listOfTrainee) {
                String traineeList = trainee.getId() + "," + trainee.getName() + "," + trainee.getDepartment();
                bufferedWriter.write(traineeList);
                bufferedWriter.newLine();
                bufferedWriter.flush();

            }


        }

        @Override
        public void close() {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }