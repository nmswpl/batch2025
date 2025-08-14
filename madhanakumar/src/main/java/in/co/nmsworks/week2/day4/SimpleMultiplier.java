package in.co.nmsworks.week2.day4;

public class SimpleMultiplier implements Sequence {

    int startingNumber;
    int ratio;

    public SimpleMultiplier(int ratio, int startingNumber) {
        this.ratio = ratio;
        this.startingNumber = startingNumber;
    }

    @Override
    public int next() {
        startingNumber *= ratio;
        return startingNumber;
    }
}
