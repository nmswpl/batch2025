package in.co.nmsworks.weeks.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TraineeFileWriter implements Writer {
    private BufferedWriter writer;

    @Override
    public void open() {
        try {
            writer = new BufferedWriter(new FileWriter("odd_trainees.txt"));
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
    }

    @Override
    public void write(List<Trainee> trainees) {
        try {
            for (Trainee t : trainees) {
                writer.write(t.toString());
                writer.newLine();
            }
            System.out.println("File write completed");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    @Override
    public void close() {
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            System.out.println("Error closing file" + e.getMessage());
        }
    }
}
