package in.co.nmsworks.week2.day4;

public class SimpleMultiplier implements Sequence {
    int startingNumber;
    int ratio;
    int currentValue=1;
    public SimpleMultiplier(int startingNumber, int ratio) {
        this.startingNumber = startingNumber;
        this.ratio = ratio;
    }

    public int getStartingNumber() {
        return startingNumber;
    }

    public void setStartingNumber(int startingNumber) {
        this.startingNumber = startingNumber;
    }

    public int getRatio() {
        return ratio;
    }

    public void setRatio(int ratio) {
        this.ratio = ratio;
    }

    @Override
    public int next() {
        currentValue=currentValue * ratio;
        return currentValue;
    }
}
