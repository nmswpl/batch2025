package in.co.nmsworks.week2.day4;

public class Divider implements Computable
{

    @Override
    public int compute(int a, int b) {
        System.out.println("Divisible of num:" +a+ " " + b);
        if(b!=0) {
            return a / b;
        }
        return 0;
    }
}
