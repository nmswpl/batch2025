package in.co.nmsworks.weeks.day4;

import java.util.List;

public class TraineeDBWriter implements Writer {
    @Override
    public void open() {

        System.out.println("DB connection opened");
    }

    @Override
    public void write(List<Trainee> trainees) {
        for (Trainee t : trainees) {
            System.out.println("Writing to DB: " + t);
        }
        System.out.println("DB write completed");
    }

    @Override
    public void close() {

        System.out.println("DB connection closed");
    }
}
