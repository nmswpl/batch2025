package in.co.nmsworks.week.day4;

public class Diveder implements Computable{


    @Override
    public int compute(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        }
        return a / b;
    }
}
