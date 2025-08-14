package in.co.nmsworks.week2.day4;

public class Divider implements Computable{
    @Override
    public int compute(int a, int b) {

        if (b == 0){
            System.out.println("Divisor Should not be Zero");
            return 0;
        }
        return a/b;
    }
}
