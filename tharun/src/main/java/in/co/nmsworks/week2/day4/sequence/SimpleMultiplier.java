package in.co.nmsworks.week2.day4.sequence;

public class SimpleMultiplier implements Sequence{
    int multiplicationSeq = 1;
    @Override
    public int next() {
        this.multiplicationSeq *= 2;
        return this.multiplicationSeq;
    }
}
