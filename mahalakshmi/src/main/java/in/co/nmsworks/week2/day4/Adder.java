package in.co.nmsworks.week2.day4;

public class Adder implements Computable {

    @Override
    public int compute(int a, int b) {
        return a + b;
    }
}

class Multiplier implements Computable {

    @Override
    public int compute(int a, int b) {
        return a*b;
    }
}

class Divider implements Computable {

    @Override
    public int compute(int a, int b) {
        if(b == 0) {
            System.out.println("Division by Zero Error!!");
            return 0;
        }
        return a/b;
    }
}