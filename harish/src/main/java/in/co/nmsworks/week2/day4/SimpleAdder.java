package in.co.nmsworks.week2.day4;

public class SimpleAdder implements Sequence {
    static int num;
    @Override
    public int next(int startNumber, int step) {
        return startNumber + step ;
    }
}
