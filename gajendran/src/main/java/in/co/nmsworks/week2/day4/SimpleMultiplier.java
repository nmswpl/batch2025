package in.co.nmsworks.week2.day4;

public class SimpleMultiplier implements Sequence{

    int startingNumber;
    int ratio;

    @Override
    public int next() {
        int temp = startingNumber;
        startingNumber *= ratio;
        return temp;

    }

    public SimpleMultiplier(int startingNumber, int ratio) {
        this.startingNumber = startingNumber;
        this.ratio = ratio;
    }
}
