package in.co.nmsworks.week2.day4.sequence;

public class SimpleAdder implements Sequence{

    int additionSeq = 0;
    @Override
    public int next() {
        this.additionSeq += 2;
        return this.additionSeq;
    }
}
