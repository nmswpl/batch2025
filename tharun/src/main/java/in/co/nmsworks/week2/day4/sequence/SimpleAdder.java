package in.co.nmsworks.week2.day4.sequence;

public class SimpleAdder implements Sequence{

    int startingValue, increasedBy ,currentValue = startingValue;

    public SimpleAdder(int startingValue, int increasedBy) {
        this.startingValue = startingValue;
        this.increasedBy = increasedBy;
    }

    
    @Override
    public int next() {
        this.currentValue += this.increasedBy;
        return this.currentValue;
    }
}
