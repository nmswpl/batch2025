package in.co.nmsworks.week2.day4;

public class Adder implements Computable{
    @Override
    public int compute(int a, int b) {
        System.out.print("Addition of " + a + " and " + b + " = ");
        return (a+b);
    }
}
