package in.co.nmsworks.weeks.day4;

public class SimpleAdder implements Sequence {
    private int current;
    private int step;
    public SimpleAdder(int startingNumber, int step) {
        this.current = startingNumber;
        this.step = step;
    }

    @Override
    public int next() {
        int value = current;
        current += step;
        return value;
    }
}
