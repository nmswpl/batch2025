package in.co.nmsworks.week2.day1.day4;

public class SimpleMultiplier implements Sequence{

    private int startingNumber;
    private int step;

    public SimpleMultiplier(int startingNumber, int step) {
        this.startingNumber = startingNumber;
        this.step = step;
    }

    public SimpleMultiplier() {
    }

    @Override
    public int next() {
        return startingNumber=startingNumber*step;
    }
}
