package in.co.nmsworks.week2.day4;

public class Adder implements Computable{

    @Override
    public int compute(int a, int b) {
        System.out.println("Addition of:" +a+ " " + b);
        return a+b;
    }
}
