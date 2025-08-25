package in.co.nmsworks.week2.day4;

public class Multiplier implements  Computable{
    int startingNumber = 3 ;
    int ratio = 2 ;
    @Override
    public int compute(int a, int b) {
        return a * b ;
    }
}
