package in.co.nmsworks.weeks.day4;

public class SimpleMultifier implements Sequence{
    private int current;
    private int ratio;

    public SimpleMultifier(int startingNumber, int ratio) {
        this.current = startingNumber;
        this.ratio = ratio;
    }
    @Override
    public int next() {
        int value = current;
        current *= ratio;
        return value;

    }
}
