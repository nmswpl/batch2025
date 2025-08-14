package in.co.nmsworks.week2.day1.day4;

public class SimpleAdder implements Sequence{

    private int startingNumber;
    private int step;


    public SimpleAdder(int startingNumber, int step) {
        this.startingNumber = startingNumber;
        this.step = step;
    }

    public SimpleAdder() {
    }

    @Override
    public int next() {

        return startingNumber=startingNumber+step;
    }
}
