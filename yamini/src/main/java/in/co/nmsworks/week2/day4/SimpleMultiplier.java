package in.co.nmsworks.week2.day4;

public class SimpleMultiplier implements Sequence{
    private  int start;
    private int ratio;

    public SimpleMultiplier(int start, int ratio) {
        this.start = start;
        this.ratio=ratio;

    }

    @Override
    public int next() {
        return start++ * ratio;
    }
}
