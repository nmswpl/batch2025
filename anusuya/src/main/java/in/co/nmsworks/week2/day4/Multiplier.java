package in.co.nmsworks.week2.day4;

public class Multiplier implements Computable{
    @Override
    public int compute(int a, int b) {
        System.out.print("Mulitplication of " + a + " and " + b + " = ");
        return (a*b);
    }
}
