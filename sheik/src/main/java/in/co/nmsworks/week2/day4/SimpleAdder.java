package in.co.nmsworks.week2.day4;

public class SimpleAdder implements Sequence
{
    int start;
    int step;
    int curr = start;

    public SimpleAdder(int start, int step) {
        this.start = start;
        this.step = step;
    }

    @Override
    public int next() {
        curr = curr + step;
        return curr;
    }
}
