package in.co.nmsworks.week2.day4;

public class SimpleAdder implements Sequence {

    int startingNumber;
    int step;

    public SimpleAdder(int startingNumber, int step) {
        this.startingNumber = startingNumber;
        this.step = step;
    }

    @Override
    public int next() {
        return startingNumber++;
    }
}
