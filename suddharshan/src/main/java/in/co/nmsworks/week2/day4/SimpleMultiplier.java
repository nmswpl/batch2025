package in.co.nmsworks.week2.day4;

public class SimpleMultiplier implements Sequence{
    private int startingNumber;
    private int ratio;

    public SimpleMultiplier(int startingNumber, int ratio) {
        this.startingNumber = startingNumber;
        this.ratio = ratio;
    }


    @Override
    public int next() {
        int a = startingNumber;
        startingNumber *= ratio;
        return a;
    }
}
