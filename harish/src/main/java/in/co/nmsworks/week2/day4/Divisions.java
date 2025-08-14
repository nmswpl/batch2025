package in.co.nmsworks.week2.day4;

public class Divisions implements Computable{
    @Override
    public int compute(int a, int b) {
        System.out.print("The Division of two numbers " + a + " and " + b +" :");
        return a / b ;
    }
}
