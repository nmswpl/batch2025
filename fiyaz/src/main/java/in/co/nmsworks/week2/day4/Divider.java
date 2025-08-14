package in.co.nmsworks.week2.day4;

public class Divider implements Computable {

    @Override
    public int compute(int a, int b) {
        if (b > 0) {
            return a / b;
        }
        else {
            System.out.println("Enter number greater than 0 for b : ");
            return b;
        }
    }
}
