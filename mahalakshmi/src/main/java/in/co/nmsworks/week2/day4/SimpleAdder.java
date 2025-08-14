package in.co.nmsworks.week2.day4;

public class SimpleAdder implements Sequence {

    private int step;
    private int value;

    public SimpleAdder(int startingNumber, int step) {
        this.value = startingNumber;
        this.step = step;
    }

    @Override
    public int next() {
        int current  = value;
        value = value + step;
        return current;
    }
}

class SimpleMultiplier implements Sequence {
    private int ratio;
    private int value;

    public SimpleMultiplier(int startingNumber, int ratio) {
        this.value = startingNumber;
        this.ratio = ratio;
    }

    @Override
    public int next() {
        int current = value;
        value = value * ratio;
        return current;
    }
}
