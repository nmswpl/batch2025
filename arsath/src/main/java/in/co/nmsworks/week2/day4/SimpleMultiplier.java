package in.co.nmsworks.week2.day4;

public class SimpleMultiplier implements Sequence {
    private int startingNumber;
    private int step;
    private int current = 1;

    public SimpleMultiplier(int startingNumber, int step) {
        this.startingNumber = startingNumber;
        this.step = step;
    }

    public int getStartingNumber() {
        return startingNumber;
    }

    public void setStartingNumber(int startingNumber) {
        this.startingNumber = startingNumber;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    @Override
    public int next() {
        current *= step;
        return current;
    }
}
