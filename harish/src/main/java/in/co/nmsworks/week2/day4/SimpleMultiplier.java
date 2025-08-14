package in.co.nmsworks.week2.day4;

public class SimpleMultiplier implements Sequence {
    @Override
    public int next(int startNumber, int step) {
        return startNumber * step ;
    }
}
