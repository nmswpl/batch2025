package in.co.nmsworks.week2.day4;

public class Multipiler implements Computable
{

    @Override
    public int compute(int a, int b) {
        System.out.println("Multiple of number:" +a+ " " + b);
        return a*b;
    }
}
