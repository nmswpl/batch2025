package in.co.nmsworks.week2.day4;

public class SimpleAdder implements Sequence{
    private int startingNumber;
    private int step;


    public SimpleAdder(int startingNumber, int step) {
        this.startingNumber = startingNumber;
        this.step = step;
    }

    @Override
    public int next() {
        int a = startingNumber;
        startingNumber += step;
        return a;
    }
}
