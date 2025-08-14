package in.co.nmsworks.week2.day4;

public class SimpleMultiplier implements Sequence
{
    int start;
    int ratio;
    int curr = 1;

    public SimpleMultiplier(int start, int ratio) {
        this.start = start;
        this.ratio = ratio;
    }

    @Override
    public int next() {
        curr = curr * ratio;
        return curr;
    }
}
